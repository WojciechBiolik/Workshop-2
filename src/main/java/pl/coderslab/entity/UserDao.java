package pl.coderslab.entity;

public class UserDao {
    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

    private static final String READ_USER_QUERY = "SELECT * FROM users WHERE id = ?;";

    private static final String UPDATE_USER_QUERY ="UPDATE users SET email = ?, username = ?, password = ? WHERE id = ?;";

    private static final String DELETE_USER_QUERY ="DELETE FROM users WHERE id = ?;";

    private static final String FINDALL_QUERY = "SELECT * FROM users;";

    public User create(User suer) {

    }
}
