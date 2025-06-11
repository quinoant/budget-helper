package com.budget.helper.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "line_item")
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class LineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long line_item_uid;
    private long line_item_budget_uid;
    private long line_item_amount;
    private String line_item_catagory;
    private Timestamp line_item_date;


    public Long getLine_item_uid() {
        return line_item_uid;
    }
    public long getLine_item_budget_uid() {
        return line_item_budget_uid;
    }
    public void setLine_item_budget_uid(long line_item_budget_uid) {
        this.line_item_budget_uid = line_item_budget_uid;
    }
    public long getLine_item_amount() {
        return line_item_amount;
    }
    public void setLine_item_amount(long line_item_amount) {
        this.line_item_amount = line_item_amount;
    }
    public String getLine_item_catagory() {
        return line_item_catagory;
    }
    public void setLine_item_catagory(String line_item_catagory) {
        this.line_item_catagory = line_item_catagory;
    }
    public Timestamp getLine_item_date() {
        return line_item_date;
    }
    public void setLine_item_date(Timestamp line_item_date) {
        this.line_item_date = line_item_date;
    }
    


    

}