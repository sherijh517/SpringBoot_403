package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(unique=true)
    private String role;

    @ManyToMany(mappedBy="roles". fetch=FetchType.LAZY)
    private Collection<User> user;

    public Role {

    }
    public Role{String role} {
        this.role=role;
    }
}
