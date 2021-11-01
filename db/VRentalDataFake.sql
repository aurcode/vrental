INSERT INTO vrental.vehicle_type(type) VALUES('automovil');
INSERT INTO vrental.vehicle_type(type) VALUES('camioneta');
INSERT INTO vrental.vehicle_type(type) VALUES('motos');

INSERT INTO vrental.vehicle_price(price_per_day) VALUES(30);
INSERT INTO vrental.vehicle_price(price_per_day) VALUES(32);


INSERT INTO vrental.vehicle(plate_number, id_vehicle_type, id_vehicle_price) VALUES('AZ204UWO', 2, 1);
INSERT INTO vrental.vehicle(plate_number, id_vehicle_type, id_vehicle_price) VALUES('GHEW2049', 2, 2);

select plate_number, type, price_per_day from vrental.vehicle as v
    INNER JOIN vrental.vehicle_type as t ON v.id_vehicle_type=t.id
    INNER JOIN vrental.vehicle_price as p ON v.id_vehicle_price=p.id;

INSERT INTO vrental.client(username, fisrt_name, last_name, phone, address) VALUES('aurcode', 'Aurelio', 'Marquez', '+5849353852648', 'China, calle 394 en avenida 40');

INSERT INTO vrental.license_type(type) VALUES('automovil');
INSERT INTO vrental.license_type(type) VALUES('camioneta');
INSERT INTO vrental.license_type(type) VALUES('motos');

INSERT INTO vrental.license_driver(id_client, id_license_type, issue_date, expire) VALUES(1, 2, '2020-06-22 12:00:00', '2025-06-22 12:00:00');

INSERT INTO vrental.rent_order(id_vehicle, id_client) VALUES(1,1);

INSERT INTO vrental.vehicle_details(id_vehicle, id_rent_order, detail, amount) VALUES(1, 1, 'Head-on collision', 1000);
INSERT INTO vrental.rent_time(id_rent_order, start_rent, rent_limit, return_vehicle, status)
    VALUES(1, '2021-10-11 12:00:00', '2021-10-18 12:00:00', '2021-10-17 12:00:00', 0);
INSERT INTO vrental.billing(id_rent_order, amount, created_date)
    VALUES(1, 192, '2021-10-17 12:00:00');


/*
CREATE TABLE `vrental`.`billing` (
    `id_rent_order` INT NOT NULL,
    `id_rent_order, amount` DOUBLE NOT NULL,
    `id_rent_order, amount, created_date` DATETIME NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (id_rent_order) REFERENCES rent_order(id)
);*/
