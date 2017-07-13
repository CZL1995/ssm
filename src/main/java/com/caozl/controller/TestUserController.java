package com.caozl.controller;

import com.caozl.model.TestUser;
import com.caozl.service.CakeService;
import com.caozl.service.Test1Service;
import com.caozl.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Caozl on 2017-06-28.
 */
@Controller
@RequestMapping("test")
public class TestUserController {

    @Autowired
    private TestUserService testUserService;
    @Autowired
    private CakeService cakeService;
    @Autowired
    private Test1Service test1Service;




    @RequestMapping("user")
    @ResponseBody
    public Map<String, Object> selectUser() {
        Map<String, Object> map = new HashMap<>();

        map.put("id", testUserService.selectUser(1).getId());
        map.put("name", testUserService.selectUser(1).getName());
        System.out.println(testUserService.selectUser(1).toString());
        System.out.println(testUserService.selectUser(1).toString());
        System.out.println(testUserService.selectUser(1).toString());
        return map;
    }

    @RequestMapping("test1")
    public void selectCake() {
        TestUser testUser=new TestUser();
        testUser.setId(1);
        List<TestUser> list = test1Service.selecTest1(testUser);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        TestUser testUser1=new TestUser();
        testUser1.setId(2);
        List<TestUser> list1 = test1Service.selecTest1(testUser1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).toString());
        }


    }

    @RequestMapping("cake")
    public void selecTest1() {
        List<TestUser> list = cakeService.selectCake();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }


}
