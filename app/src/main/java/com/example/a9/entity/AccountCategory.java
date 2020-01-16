package com.example.a9.entity;

/**
 * 类别
 */
public class AccountCategory {
    private int id;
    private String category;
    private int icon;

    public AccountCategory(int id, String category, int icon) {
        this.id = id;
        this.category = category;
        this.icon = icon;
    }

    public AccountCategory(String category, int icon) {
        this.category = category;
        this.icon = icon;
    }

    public AccountCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "AccountCategory{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", icon=" + icon +
                '}';
    }
}



