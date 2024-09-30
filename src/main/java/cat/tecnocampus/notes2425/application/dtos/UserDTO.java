package cat.tecnocampus.notes2425.application.dtos;

/*
public record UserDTO(long id, String username, String email) {
}
*/

import cat.tecnocampus.notes2425.domain.UserLab;

public class UserDTO {

    private long id;
    private String username;
    private String email;


    public UserDTO(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }


    public UserDTO() {
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

    public static UserDTO fromEntity(UserLab userLab) {
        return new UserDTO(userLab.getId(), userLab.getUsername(), userLab.getEmail());
    }

    public UserLab toEntity() {
        return new UserLab(username, email);  // Assuming id is generated in UserLab
    }
}