package com.example.stc.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "files")
public class Permissions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "permission_level")
    private String permissionLevel;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private PermissionGroups group;

}
