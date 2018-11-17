package com.dhm.recursion;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/11/6 9:39
 */
@Slf4j
public class FileRecursion {
    public static void main(String[] args) {
        getFiles(new File("E:\\home"));
    }

    private static void getFiles(File file){
        //判断是否是文件
        if(file.isFile()){
            log.info("文件：{}",file.getAbsolutePath());
        }else{
            for(File f:file.listFiles()){
                //递归遍历下层
                getFiles(f);
            }
            log.info("文件夹：{}\n",file.getAbsolutePath());
        }
    }
}