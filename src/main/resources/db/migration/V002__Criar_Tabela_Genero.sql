Create Table Genero(
    id bigint not null primary key auto_increment,
    descricao varchar(150)
);

insert into genero(descricao) values ('Ação');
insert into genero(descricao) values ('Romance');
insert into genero(descricao) values ('Comedia');
insert into genero(descricao) values ('Aventura');

