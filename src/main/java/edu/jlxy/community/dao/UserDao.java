/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * User类dao的接口
 */
package edu.jlxy.community.dao;

import edu.jlxy.community.model.UserBean;
import java.util.List;

/**
 *
 * @author 袁振
 * 用户类Dao接口
 */
public interface UserDao {
    /*
    *添加用户
     */
    public void insert (UserBean user);
    /*
    *删除用户
    */
    public void delete(String id_card);
    /*
    *修改用户
    */
    public void update (String id_card , UserBean user);
    /*
    *根据用户名选择多个用户
    */
    public List<UserBean> select (String id_card);
}
