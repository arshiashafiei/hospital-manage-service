public class AdminManager {
    private Admin admin;

    public AdminManager() {
        admin = new Admin("admin", "admin");
    }

    public boolean authenticate(String username, String password) {
        if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
