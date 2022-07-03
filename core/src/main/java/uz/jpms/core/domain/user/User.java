package uz.jpms.core.domain.user;

import uz.jpms.core.domain.BaseEntity;
import uz.jpms.core.util.EntityUtil;

public class User implements BaseEntity<Long> {

    private Long id;
    private String username;
    private String password;
    private String name;
    private UserType type;
    private Boolean isActive = Boolean.FALSE;

    @Override
    public Long generateId() {
        return EntityUtil.generateLongID();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", isActive=" + isActive +
                '}';
    }
}
