create database hengerSzam;

grant all privileges
on hengerSzam.*
to 'Szakall'@'localhost'
identified by 'sajtosStangli';

use hengerSzam;

create table numbers (
id int not null primary key auto_increment,
radius double,
length double,
surface double
);