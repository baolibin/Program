package libin.program._01_java.datebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Copyright (c) 2018/09/24. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class JDBCOp {
    //定义MySQL的数据库驱动程序
    private static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    //定义MySQL数据库的连接地址
    private static final String DBURL = "jdbc:mysql://localhost:3306/OLED";
    //MySQL数据库的连接用户名
    private static final String DBUSER = "root";
    //MySQL数据库的连接密码
    private static final String DBPASS = "xxx";

    public static void main(String[] args) {
        Connection conn = null;  // 数据库连接
        try {
            Class.forName(DBDRIVER);// 加载驱动程序
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            JDBCOp jdbcOp = new JDBCOp();
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            jdbcOp.insertOp(conn);  // 插入操作
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(conn); // 如果此时可以打印表示连接正常
        try {
            assert conn != null;
            conn.close();// 数据库关闭
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 插入操作
     */
    private void insertOp(Connection conn) throws Exception {
        Statement stmt = null; // 数据库操作
        String sql = "INSERT INTO users(name,password,age,sex,birthday) VALUES ('张三','www.zhangsan.cn',34,'男','2000-02-24')";
        stmt = conn.createStatement(); // 实例化Statement对象
        stmt.executeUpdate(sql); // 执行数据库更新操作
        stmt.close();
    }

    // 其它操作具体见博客地址：https://blog.csdn.net/baolibin528/article/details/37572619
}
