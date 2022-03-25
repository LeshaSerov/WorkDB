import lombok.Getter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadFromResourcesToConnectionsSQL {

    public static ArrayList<String> getInformationForConnection(String direction)
    {
        String db_driver = null;
        String url = null;
        String user = null;
        String password = null;
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
        ArrayList <String> result = new ArrayList<String>(4);
        result.add(db_driver);
        result.add(url);
        result.add(user);
        result.add(password);
        return result;
    }

}
