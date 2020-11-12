/* DELETE 'productsDB1' database*/
DROP SCHEMA Easybooking;
/* DELETE USER 'products_user1' AT LOCAL SERVER*/
DROP USER 'products_user1'@'%';

/* CREATE ''productsDB1' DATABASE */
CREATE SCHEMA Easybooking;
/* CREATE THE USER 'products_user1' AT LOCAL SERVER WITH PASSWORD 'password' */
CREATE USER 'products_user1'@'%' IDENTIFIED BY 'password';
/* GRANT FULL ACCESS TO THE DATABASE FOR THE USER 'products_user1' AT LOCAL SERVER*/
GRANT ALL ON Easybooking.* TO 'products_user1'@'%';
