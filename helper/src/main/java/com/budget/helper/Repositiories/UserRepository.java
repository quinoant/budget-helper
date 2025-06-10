package com.budget.helper.Repositiories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.budget.helper.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
