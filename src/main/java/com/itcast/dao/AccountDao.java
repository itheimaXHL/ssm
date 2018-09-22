package com.itcast.dao;

import com.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("Insert into account(name,money) values(#{name},#{money})")
    void save(Account account);
}
