package View;

/**
 * Created by Krasimir Stoyanov on 23.1.2017 г..
 */
public interface LoginListener {
    void successfulLogin(LoginEvent event);

    void createdUser(LoginEvent event);
}
