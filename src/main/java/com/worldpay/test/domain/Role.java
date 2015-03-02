package com.worldpay.test.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * User Roles
 */
@Entity
public class Role {

    @Id
    private Integer id;

    private String role;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinTable(name="user_roles",
               joinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")},
               inverseJoinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")}
    )
    private Set<User> userRoles;

    Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<User> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<User> userRoles) {
        this.userRoles = userRoles;
    }
}
