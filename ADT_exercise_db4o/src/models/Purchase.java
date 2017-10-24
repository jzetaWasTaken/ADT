/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ubuntu
 */
public class Purchase {
    private Date endDate;
    private Person assignee;
    private ArrayList<Person> followers;
    private ArrayList<Product> products;
    private String title;
    private String state;
    private boolean active;
    private float price;
    private Person payer;

    public Purchase() {
        followers = new ArrayList<>();
        products = new ArrayList<>();
    }
    
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public ArrayList<Person> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Person> followers) {
        this.followers = followers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Person getPayer() {
        return payer;
    }

    public void setPayer(Person payer) {
        this.payer = payer;
    }
    
    public int getDaysRemaining() {
        // TODO
        return 0;
    }
}
