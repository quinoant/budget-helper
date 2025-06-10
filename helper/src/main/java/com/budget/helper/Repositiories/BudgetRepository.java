package com.budget.helper.Repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budget.helper.Entities.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}