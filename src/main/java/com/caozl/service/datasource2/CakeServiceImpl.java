package com.caozl.service.datasource2;

import com.caozl.dao.CakeDao;
import com.caozl.dao.TestUserDao;
import com.caozl.model.TestUser;
import com.caozl.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Caozl on 2017-07-07.
 */
@Service
public class CakeServiceImpl implements CakeService {
    @Autowired
    private CakeDao cakeDao;


    @Override
    public List<TestUser> selectCake() {
        return cakeDao.selectCake();
    }
}
