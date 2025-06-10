package com.budget.helper.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "budget")
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long budget_uid;
    private long budget_income;
    private long budget_expenses;
    private String budget_items;
    private final Timestamp budget_creation_date;
    private Timestamp budget_update_date;

    public Budget() {
        this.budget_creation_date = new Timestamp(System.currentTimeMillis());
        this.budget_update_date = new Timestamp(System.currentTimeMillis());
    }

    public Budget(String name, String email, String password) {
        this.budget_creation_date = new Timestamp(System.currentTimeMillis());
        this.budget_update_date = new Timestamp(System.currentTimeMillis());
    }

    public void updateTime() {
        this.budget_update_date = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return String.format(
                "Budget[budget_uid=%d, income='%s', expenses='%s']",
                budget_uid, budget_income, budget_expenses);
    }

    public long getBudget_income() {
        return budget_income;
    }

    public void setBudget_income(long budget_income) {
        this.budget_income = budget_income;
    }

    public long getBudget_expenses() {
        return budget_expenses;
    }

    public void setBudget_expenses(long budget_expenses) {
        this.budget_expenses = budget_expenses;
    }

    public String getBudget_items() {
        return budget_items;
    }

    public void setBudget_items(String budget_items) {
        this.budget_items = budget_items;
    }

    public Long getBudget_uid() {
        return budget_uid;
    }

    public Timestamp getBudget_creation_date() {
        return budget_creation_date;
    }

    public Timestamp getBudget_update_date() {
        return budget_update_date;
    }

}