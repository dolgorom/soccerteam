

create table Player (
	id identity,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	country varchar(30) not null,
	age int not null,
	position varchar(30) not null,
	goals int not null,
  bookings int not null,
  salary DOUBLE not null

);


create table Trainer (

	first_name varchar(30) not null,
	last_name varchar(30) not null,
	age int not null,
  salary DOUBLE not null

);