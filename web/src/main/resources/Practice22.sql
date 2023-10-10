-- 問題１
-- １
CREATE TABLE employees (
  employee_id serial PRIMARY KEY,
  first_name text,
  last_name text,
  email text,
  hire_date date
);

-- ２
INSERT INTO employees (first_name, last_name, email, hire_date) VALUES
('John', 'Doe', 'john.doe@example.com', '2022-01-01'),
('Jane', 'Smith', 'jane.smith@example.com', '2022-02-01');

-- ３
SELECT * FROM employees;
SELECT * FROM employees WHERE first_name = 'John';

-- ４
UPDATE employees SET email = 'john.d@example.com' WHERE email = 'john.doe@example.com';

-- ５
DELETE FROM employees WHERE employee_id = 2;

-- 問題２
-- １
CREATE TABLE students (
  id serial PRIMARY KEY,
  name text,
  age integer
);

INSERT INTO students (name, age) VALUES ('Alice', 20), ('Bob', 22), ('Charlie', 19);

-- ２
SELECT * FROM students;
SELECT * FROM students WHERE name = 'Bob';

-- ３
UPDATE students SET name = 'Eve' WHERE name = 'Alice';

-- ４
DELETE FROM students WHERE id = 3;

-- ５
SELECT COUNT(*) FROM students;
SELECT MAX(age) FROM students;

-- 問題３
-- １
CREATE TABLE products (
  id serial PRIMARY KEY,
  name text,
  price real,
  quantity integer
);

INSERT INTO products (name, price, quantity) VALUES ('Apple', 1.99, 10), ('Banana', 0.99, 20), ('Orange', 2.49, 15);

-- ２
SELECT * FROM products;
SELECT * FROM products WHERE price >= 2.00;

-- ３
UPDATE products SET price = 2.49 WHERE name = 'Apple';

-- ４
DELETE FROM products WHERE id = 2;

-- ５
SELECT COUNT(*) FROM products;
SELECT SUM(quantity) FROM products;

-- 問題４
-- １
CREATE TABLE orders (
  order_id serial PRIMARY KEY,
  customer_id integer,
  order_date date,
  total_amount real
);

INSERT INTO orders (customer_id, order_date, total_amount) VALUES (1001, '2022-01-01', 99.99), (1002, '2022-01-02', 149.99), (1001, '2022-01-03', 199.99);

-- ２
SELECT * FROM orders;
SELECT * FROM orders WHERE total_amount >= 150.00;

-- ３
UPDATE orders SET total_amount = 249.99 WHERE customer_id = 1001;

-- ４
DELETE FROM orders WHERE order_id = 2;

-- ５
SELECT COUNT(*) FROM orders;
SELECT AVG(total_amount) FROM orders;

