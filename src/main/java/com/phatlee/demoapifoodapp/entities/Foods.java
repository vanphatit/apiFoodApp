package com.phatlee.demoapifoodapp.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "foods")
public class Foods implements Serializable {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "description")
    private String description;

    @Column(name = "best_food")
    private boolean bestFood;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "location_id")
    private int locationId;

    @Column(name = "price")
    private double price;

    @Column(name = "price_id")
    private int priceId;

    @Column(name = "star")
    private double star;

    @Column(name = "time_id")
    private int timeId;

    @Column(name = "time_value")
    private int timeValue;

    @Column(name = "title")
    private String title;

    @Column(name = "stock_quantity")
    private int stockQuantity;

    // Constructor không tham số – cần cho deserialization
    public Foods() {
    }

    public Foods(int id, int categoryId, String description, boolean bestFood, String imagePath, int locationId,
                 double price, int priceId, double star, int timeId, int timeValue, String title) {
        this.id = id;
        this.categoryId = categoryId;
        this.description = description;
        this.bestFood = bestFood;
        this.imagePath = imagePath;
        this.locationId = locationId;
        this.price = price;
        this.priceId = priceId;
        this.star = star;
        this.timeId = timeId;
        this.timeValue = timeValue;
        this.title = title;
        this.stockQuantity = 50;
    }

    // Getters và setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBestFood() {
        return bestFood;
    }
    public void setBestFood(boolean bestFood) {
        this.bestFood = bestFood;
    }

    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getLocationId() {
        return locationId;
    }
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getPriceId() {
        return priceId;
    }
    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public double getStar() {
        return star;
    }
    public void setStar(double star) {
        this.star = star;
    }

    public int getTimeId() {
        return timeId;
    }
    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public int getTimeValue() {
        return timeValue;
    }
    public void setTimeValue(int timeValue) {
        this.timeValue = timeValue;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}