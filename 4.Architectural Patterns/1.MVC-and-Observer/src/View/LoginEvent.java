package View;

/**
 * Created by Krasimir Stoyanov on 23.1.2017 г..
 */

// Straightforward class - has login Name and Password string
// and their getters and setters.

public class LoginEvent {
    private String name;
    private String password;

    public LoginEvent(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
