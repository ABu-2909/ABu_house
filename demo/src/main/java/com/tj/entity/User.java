package com.tj.entity;

public class User {
    // 对应数据库 user_id
    private Integer id;
    // 对应数据库 username
    private String username;
    // 对应数据库 password
    private String password;
    // 对应数据库 email（可选，需要就保留，不需要可删掉）
    private String email;

    // 无参构造
    public User() {
    }

    // 全参构造（匹配表字段）
    public User(Integer id, String name, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getter & Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString 修正类名为User
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}