CREATE DATABASE pod;

CREATE TABLE pod.public.pessoa(
   id serial, 
   nome varchar(80) NOT NULL, 
   email varchar(80) NOT NULL
);
CREATE TABLE pod.public.email(
   id serial,
   remetente varchar(80) NOT NULL,
   destinatarios varchar NOT NULL,
   assunto varchar(80),
   mensagem text
);
