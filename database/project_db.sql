CREATE DATABASE project_db;
use project_db;
CREATE TABLE  role(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    name NVARCHAR(255) NOT NULL,
    code NVARCHAR(255) NOT NULL,
    createddate TIMESTAMP,
    modifieddate TIMESTAMP,
    createdby NVARCHAR(255),
    modifiedby NVARCHAR(255)
);

CREATE TABLE user(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    roleid bigint NOT NULL,
    username VARCHAR(150) NOT NULL,
    password VARCHAR(150) NOT NULL,
    fullname VARCHAR(150) NULL,
    status int NOT NULL,
    createddate TIMESTAMP,
    modifieddate TIMESTAMP,
    createdby NVARCHAR(255),
    modifiedby NVARCHAR(255)
);

ALTER TABLE user ADD CONSTRAINT fk_user_role FOREIGN KEY (roleid) REFERENCEs role(id);

CREATE TABLE news(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	title NVARCHAR(255),
	thumbnail NVARCHAR(255),
	shortdescription TEXT,
	content TEXT,
	categoryid bigint NOT NULL,
	createddate TIMESTAMP,
    modifieddate TIMESTAMP,
    createdby NVARCHAR(255),
    modifiedby NVARCHAR(255)
);

CREATE TABLE category(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	name NVARCHAR(255) NOT NULL,
	code NVARCHAR(255),
	createddate TIMESTAMP,
    modifieddate TIMESTAMP,
    createdby NVARCHAR(255),
    modifiedby NVARCHAR(255)
);

ALTER TABLE news ADD CONSTRAINT fk_new_category FOREIGN KEY (categoryid) REFERENCES category(id);

CREATE TABLE comment(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	content TEXT NOT NULL,
	user_id bigint NOT NULL,
	new_id bigint NOT NULL,
	createddate TIMESTAMP,
    modifieddate TIMESTAMP,
    createdby NVARCHAR(255),
    modifiedby NVARCHAR(255)
);

ALTER TABLE comment ADD CONSTRAINT fk_comment_user FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE comment ADD CONSTRAINT fk_comment_news FOREIGN KEY (new_id) REFERENCES news(id);