package com.budget.helper.Repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budget.helper.Entities.LineItem;

public interface LineItemRepository extends JpaRepository<LineItem, Long> {
}