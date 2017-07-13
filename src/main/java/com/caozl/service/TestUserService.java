package com.caozl.service;

import com.caozl.model.TestUser;

import java.util.List;

/**
 * Created by Caozl on 2017-06-14.
 */
public interface TestUserService {
     TestUser selectUser(int id);
     List<TestUser> selectCake();
     List<TestUser> selecTest1();
}
