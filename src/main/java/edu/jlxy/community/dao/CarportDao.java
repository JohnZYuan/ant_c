/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.dao;

import edu.jlxy.community.model.CarportBean;
import java.util.List;

/**
 *
 * @author 袁振
 */
public interface CarportDao {
    /*
    *添加用户
     */
    public void insert (CarportBean carport);
    /*
    *删除用户
    */
    public void delete(int id);
    /*
    *修改用户
    */
    public void update (int id , CarportBean carport);
    /*
    *根据用户名选择多个用户
    */
    public List<CarportBean> select (int  id);
    
    public List <CarportBean> query ();
}
