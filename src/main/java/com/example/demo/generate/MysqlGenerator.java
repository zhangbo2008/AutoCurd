//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.generate;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlGenerator {
    public MysqlGenerator() {
    }

    public static void main(String[] args) throws IOException {
        fun1();
    }

    public static String fun(int a, int b, RandomUtils.TYPE type) throws IOException {
        return "INSERT INTO user (name, age)VALUES ('" + RandomUtils.getRandom(a,
                RandomUtils.TYPE.CAPITAL) + '\'' + "," + '\'' +
                RandomUtils.getRandom(b, RandomUtils.TYPE.NUMBER) + '\'' + ")";
    }

    public static void fun1() throws IOException {
        System.out.println(111111);
        System.out.println(ConfigAllParam.springDatasourceUrl);
        Statement stmt = null;
        Connection con = null;

        try {
            Class.forName(ConfigAllParam.driver);
        } catch (ClassNotFoundException var6) {
            var6.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(ConfigAllParam.springDatasourceUrl, ConfigAllParam.username, ConfigAllParam.password);
            stmt = con.createStatement();
            stmt = con.createStatement();
            String sql3 = "DROP TABLE IF EXISTS `user`;";
            String sql1 = "CREATE TABLE user (id INTEGER NOT NULL AUTO_INCREMENT COMMENT '自增id',  name varchar(100) DEFAULT NULL COMMENT '名字',  age int    DEFAULT '1' COMMENT '年龄',  PRIMARY KEY (`id`)) ENGINE=InnoDB  DEFAULT CHARSET=utf8;";
            System.out.println(sql1);
            stmt.executeUpdate(sql3);
            stmt.executeUpdate(sql1);
            System.out.println(fun(3, 2, RandomUtils.TYPE.CAPITAL));
            stmt.executeUpdate(fun(3, 2, RandomUtils.TYPE.CAPITAL));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));
            System.out.println(fun(2, 2, RandomUtils.TYPE.NUMBER));

            System.out.println("已经写入数据");
        } catch (SQLException var5) {
            var5.printStackTrace();
        }//

        System.out.println(con);

        try {
            stmt.close();
            con.close();
        } catch (SQLException var4) {
            var4.printStackTrace();
        }

    }
}
