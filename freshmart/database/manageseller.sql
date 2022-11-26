drop database if exists manageseller;
create database manageseller;
use manageseller;
create table seller(
	seller_id int auto_increment primary key,
	seller_name varchar(30) not null,
	password varchar(30) not null,
    gender varchar(30) not null
);
select * from seller;
