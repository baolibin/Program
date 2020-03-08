# 使用IDEA SQL插件，自动连接本地数据库test
use test;
show tables;

create table if not exists person(name varchar(100),age int)
insert into person values('hadoop',12)
select * from person;
