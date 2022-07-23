package com.example.formlogin.service;

import com.example.formlogin.model.Account;

import java.util.List;
import java.util.Optional;

public interface IServiceLogin {
    List<Account> finAll();
    Optional<Account> findById(Long id);
    Account save(Account user);
    void remove(Long id);
}
