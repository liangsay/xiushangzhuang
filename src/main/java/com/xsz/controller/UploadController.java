package com.xsz.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.File;
import java.io.IOException;

/**
 * Created by liujinliang on 2017/8/9.
 */
@Controller
public class UploadController {

//
//    /**
//     * 添加转向到upload页面的ViewController
//     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
//        registry.addViewController("/index").setViewName("/index");
//        registry.addViewController("/toUpload").setViewName("/upload");
//    }
//
//    @Bean
//    public MultipartResolver multipartResolver() {
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setMaxUploadSize(1000000);
//        return multipartResolver;
//    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("/"+file.getOriginalFilename()),file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}
