insert into customer(id, name) values (100, 'Mike');
insert into customer(id, name) values (101, 'Sam');
insert into customer(id, name) values (102, 'John');
insert into customer(id, name) values (103, 'Cary');

insert into my_transaction(id, description, total, save_date, customer_id) values (1001, 'Purchase 1', 100, '2021-07-17 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (1002, 'Purchase 2', 50, '2021-06-01 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (1003, 'Purchase 3', 120, '2021-07-10 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (1004, 'Purchase 10', 175.32, '2021-08-07 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (1005, 'Purchase 20', 65.75, '2021-06-05 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (1006, 'Purchase 30', 210.50, '2021-07-03 10:20:10', 100);
insert into my_transaction(id, description, total, save_date, customer_id) values (1009, 'Purchase 31', 42.80, '2021-08-18 17:10:10', 100);

insert into my_transaction(id, description, total, save_date, customer_id) values (1200, 'Purchase 200', 25.60, '2021-07-01 12:20:10', 102);
insert into my_transaction(id, description, total, save_date, customer_id) values (1201, 'Purchase 201', 80.50, '2021-07-05 15:00:10', 102);
insert into my_transaction(id, description, total, save_date, customer_id) values (1202, 'Purchase 202', 116.14, '2021-07-10 11:30:10', 102);

insert into my_transaction(id, description, total, save_date, customer_id) values (1008, 'Purchase 5', 200, '2021-07-17 10:20:10', 101);

insert into my_transaction(id, description, total, save_date, customer_id) values (1010, 'Purchase 40', 200, '2021-07-17 10:40:00', 103);
insert into my_transaction(id, description, total, save_date, customer_id) values (1011, 'Purchase 41', 230, '2021-07-04 12:20:10', 103);
insert into my_transaction(id, description, total, save_date, customer_id) values (1012, 'Purchase 42', 20, '2021-08-02 05:20:15', 103);