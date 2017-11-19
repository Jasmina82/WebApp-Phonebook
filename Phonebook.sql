DROP SCHEMA IF EXISTS phonebook ;
CREATE SCHEMA IF NOT EXISTS phonebook DEFAULT CHARACTER SET utf8 ;
USE phonebook ;

DROP TABLE IF EXISTS phonebook.contacts ;
DROP TABLE IF EXISTS phonebook.users;


CREATE TABLE IF NOT EXISTS phonebook.users  (

    username VARCHAR(20) PRIMARY KEY NOT NULL,
    name VARCHAR(40) NOT NULL,
    lastName VARCHAR(40) NOT NULL,
    email VARCHAR(40) NOT NULL,
    city VARCHAR(40) NOT NULL,
    password VARCHAR(40) NOT NULL
); 

INSERT INTO phonebook.users (username,name,lastName,email,city,password) VALUES ('jasmina82','Jasmina','Kurtovic','jasmina999@hotmail.com','Gracanica','28animsaj');

CREATE TABLE IF NOT EXISTS phonebook.contacts  (

    id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(40)  NOT NULL,
    lastName VARCHAR(40) NOT NULL,
    email VARCHAR(40) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    city VARCHAR(40) NOT NULL,
    date VARCHAR(12) NOT NULL,
    username VARCHAR(20) NOT NULL,
     FOREIGN KEY (username)
        REFERENCES phonebook.users (username)
    
); 
