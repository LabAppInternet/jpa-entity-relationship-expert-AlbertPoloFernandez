package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.util.List;

/*
public record UserLab(long id, String username, String email) {

}
*/

@Entity
@Table(name = "user_lab")
public class UserLab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private String email;

    public UserLab() {
    }

    // Constructor
    public UserLab(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

