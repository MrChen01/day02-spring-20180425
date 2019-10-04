package com.gyf.service;

public class UserSereviceFactory2 {

    public IUserService createUserService(){
        return new UserServiceImpl();
    }
}
