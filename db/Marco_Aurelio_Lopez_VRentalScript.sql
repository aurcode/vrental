/*
https://hub.docker.com/_/mysql

Start mysql in port 3306
docker run --name some-mysql -p 3306:3306 -p 33060:33060 -e MYSQL_ROOT_PASSWORD=123TopSecret -d mysql

sh exec mysql
docker exec -it some-mysql sh -c 'exec mysql -uroot -p"$MYSQL_ROOT_PASSWORD"'

Restoring data from dump files
docker exec -i some-mysql sh -c 'exec mysql -uroot -p"$MYSQL_ROOT_PASSWORD"' < $PWD/script.sql

Creating database dumps
docker exec some-mysql sh -c 'exec mysqldump --all-databases -uroot -p"$MYSQL_ROOT_PASSWORD"' > /some/path/on/your/host/all-databases.sql
*/

/*DROP DATABASE `vrental`;*/
/*CREATE SCHEMA `vrental`;*/

CREATE TABLE `vrental`.`vehicle_type` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `type` VARCHAR(20) NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    UNIQUE (`type`),
    PRIMARY KEY (`id`)
);

CREATE TABLE `vrental`.`vehicle_price` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `price_per_day` DOUBLE NOT NULL,
    `price_per_week` FLOAT NOT NULL DEFAULT 0.9,
    `price_per_month` FLOAT NOT NULL DEFAULT 0.7,
    `insurance_price` FLOAT NOT NULL DEFAULT 1.25,
    `deleted` BOOL NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
);

CREATE TABLE `vrental`.`vehicle` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `plate_number` VARCHAR(8),
    `id_vehicle_type` INT NOT NULL,
    `id_vehicle_price` INT NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    UNIQUE (`plate_number`),
    PRIMARY KEY (`id`),
    FOREIGN KEY (id_vehicle_price) REFERENCES vehicle_price(id) ON DELETE RESTRICT,
    FOREIGN KEY (id_vehicle_type) REFERENCES vehicle_type(id)
);

CREATE TABLE `vrental`.`client` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(40) NOT NULL,
    `fisrt_name` VARCHAR(50) NOT NULL,
    `last_name` VARCHAR(50),
    `phone` VARCHAR(15) NOT NULL,
    `address` VARCHAR(255) NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    UNIQUE (`phone`),
    UNIQUE (`username`),
    PRIMARY KEY (`id`)
);

CREATE TABLE `vrental`.`license_type` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `type` VARCHAR(20) NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    UNIQUE (`type`),
    PRIMARY KEY (`id`)
);

CREATE TABLE `vrental`.`license_driver` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_client` INT NOT NULL,
    `id_license_type` INT NOT NULL,
    `issue_date` DATETIME NOT NULL,
    `expire` DATETIME NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    FOREIGN KEY (id_license_type) REFERENCES license_type(id),
    FOREIGN KEY (id_client) REFERENCES client(id)
);

CREATE TABLE `vrental`.`rent_order` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_vehicle` INT NOT NULL,
    `id_client` INT NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    FOREIGN KEY (id_vehicle) REFERENCES vehicle(id),
    FOREIGN KEY (id_client) REFERENCES client(id)
);

CREATE TABLE `vrental`.`vehicle_details` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_vehicle` INT NOT NULL,
    `id_rent_order` INT NOT NULL,
    `detail` TEXT NOT NULL,
    `amount` DOUBLE NOT NULL DEFAULT 0.0,
    `status` BOOL NOT NULL DEFAULT 1,
    `deleted` BOOL NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    FOREIGN KEY (id_rent_order) REFERENCES rent_order(id) ON DELETE RESTRICT,
    FOREIGN KEY (id_vehicle) REFERENCES vehicle(id)
);

CREATE TABLE `vrental`.`rent_time` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_rent_order` INT NOT NULL,
    `start_rent` DATETIME NOT NULL,
    `rent_limit` DATETIME NOT NULL,
    `return_vehicle` DATETIME NOT NULL,
    `status` BOOL NOT NULL DEFAULT 1,
    `deleted` BOOL NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    FOREIGN KEY (id_rent_order) REFERENCES rent_order(id) ON DELETE RESTRICT
);

CREATE TABLE `vrental`.`billing` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_rent_order` INT NOT NULL,
    `amount` DOUBLE NOT NULL,
    `created_date` DATETIME NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    FOREIGN KEY (id_rent_order) REFERENCES rent_order(id)
);
