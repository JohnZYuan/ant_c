/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.dao;

import edu.jlxy.community.model.PageBean;
import java.util.List;

/**
 *
 * @author 袁振
 */
public interface PageDao {
     /*
    *添加页面
     */
    public void insert (PageBean page);
    /*
    *删除页面
    */
    public void delete(int id);
    /*
    *修改页面
    */
    public void update (int id , PageBean page);
    /*
    *根据用户名选择多个页面
    */
    public List<PageBean> select (int user_id);
}
