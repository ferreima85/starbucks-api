create table bebidas(
    id bigint not null auto_increment,
    name varchar(50) not null,
    primary key(id)
);

insert into bebidas(id, name) values(1, 'Cafe');
insert into bebidas(id, name) values(2, 'cha');
insert into bebidas(id, name) values(3, 'Agua');