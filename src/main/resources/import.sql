insert into cliente (id,nome,sobrenome,cpf,email,data_criacao,data_atualizacao) values (1,'Sandro', 'Carvalho do Nascimento','065.309.420-50','teste@gmail.com','2021-06-17 12:00:00', '2021-06-17 12:00:00')

insert into cliente (id,nome,sobrenome,cpf,email,data_criacao,data_atualizacao) values (2,'Gabriel', 'Almeida','241.241.300-23','teste2@gmail.com','2021-06-17 14:00:00', '2021-06-17 14:00:00')

insert into endereco (id,rua,cep,bairro,numero,cidade,estado,data_criacao,data_atualizacao, cliente_id) values (1,'Rua Ana Camarao', '24.436-810','Camarão',149,'São Gonçalo','RJ','2021-06-17 12:00:00', '2021-06-17 12:00:00',1)

insert into endereco (id,rua,cep,bairro,numero,cidade,estado,data_criacao,data_atualizacao, cliente_id) values (2,'Rua Joao', '24.436-800','Camarão',200,'São Gonçalo','RJ','2021-06-17 14:00:00', '2021-06-17 14:00:00',1)

insert into endereco (id,rua,cep,bairro,numero,cidade,estado,data_criacao,data_atualizacao, cliente_id) values (3,'Rua Coronel', '24.436-899','Centro',500,'São Gonçalo','RJ','2021-06-17 12:00:00', '2021-06-17 12:00:00',2)

insert into endereco (id,rua,cep,bairro,numero,cidade,estado,data_criacao,data_atualizacao, cliente_id) values (4,'Rua Almeida', '24.436-577','Paraiso',200,'São Gonçalo','RJ','2021-06-17 14:00:00', '2021-06-17 14:00:00',2)

insert into telefone (id,numero,data_criacao,data_atualizacao, cliente_id) values (1,'21-9-9999-9999','2021-06-17 12:00:00', '2021-06-17 12:00:00',1)

insert into telefone (id,numero,data_criacao,data_atualizacao, cliente_id) values (2,'21-9-9999-8888','2021-06-17 12:00:00', '2021-06-17 12:00:00',1)

insert into telefone (id,numero,data_criacao,data_atualizacao, cliente_id) values (3,'21-9-9933-9999','2021-06-17 12:00:00', '2021-06-17 12:00:00',2)

insert into telefone (id,numero,data_criacao,data_atualizacao, cliente_id) values (4,'21-9-9944-8888','2021-06-17 12:00:00', '2021-06-17 12:00:00',2)