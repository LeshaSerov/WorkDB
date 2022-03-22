import java.sql.Connection;

//Написать класс который будет по данному адрессу считывать необходимую информацию о базе данных.
//Написать класс который работает с базой данных. то есть конструктор. и вызывать необходимые методы.

public class Application {

    public static void main(String... args) {
        ReadFromResourcesToConnectionsSQL readFromResourcesToConnectionsSQL = new ReadFromResourcesToConnectionsSQL("C:\\Users\\Резервный\\IdeaProjects\\WorkDatabase\\src\\main\\resources\\a.txt");
        Connection con = ConnectionManager.getConnection(readFromResourcesToConnectionsSQL);
    }

    private static void fichi() {
        //TODO: {};
        //region Tap
        int sser;
        //endregion
    }


}
