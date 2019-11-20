package com.lumor.dubbo;

public class LoginService implements ILoginService {
    @Override
    public String login(String username) {
        return username + ": login success";
    }
}
