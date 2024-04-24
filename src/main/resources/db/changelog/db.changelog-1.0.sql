--liquibase formatted sql

--changeset shakratsanzhar:1
CREATE TABLE IF NOT EXISTS users
(
    id BIGSERIAL PRIMARY KEY,
    login VARCHAR(255) NOT NULL UNIQUE ,
    password VARCHAR(255) NOT NULL,
    full_name VARCHAR(255) NOT NULL,
    avatar VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL
);

--changeset shakratsanzhar:2
CREATE TABLE IF NOT EXISTS request
(
    id BIGSERIAL PRIMARY KEY,
    item VARCHAR(255) NOT NULL,
    amount BIGINT NOT NULL,
    delivery_address VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL
);