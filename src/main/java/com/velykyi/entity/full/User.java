package com.velykyi.entity.full;

import com.velykyi.entity.Entity;
import com.velykyi.entity.EntityBuilder;

public class User implements Entity<Integer>{

    public enum Role{ADMIN, USER, UNKNOWN}

    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String passportId;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

   public static final class UserBuilder implements EntityBuilder<User>{
       private Integer id;
       private String email;
       private String password;
       private String firstName;
       private String lastName;
       private String passportId;
       private Role role;

       public UserBuilder setId(Integer id) {
           this.id = id;
           return this;
       }

       public UserBuilder setEmail(String email) {
           this.email = email;
           return this;
       }

       public void setPassword(String password) {
           this.password = password;
       }

       public UserBuilder setFirstName(String firstName) {
           this.firstName = firstName;
           return this;
       }

       public UserBuilder setLastName(String lastName) {
           this.lastName = lastName;
           return this;
       }

       public UserBuilder setPassportId(String passportId) {
           this.passportId = passportId;
           return this;
       }

       public UserBuilder setRole(Role role) {
           this.role = role;
           return this;
       }

       public User build(){
           User user = new User();
           user.setId(id);
           user.setEmail(email);
           user.setFirstName(firstName);
           user.setLastName(lastName);
           user.setPassword(password);
           user.setPassportId(passportId);
           user.setRole(role);
           return user;
       }
   }
}
