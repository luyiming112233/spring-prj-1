package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;

import java.util.List;

public interface CustomerMapper {
    /**
     * 新增用戶
     *
     * @param customer
     * @return
     * @throws Exception
     */
    public int insertCustomer(Customer customer) throws Exception;

    /**
     * 修改用戶
     *
     * @param customer
     * @param id
     * @return
     * @throws Exception
     */
    public int updateCustomer(Customer customer, int id) throws Exception;

    /**
     * 刪除用戶
     *
     * @param id
     * @return
     * @throws Exception
     */
    public int deleteCustomer(int id) throws Exception;

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    public Customer selectCustomerById(int id) throws Exception;

    /**
     * 查询所有的用户信息
     *
     * @return
     * @throws Exception
     */
    public List<Customer> selectAllCustomer() throws Exception;
}
