package com.phatlee.demoapifoodapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "name")
    private String name;

    // Constructor không tham số – cần cho deserialization
    public Category() {
    }

    public Category(int id, String imagePath, String name) {
        this.id = id;
        this.imagePath = imagePath;
        this.name = name;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getName() {
        return name;
    }
}