В программе задан список Person{ String fName, String lName, String email, 
String phone, Address address}. Address{String postcode, String city, 
String street, String house}
Реализовать следующие функции:
-получить список всех ФИО
-получить список всех e-mail
-получить список всех телефонов
-получить список всех адресов в виде строки адреса

Естественно, все вышеперечисленные функции может и должен реализовать
один метод, в который в качестве параметра должен приходить список Person и
реализация необходимого способа обработки.
Не забываем про тесты!
создать интерфейс с методом String personToString(Person p)
Реализовать метод, который в качестве параметра принимает лист Person, а возвращает лист строк. Вторым параметром метод должен принимать интерфейс
