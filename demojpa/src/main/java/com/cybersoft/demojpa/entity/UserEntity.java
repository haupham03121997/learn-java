package com.cybersoft.demojpa.entity;

import jakarta.persistence.*;

@Entity(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int id;

    @Column(name = "email")
    private  String email;
    @Column(name = "password")
    private  String password;
    @Column(name ="fullname")
    private  String fullName;
    @Column(name = "avatar")
    private  String avatar;

    // Khoá ngoại dùng để map quan hệ nên không cần khai báo cột
    // OneToOne, OneToMany, ManyToOne,
    // Bảng nào chứa khoá ngoại thì côt đó sẽ là ManyToOne
    // và JoinColumn("tên_cột_khoá_ngoại_trong_database")
    @ManyToOne
    @JoinColumn(name = "role_id" )
    private  RoleEntity role;
    @Column(name = "firtname")
    private  String firstName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}
