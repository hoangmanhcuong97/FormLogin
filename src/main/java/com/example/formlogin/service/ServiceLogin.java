package com.example.formlogin.service;

import com.example.formlogin.model.Account;
import com.example.formlogin.repository.IRepositoryLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceLogin implements IServiceLogin{
    @Autowired
    private IRepositoryLogin iRepositoryLogin;


    @Override
    public List<Account> finAll() {
        return iRepositoryLogin.findAll();
    }

    @Override
    public Optional<Account> findById(Long id) {
        return iRepositoryLogin.findById(id);
    }

    @Override
    public Account save(Account user) {
        return iRepositoryLogin.save(user);
    }

    @Override
    public void remove(Long id) {
        iRepositoryLogin.deleteById(id);
    }
}
