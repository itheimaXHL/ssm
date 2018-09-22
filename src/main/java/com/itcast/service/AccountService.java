package com.itcast.service;

import com.itcast.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("account")
public interface AccountService {

    List<Account> findAll();

    void save(Account account);
}
