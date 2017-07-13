package com.caozl.service.datasource1;

import com.caozl.dao.Test1Dao;
import com.caozl.model.TestUser;
import com.caozl.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Caozl on 2017-07-07.
 */
@Service
public class Test1ServiceImpl  implements Test1Service{

    @Autowired
    private Test1Dao test1Dao;

    @Override
    public List<TestUser> selecTest1( TestUser testUser) {
        return test1Dao.selecTest1(testUser);
    }
}
