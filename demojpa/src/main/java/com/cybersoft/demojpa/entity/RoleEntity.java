package com.cybersoft.demojpa.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "roles")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int id;

    @Column(name ="name")
    private String name;

    @Column(name ="description")
    private  String desc;

    // mappedBy: nhận vào tên biến Entity map khoá ngoại
    @OneToMany(mappedBy = "role")
    private Set<UserEntity> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String description) {
        this.desc = description;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }
}
