alter table filme add constraint FK_Filme_Genero foreign key(generoid) references genero(id);
alter table filme add constraint FK_Filme_Ator foreign key(atorid) references ator(id);

insert into filme(nomefilme, generoid, atorid) values ('Batman', 1, 1);
insert into filme(nomefilme, generoid, atorid) values ('Barraca do beijo', 2, 2);
insert into filme(nomefilme, generoid, atorid) values ('Bad Boys', 3, 3);
insert into filme(nomefilme, generoid, atorid) values ('Pantera Negra,', 4, 4);

