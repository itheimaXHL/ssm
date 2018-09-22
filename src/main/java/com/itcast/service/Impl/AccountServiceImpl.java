package com.itcast.service.Impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    @Override
    public List<Account> findAll() {
        System.out.println("业务层");
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层");
        accountDao.save(account);
    }

}
