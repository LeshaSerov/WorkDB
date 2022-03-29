package configuration;

import lombok.Getter;

import java.io.IOException;
import java.util.Properties;

@Getter
public class PropertyReader {
    //private String JDBC_PROPERTIES = ".src\\main\\resources\\jdbc.properties";
    private String db_driver;
    private String url;
    private String user;
    private String password;

    public void init() throws IOException {
        Properties properties = new Properties();
        String JDBC_PROPERTIES = ".src\\main\\resources\\jdbc.properties";
        properties.load(
                this.getClass().getClassLoader().getResourceAsStream(JDBC_PROPERTIES));
        db_driver = properties.getProperty(db_driver);
        user = properties.getProperty(user);
        password = properties.getProperty(password);
        url = properties.getProperty(url);
    }
}
