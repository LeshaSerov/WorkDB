import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//Написать класс который будет по данному адрессу считывать необходимую информацию о базе данных.
//Написать класс который работает с базой данных. то есть конструктор. и вызывать необходимые методы.

public class Application {

    public static void main(String... args) {
        ReadFromResourcesToConnectionsSQL readFromResourcesToConnectionsSQL = new ReadFromResourcesToConnectionsSQL("C:\\Users\\Резервный\\IdeaProjects\\WorkDatabase\\src\\main\\resources\\a.txt");
        //getDBConnection(DB_Driver,URL,User,Password);

    }


    private static Connection getDBConnection(String DB_Driver, String URL, String User, String Password) {
        //Тот же самый метод
        //Статический не имеет доступа к полям класса
        //https://vertex-academy.com/tutorials/ru/kak-podklyuchitsya-k-baze-dannyx-postgresql-s-pom/

        System.out.println("Testing connection to PostgreSQL JDBC");
        //Привет)

        try {
            Class.forName(DB_Driver);//Почему так а не иначе, какой смысл несет?
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return null;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null; //Инициализация подключения

        try {
            connection = DriverManager.getConnection(URL, User, Password);
            //Тут надо будет убрать в отделньый метод
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return null;
        }

        //region ForTest для запоминания

        if (connection != null) {

            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }

        //endregion

        return connection;
    }

    private static void fichi() {
        //TODO: {};
        //region Tap
        int sser;
        //endregion
    }


}
