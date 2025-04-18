package model;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private byte[] image;

    public User(int id, String username, String email, String password, byte[] image) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.image = image;
    }

    public User(String username, String email, String password, byte[] image) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
