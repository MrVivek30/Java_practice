package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Email;

public interface EmailRepo extends JpaRepository<Email, Integer> {
//public Email findById(Integer id);
}
