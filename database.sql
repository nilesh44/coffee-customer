
create database coffee_store;

use coffee_store;

create table products(
product_id int auto_increment primary key,
name varchar(30),
origin varchar(30),
price decimal(3,2)
);

create table customers(
cust_id int auto_increment primary key,
first_name varchar(30),
last_name varchar(30),
mob_num varchar(10)
);

 create table orders(
 order_id int auto_increment primary key,
 product_id int,
 cust_id int,
 order_time datetime,
 foreign key(product_id) references products(product_id),
 foreign key(cust_id) references customers(cust_id)
 );
 
 show tables;
 
 commit;
