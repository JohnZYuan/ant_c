/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.dao;

import edu.jlxy.community.model.User_AuthorityBean;
import java.util.List;

/**
 *
 * @author 袁振
 */
public interface User_AuthorityDao {
        /*
    *添加用户权限
     */
    public void insert (User_AuthorityBean user_authority);
    /*
    *删除用户
    */
    public void delete(int id);
    /*
    *修改用户
    */
    public void update (String id_card , User_AuthorityBean user_authority);
    /*
    *根据用户id选择用户权限
    */
    public List<User_AuthorityBean> select (int user_id);
}
