package com.attendance.entity;

/**
 * usersテーブルの1件分のデータを表すクラス
 */
public class User {

    // users.user_id
    private long userId;

    // users.employee_number
    private String employeeNumber;

    // users.name
    private String name;

    // users.password
    private String password;

    // users.role
    private String role;

    // 引数なしコンストラクタ
    public User() {
    }

    // 全項目を受け取るコンストラクタ
    public User(long userId, String employeeNumber, String name,
                String password, String role) {
        this.userId = userId;
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}