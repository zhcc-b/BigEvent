package com.zhcc.controller;

import com.zhcc.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

//@RestController
//public class FileUploadController {
//
//    @PostMapping("/upload")
//    public Result<String> upload(MultipartFile file) throws IOException {
//        //把文件内容存到本地磁盘
//        String originalFilename = file.getOriginalFilename();
//        //保证文件名字唯一
//        String filename= UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
//        file.transferTo(new File("/Users/hsz/Downloads/Java_practice/SpringBoot/bigEventFiles/"+filename));
//        return Result.success(filename);
//    }
//}
@RestController
public class FileUploadController {

    private static final String UPLOAD_DIR = "/Users/hsz/Downloads/Java_practice/SpringBoot/bigEventFiles/";

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) {
        if (file.isEmpty()) {
            return Result.error("文件为空");
        }

        String filename = UUID.randomUUID() + getFileExtension(file.getOriginalFilename());

        try (InputStream inputStream = file.getInputStream();
             OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(
                     new File(UPLOAD_DIR, filename)
             ))) {

            byte[] buffer = new byte[1024 * 1024]; // 1MB 缓冲区
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return Result.success(filename);

        } catch (IOException e) {
            return Result.error("上传失败：" + e.getMessage());
        }
    }

    private String getFileExtension(String filename) {
        return filename.substring(filename.lastIndexOf("."));
    }
}

