public class User1 {
    private String username;
    private String password;
    private String role;

    public User1() {}

    public User1(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void login(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public void performAction(String action) {
        if (role.equals("Admin")) {
            if (action.equals("Create")) {
                System.out.println("Creating a new user.");
            } else if (action.equals("Delete")) {
                System.out.println("Deleting a user.");
            } else {
                System.out.println("Invalid action for Admin role.");
            }
        } else if (role.equals("User")) {
            if (action.equals("View")) {
                System.out.println("Viewing user information.");
            } else if (action.equals("Update")) {
                System.out.println("Updating user information.");
            } else {
                System.out.println("Invalid action for User role.");
            }
        }
    }
}
