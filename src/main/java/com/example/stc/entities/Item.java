package com.example.stc.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "permission_group_id", referencedColumnName = "id")
    private PermissionGroups permissionGroup;
}
