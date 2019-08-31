//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.generate;

import org.springframework.beans.factory.annotation.Value;

public class ConfigAllParam {
    public static String datasource = "localhost";
    public static String port = "3306";
    public static String database = "test2";
    public static String username = "root";
    public static String password = "root";
    public static   String springDatasourceUrl = "jdbc:mysql://" + datasource + ":" + port + "/" + database + "?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&serverTimezone=UTC";
    public static   String driver = "com.mysql.jdbc.Driver";
    public static String  package1 = "com.example.demo";
    @Value(value="${spring.datasource.url}")
    public static  String a;

    public static void main(String[] args) {

        System.out.println(ConfigAllParam.a);
    }





}
