package com.caozl.dao;

import com.caozl.model.TestUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Caozl on 2017-06-14.
 */

@Repository
public interface TestUserDao {
    TestUser selectUser(int id);
    List<TestUser> selectCake();
    List<TestUser> selecTest1();
}
