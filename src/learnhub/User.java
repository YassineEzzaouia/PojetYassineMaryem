package learnhub;

public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private int Role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setRole(int role){
        this.Role=role;
    }

    public int getRole(){
        return Role;
    }
}