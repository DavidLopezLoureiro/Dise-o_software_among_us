/* DELETE 'easybooking' database*/
DROP SCHEMA easybooking;
/* DELETE USER 'products_user' AT LOCAL SERVER*/
DROP USER 'products_user'@'%';

/* CREATE ''easybooking' DATABASE */
CREATE SCHEMA easybooking;
/* CREATE THE USER 'products_user' AT LOCAL SERVER WITH PASSWORD 'password' */
CREATE USER 'products_user'@'%' IDENTIFIED BY 'password';
/* GRANT FULL ACCESS TO THE DATABASE FOR THE USER 'products_user' AT LOCAL SERVER*/
GRANT ALL ON easybooking.* TO 'products_user'@'%';
