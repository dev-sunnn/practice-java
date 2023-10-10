-- 問題１
-- １
SELECT * FROM books WHERE publication_year >= 2000;

-- ２
SELECT * FROM books WHERE publication_year < 2000 OR publication_year > 2010;

-- ３
SELECT * FROM students WHERE grade = 9 AND score >= 90;

-- ４
SELECT name, score FROM students WHERE grade = 9 ORDER BY score DESC LIMIT 1;

-- 問題２
-- １
-- テーブルを結合するためには、`JOIN`キーワードを使用します。
-- 具体的な結合方法（内部結合、外部結合など）に応じて、`INNER JOIN`、`LEFT JOIN`、`RIGHT JOIN`、`FULL JOIN`などの結合タイプを指定します。

-- ２
-- 内部結合は、結合条件に一致する行のみを返す結合です。
-- 一方、外部結合は、一致する行だけでなく、片方のテーブルにしか存在しない行（左外部結合または右外部結合）または両方のテーブルに存在しない行（完全外部結合）も返します。

-- ３
-- クロス結合（またはカートジアン積）は、結合条件なしで2つのテーブルを結合する方法です。
-- すべての行の組み合わせが返されるため、結果の行数は元のテーブルの行数の積になります。

-- ４
-- `WHERE`句は、結合後の結果セットに対してフィルタリングを行います。
-- 一方、`ON`句は、結合条件を指定するために使用されます。
-- 通常、結合条件を指定するために`ON`句を使用し、結果セットをフィルタリングするために`WHERE`句を使用します。

-- ５
-- テーブルの結合条件を指定する際に、一般的に使用される演算子は
-- `=`（等しい）、`<`（より小さい）、`>`（より大きい）、`<=`（以下）、`>=`（以上）、`<>`（等しくない）などです。
-- 結合条件に応じて、演算子を適切に選択して使用します。

-- 問題３
-- １
SELECT employees.name, departments.name
FROM employees
JOIN departments ON employees.department_id = departments.id;

-- ２
SELECT products.name, categories.name, stores.name
FROM products
JOIN categories ON products.category_id = categories.id
JOIN stores ON products.store_id = stores.id;

-- ３
SELECT orders.order_date, customers.name, products.name
FROM orders
JOIN customers ON orders.customer_id = customers.id
JOIN products ON orders.product_id = products.id;

-- ４
SELECT customers.name, orders.order_date, SUM(order_items.quantity * order_items.price) AS total_amount
FROM orders
JOIN order_items ON orders.id = order_items.order_id
JOIN customers ON orders.customer_id = customers.id
GROUP BY customers.name, orders.order_date;

-- ５
SELECT employees.name, departments.name, AVG(employees.salary) AS average_salary
FROM employees
JOIN departments ON employees.department_id = departments.id
GROUP BY employees.name, departments.name;
