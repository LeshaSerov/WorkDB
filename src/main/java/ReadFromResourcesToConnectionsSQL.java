import lombok.Getter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Getter
public class ReadFromResourcesToConnectionsSQL {
    private String db_driver;
    private String url;
    private String user;
    private String password;

    ReadFromResourcesToConnectionsSQL(String direction)
    {
        try {
            Path path = Path.of(direction);
            List<String> list = Files.readAllLines(path);
            for (String str : list){
                String substring = str.substring(str.indexOf("\"") + 1, str.lastIndexOf("\""));
                if (str.contains("String DB_Driver =")){
                    db_driver = substring;
                }
                else if (str.contains("String URL =")){
                    url = substring;
                }
                else if (str.contains("String User =")){
                    user = substring;
                }
                else if (str.contains("String Password =")){
                    password = substring;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
