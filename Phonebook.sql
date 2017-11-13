DROP SCHEMA IF EXISTS phonebook ;
CREATE SCHEMA IF NOT EXISTS phonebook DEFAULT CHARACTER SET utf8 ;
USE phonebook ;

DROP TABLE IF EXISTS phonebook.contacts ;
DROP TABLE IF EXISTS phonebook.users;


CREATE TABLE IF NOT EXISTS phonebook.users  (

    username VARCHAR(20) PRIMARY KEY,
    name VARCHAR(40),
    lastName VARCHAR(40),
    email VARCHAR(40),
    city VARCHAR(40),
    password VARCHAR(40)
); 

INSERT INTO phonebook.users (username,name,lastName,email,city,password) VALUES ('jasmina82','Jasmina','Kurtovic','jasmina999@hotmail.com','Gracanica','28animsaj');

CREATE TABLE IF NOT EXISTS phonebook.contacts  (

    id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(40),
    lastName VARCHAR(40),
    email VARCHAR(40),
    phone VARCHAR(15),
    city VARCHAR(40),
    date VARCHAR(12),
    username VARCHAR(20),
     FOREIGN KEY (username)
        REFERENCES phonebook.users (username)
    
); 
