package cn.edu.zjut.action;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;

public class UserAction {
    private Customer loginUser;
    private IUserService userService = null;

    public Customer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String register(){
        if(loginUser==null)
            return "registerFail";
        if(userService==null){
            System.out.println("null");
            return "registerFail";
        }
        userService.register(loginUser);
        System.out.println(loginUser.getAccount());
        return "registerSuccess";
    }
}
