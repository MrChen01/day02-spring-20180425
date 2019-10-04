package com.gyf.service;

public class UserSereviceFactory1 {

    public static IUserService createUserService(){
        return new UserServiceImpl();
    }
}
