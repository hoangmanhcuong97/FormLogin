package com.example.formlogin.repository;

import com.example.formlogin.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryLogin extends JpaRepository<Account, Long> {
}
