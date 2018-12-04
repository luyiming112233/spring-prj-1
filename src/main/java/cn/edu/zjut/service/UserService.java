package cn.edu.zjut.service;

import cn.edu.zjut.dao.CustomerMapper;
import cn.edu.zjut.po.Customer;

public class UserService implements IUserService{
    private CustomerMapper customerMapper = null;

    public UserService(){
        System.out.println("create UserService.");
    }

    public void setCustomerMapper(CustomerMapper customerMapper) {
        System.out.println("--setCustomerMapper--");
        this.customerMapper = customerMapper;
    }

    public void register(Customer customer){
        System.out.println("--execute --register()-- method.");
        try {
            customerMapper.insertCustomer(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
