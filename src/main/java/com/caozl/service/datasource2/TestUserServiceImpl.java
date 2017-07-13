package com.caozl.service.datasource2;

import com.caozl.dao.TestUserDao;
import com.caozl.model.TestUser;
import com.caozl.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Caozl on 2017-06-28.
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private TestUserDao testUserDao;

    @Override
    public TestUser selectUser(int id) {
        return testUserDao.selectUser(id);
    }

    @Override
    public List<TestUser> selectCake() {

        return testUserDao.selectCake();
    }

    @Override
    public List<TestUser> selecTest1() {
        return testUserDao.selecTest1();
    }
}
