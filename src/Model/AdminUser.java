package Model;

import java.io.Serializable;

public class AdminUser implements Serializable {

    private String username;
    private String password;

    public AdminUser(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean equals(AdminUser adminUser){
        return (this.username.equals(adminUser.getUsername()) && this.password.equals(adminUser.getPassword()));
    }
}
