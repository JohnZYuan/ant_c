/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.dao;

import edu.jlxy.community.model.FunctionBean;
import java.util.List;

/**
 *
 * @author 袁振
 * 功能类Dao接口
 */
public interface FunctionDao {
    /*
    *添加功能
     */
    public void insert (FunctionBean function);
    /*
    *删除功能
    */
    public void delete(int id);
    /*
    *修改功能
    */
    public void update (int id , FunctionBean function);
    /*
    *选择一个功能
    */
    public List<FunctionBean> select (int id);
}
