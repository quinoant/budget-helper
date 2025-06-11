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
    private long budget_user_uid;
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

    public long getBudget_user_uid() {
        return budget_user_uid;
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