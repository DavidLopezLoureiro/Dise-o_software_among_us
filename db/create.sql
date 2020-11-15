/* DELETE 'Easybooking' database*/
DROP SCHEMA Easybooking;
/* DELETE USER 'products_user' AT LOCAL SERVER*/
DROP USER 'products_user'@'%';

/* CREATE ''Easybooking' DATABASE */
CREATE SCHEMA Easybooking;
/* CREATE THE USER 'products_user' AT LOCAL SERVER WITH PASSWORD 'password' */
CREATE USER 'products_user'@'%' IDENTIFIED BY 'password';
/* GRANT FULL ACCESS TO THE DATABASE FOR THE USER 'products_user' AT LOCAL SERVER*/
GRANT ALL ON Easybooking.* TO 'products_user'@'%';
