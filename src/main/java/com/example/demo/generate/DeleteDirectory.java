//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.generate;

import java.io.File;

public class DeleteDirectory {
    public DeleteDirectory() {
    }

    public static void main(String[] args) {
        File file = new File("D:\\zhangbo340\\Desktop\\新建文件夹 (4)\\autocurd\\src\\main\\java\\");
        delAllFile(file);
    }

    public static void delAllFile(File directory) {
        if (!directory.isDirectory()) {
            directory.delete();
        } else {
            File[] files = directory.listFiles();
            if (files.length == 0) {
                directory.delete();
                System.out.println("删除" + directory.getAbsolutePath());
                return;
            }

            File[] var2 = files;
            int var3 = files.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                File file = var2[var4];
                if (file.isDirectory()) {
                    delAllFile(file);
                } else {
                    file.delete();
                    System.out.println("删除" + file.getAbsolutePath());
                }
            }

            directory.delete();
            System.out.println("删除" + directory.getAbsolutePath());
        }

        System.out.println("over");
    }
}
