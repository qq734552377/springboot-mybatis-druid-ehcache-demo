CREATE DATABASE `springbootdb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


create table city(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	province_id varchar(100),
	city_name varchar(50),
	description TEXT
) default charset=utf8;

insert into city (id,province_id,city_name,description) values (1,"安徽省","六安市","这是一个美丽的城市，没有重工业的污染！");


set  character_set_client=gbk;
set  character_set_connection=gbk;
set  character_set_results=gbk;
set  character_set_database=gbk;
set  character_set_server=gbk;
show variables like '%char%';