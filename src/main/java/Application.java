import domain.User;

import java.sql.*;

//Написать класс который будет по данному адрессу считывать необходимую информацию о базе данных.
//Написать класс который работает с базой данных. то есть конструктор. и вызывать необходимые методы.

public class Application {

    public static void main(String... args) throws SQLException {
        Connection con = ConnectionManager.getConnection(ReadFromResourcesToConnectionsSQL.getInformationForConnection("C:\\Users\\Резервный\\IdeaProjects\\WorkDatabase\\src\\main\\resources\\a.txt"));
        Statement stmt = con.createStatement();

        //domain.User user1 = new domain.User(1, "Коля","Сергеев","Живет под крышей");
        User user1 = new User(2, "Коля","Сергеев","Живет под крышей");

        //PreparedStatement st = con.prepareStatement(user1.insertUserInSQL());
        ResultSet rs = stmt.executeQuery(user1.insertUserInSQL());

        System.out.println(rs);
    }

    private static void fichi() {
        //TODO: {};
        //region Tap
        int sser;
        //endregion
    }


}
