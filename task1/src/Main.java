//Задача 1.
//Создание класса базы данных:
//Реализуйте класс, который будет представлять подключение к базе данных. Класс должен быть реализован
// как Singleton, чтобы при каждом обращении возвращался один и тот же объект.
//Требования:
//Класс должен быть Singleton.
//Метод подключения должен выводить сообщение о создании подключения.
//Проверьте, что при создании нескольких экземпляров — они ссылаются на один и тот же объект.
public class Main {
    public static void main(String[] args) {
        DatabaseConnect connect1 = DatabaseConnect.getInstance();
        connect1.Connection();

        DatabaseConnect connect2 = DatabaseConnect.getInstance();
        connect2.Connection();

        System.out.println("connect1 == connect2: " + (connect1 == connect2));
    }
}
