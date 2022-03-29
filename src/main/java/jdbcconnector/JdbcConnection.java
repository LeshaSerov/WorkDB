package jdbcconnector;

import configuration.PropertyReader;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    public Connection CreateConnect() throws IOException, SQLException {
        PropertyReader propertyReader = new PropertyReader();
        propertyReader.init();
        String url = propertyReader.getUrl();
        String user = propertyReader.getUser();
        String password = propertyReader.getPassword();
        return DriverManager.getConnection(url, user, password);
    }
}