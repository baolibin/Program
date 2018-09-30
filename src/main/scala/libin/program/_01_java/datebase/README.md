## JDBC连接数据库
##### 准备工作
    Mysql数据库名字为OLED，所用表为users，端口号3306。

    创建数据库：
    create database OLED;
    
    创建表：
    CREATE TABLE user(
        id          INT             AUTO_INCREMENTPRIMARY KEY ,
        name        VARCHAR(30)     NOT NULL ,
        password    VARCHAR(32)     NOT NULL ,
        age         INT             NOTNULL ,
        sex         VARCHAR(2)      DEFAULT '男' ,
        birthday    DATE
    ) ;
    
    插入数据：
    INSERT INTOuser(name,password,age,sex,birthday) VALUES ('张三','www.zhangsan.cn',34,'男','2000-02-24') ;
    INSERT INTOuser(name,password,age,sex,birthday) VALUES ('李四','www.lisi.cn',35,'男','2002-03-12') ;
