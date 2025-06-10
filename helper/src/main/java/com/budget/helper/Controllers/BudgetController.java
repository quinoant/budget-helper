package com.budget.helper.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.budget.helper.Entities.Budget;
import com.budget.helper.Repositiories.BudgetRepository;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {
  
  @Autowired
  private BudgetRepository budgetRepository;

  @GetMapping
  public List<Budget> getAllBudgets() {
    return budgetRepository.findAll();
  }

  @GetMapping("/{id}")
  public Budget get(@PathVariable("id") long id){
    return budgetRepository.getReferenceById(id);
  }

  @PostMapping
  public Budget createUser(@RequestBody Budget budget) {
    return budgetRepository.save(budget);
  }
}