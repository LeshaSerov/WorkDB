import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

    public static Connection getConnection(ReadFromResourcesToConnectionsSQL readF) {
        //Тот же самый метод
        //Статический не имеет доступа к полям класса
        //https://vertex-academy.com/tutorials/ru/kak-podklyuchitsya-k-baze-dannyx-postgresql-s-pom/

        System.out.println("Testing connection to PostgreSQL JDBC");
        //Привет)

        try {
            Class.forName(readF.getDb_driver());
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return null;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null; //Инициализация подключения

        try {
            connection = DriverManager.getConnection(readF.getUrl(), readF.getUser(), readF.getPassword());
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
}
