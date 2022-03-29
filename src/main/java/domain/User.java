package domain;

import lombok.Getter;

@Getter
public class User {
    private Integer ID;
    private String Name;
    private String Surname;
    private String About;

    public User(Integer ID, String name, String surname, String about) {
        this.ID = ID;
        Name = name;
        Surname = surname;
        About = about;
    }

}
