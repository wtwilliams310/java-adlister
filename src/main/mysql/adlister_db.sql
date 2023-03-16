DROP DATABASE IF EXISTS adlister_db;

CREATE DATABASE adlister_db;

USE adlister_db;

CREATE TABLE users (
    id int UNSIGNED NOT NULL auto_increment,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id int UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id int UNSIGNED,
    title VARCHAR(100),
    description VARCHAR(500),
    FOREIGN KEY (user_id) REFERENCES users(id)
);