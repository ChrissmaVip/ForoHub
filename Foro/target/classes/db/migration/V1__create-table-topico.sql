create table topico (
    id bigserial not null,
    titulo varchar(100) not null unique,
    mensaje varchar(100) not null unique,
    fecha_de_creacion date unique ,
    estado_del_topico boolean ,
    autor varchar(20) not null,
    curso varchar(20) not null,
    primary key (id)
);