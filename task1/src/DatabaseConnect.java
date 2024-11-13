public class DatabaseConnect {
    private static DatabaseConnect connection;

    private DatabaseConnect() {
        System.out.println("Создано новое подключение к базе данных");
    }

    public static DatabaseConnect getInstance() {
        if (connection == null) {
            connection = new DatabaseConnect();
        }
        return connection;
    }

    public static void Connection(){
        System.out.println("Подключение к базе данных - установлено!");
    }
}
