package com.example.app.practice;

/**
 * java 問題：練習
 */
public class Practice18 {
    /** 表示 */
    /** practice 1 */
    // public static void main(String[] args) {
    //     int x = 10;
    //     System.out.println("The value of x is " + x + " and its square is " + (x * x));
    // }
    // The value of x is 10 and its square is 100
    // 変数xの値を表示し、その値の2乗を表示しています。

    /** practice 2 */
    // public static void main(String[] args) {
    //     String name = "Alice";
    //     int age = 30;
    //     double height = 165.5;
    //     System.out.printf("My name is %s, I am %d years old, and my height is %.1f cm.", name, age, height);
    // }
    // My name is Alice, I am 30 years old, and my height is 165.5 cm.
    // 変数nameには"Alice"、変数ageには30、変数heightには165.5の値が格納されています。
    // それぞれの値を指定したフォーマットで表示しています。

    /** practice 3 */
    // public static void main(String[] args) {
    //     int num1 = 5;
    //     int num2 = 7;
    //     System.out.printf("The sum of %d and %d is %d.", num1, num2, (num1 + num2));
    // }
    // The sum of 5 and 7 is 12.
    // 変数num1には5、変数num2には7の値が格納されています。それぞれの値とその和を表示しています。

    /** practice 4 */
    // public static void main(String[] args) {
    //     double pi = 3.14159;
    //     System.out.println("The value of pi is " + String.format("%.3f", pi));
    // }
    // The value of pi is 3.142
    // 変数piには3.14159の値が格納されています。指定した小数点以下の桁数で丸めた値を表示しています。

    /** 計算 */
    /** practice 1 */
    // public static void main(String[] args) {
    //     int x = 5;
    //     int y = 3;
    //     int result = (int) Math.pow(x, y);
    //     System.out.println(result);
    // }
    // resultの値は125です。Math.powメソッドは指定された数の指数乗を計算します。
    // 5の3乗を計算しています。

    /** practice 2 */
    // public static void main(String[] args) {
    //     double a = 7.5;
    //     double b = 2.5;
    //     double result = Math.sqrt(a * b);
    //     System.out.println(result);
    // }
    // resultの値は4.330127018922194です。Math.sqrtメソッドは指定された数の平方根を計算します。
    // 7.5と2.5の積の平方根を計算しています。

    /** practice 3 */
    // public static void main(String[] args) {
    //     double x = 10.5;
    //     double y = 4.2;
    //     double result = Math.ceil(x) / Math.floor(y);
    //     System.out.println(result);
    // }
    // resultの値は2.75です。
    // Math.ceilメソッドは指定された数以上の最小の整数を返し、Math.floorメソッドは指定された数以下の最大の整数を返します。
    // 10.5を切り上げて11にし、4.2を切り捨てて4にします。

    /** practice 4 */
    // public static void main(String[] args) {
    //     int a = 3;
    //     int b = 2;
    //     int c = 4;
    //     int result = Math.max(a * b, c);
    //     System.out.println(result);
    // }
    // resultの値は6です。Math.maxメソッドは指定された2つの数のうち大きい方を返します。
    // aとbの積が6であり、cが4ですので、6と4のうち大きい方の数である6が結果となります。

    /** 判定 */
    /** practice 1 */
    // public static void main(String[] args) {
    //     int x = 10;
    //     int y = 5;
    //     boolean result = (x > y) && (x % y == 0);
    //     System.out.println(result);
    // }
    // resultの値はtrueです。xはyより大きく、かつxをyで割った余りが0であるため、条件式は真となります。

    /** practice 2 */
    // public static void main(String[] args) {
    //     double a = 7.5;
    //     double b = 2.5;
    //     boolean result = (a / b >= 3) || (a * b < 20);
    //     System.out.println(result);
    // }
    // resultの値はtrueです。aをbで割った結果が3以上であるか、またはaとbの積が20未満であるため、条件式は真となります。

    /** practice 3 */
    // public static void main(String[] args) {
    //     int x = 8;
    //     boolean result = (x % 2 == 0) && (x > 10) || (x < 5);
    //     System.out.println(result);
    // }
    // resultの値はfalseです。xを2で割った余りが0ではないため、条件式の最初の部分が偽となります。そのため、最終的な結果も偽となります。
    
    /** practice 4 */
    // public static void main(String[] args) {
    //     boolean a = true;
    //     boolean b = false;
    //     boolean result = a && b;
    //     System.out.println(result);
    // }
    // resultの値はfalseです。&&演算子は論理積（AND）を計算します。
    // aとbの両方がtrueでないため、結果はfalseとなります。

    /** practice 5 */
    // public static void main(String[] args) {
    //     boolean a = true;
    //     boolean b = false;
    //     boolean result = !(a || b) && (a && !b);
    //     System.out.println(result);
    // }
    // resultの値はfalseです。条件式の最初の部分(aまたはbが真)は偽となります。
    // また、次の部分(aかつbが偽)も偽となります。そのため、最終的な結果も偽となります。

    /** 操作 */
    /** practice 1 */
    // practice19に格納 Factorial.java

    /** practice 2 */
    // practice19に格納 Divisors.java

    /** practice 3 */
    // practice19に格納 PrimeFactors.java

    /** practice 4 */
    // practice19に格納 BinaryRepresentation.java
    
    /** practice 5 */
    // practice19に格納 SquareRoot.java
    
    /** ループ */
    /** practice 1 */
    // public static void main(String[] args) {
    //     String str = "Hello";
    //     String reversedStr = "";
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         reversedStr += str.charAt(i);
    //     }
    //     System.out.println("Reversed string: " + reversedStr);
    // }
    // Reversed string: olleH
    // 変数strには"Hello"という文字列が格納されています。
    // forループを使って文字列を逆順に取り出し、変数reversedStrに連結しています。
    // 最終的に逆順になった文字列が表示されます。

    /** practice 2 */
    // public static void main(String[] args) {
    //     int[] numbers = {2, 5, 8, 3, 1};
    //     int sum = 0;
    //     for (int num : numbers) {
    //         sum += num;
    //     }
    //     System.out.println("Sum of numbers: " + sum);
    // }
    // Sum of numbers: 19
    // 配列numbersには{2, 5, 8, 3, 1}という要素が格納されています。
    // for-eachループを使って配列の各要素を取り出し、変数sumに加算しています。
    // 最終的に合計値が表示されます。

    /** practice 3 */
    // public static void main(String[] args) {
    //     int[] numbers = {3, 8, 2, 5, 1};
    //     int max = numbers[0];
    //     for (int i = 1; i < numbers.length; i++) {
    //         if (numbers[i] > max) {
    //             max = numbers[i];
    //         }
    //     }
    //     System.out.println("Maximum number: " + max);
    // }
    // Maximum number: 8
    // 配列numbersには{3, 8, 2, 5, 1}という要素が格納されています。
    // forループを使って配列の要素を順番に比較し、最大値を変数maxに格納しています。
    // 最終的に最大値が表示されます。

    /** practice 4 */
    // public static void main(String[] args) {
    //     String[] names = {"Alice", "Bob", "Charlie", "David"};
    //     String longestName = "";
    //     for (String name : names) {
    //         if (name.length() > longestName.length()) {
    //             longestName = name;
    //         }
    //     }
    //     System.out.println("Longest name: " + longestName);
    // }
    // Longest name: Charlie
    // 配列namesには{"Alice", "Bob", "Charlie", "David"}という要素が格納されています。
    // for-eachループを使って配列の各要素を取り出し、文字列の長さを比較して最長の名前を変数longestNameに格納しています。最終的に最長の名前が表示されます。

    /** クラスとオブジェクト */
    /** practice 1 */
    // practice19に格納 Person.java

    /** practice 2 */
    // practice19に格納 Main.java

    /** practice 3 */
    // practice19に格納 Person.java

    /** practice 4 */
    // practice19に格納 Student.java

    /** practice 5 */
    // practice19に格納 Main.java

}
