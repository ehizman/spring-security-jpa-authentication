package com.ehizman.springsecurityjpa.data.model;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "active")
    private Boolean isActive;

    private String password;

    private String roles;

    @Column(name = "username")
    private String userName;


    public Long getId() {
        return id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public String getPassword() {
        return password;
    }

    public String getRoles() {
        return roles;
    }

    public String getUserName() {
        return userName;
    }
}
