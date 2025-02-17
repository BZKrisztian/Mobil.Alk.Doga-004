create database hengerSzam;

grant all privileges
on hengerSzam.*
to hengerSzam@localhost
identified by 'secRet';

use hengerSzam;

create table hengerSzam (
id int not null primary key auto_increment,
radius double,
length double,
surface double
);