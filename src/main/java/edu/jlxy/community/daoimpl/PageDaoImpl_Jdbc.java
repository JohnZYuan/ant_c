/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.daoimpl;

import edu.jlxy.community.dao.PageDao;
import edu.jlxy.community.model.PageBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author 袁振
 */
@Component
public class PageDaoImpl_Jdbc implements PageDao{
    
    @Autowired private  JdbcTemplate jdbc ;
    
    @Override
    public void insert(PageBean page) {
        String stmt="insert into page (pos_one,pos_two,pos_three,pos_four,pos_five,pos_six,pos_seven,user_id) values(?,?,?,?,?,?,?,?)";
        jdbc.update(stmt, new Object[]{page.getPos_one(),page.getPos_two(),page.getPos_three(),page.getPos_four(),
            page.getPos_five(),page.getPos_six(),page.getPos_seven(),page.getUser_id()});  
    }

    @Override
    public void delete(int id) {
        String stmt="delete from page where id = ?";
        jdbc.update(stmt, new Object[]{id});
    }

    @Override
    public void update(int id, PageBean page) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PageBean> select(int user_id) {
        String stmt = "select * from page where user_id = ?";
        List<Map<String ,Object>> result = jdbc.queryForList(stmt, new Object[]{user_id});
        List<PageBean> pages = new ArrayList<PageBean>();
        for (int i = 0 ;i<result.size();i++){
            Map<String ,Object> item = result.get(i);
            PageBean bean = new PageBean();
            bean.setId(Integer.parseInt(item.get("id")+""));
            bean.setPos_one(Integer.parseInt(item.get("pos_one")+""));
            bean.setPos_two(Integer.parseInt(item.get("pos_two")+""));
            bean.setPos_three(Integer.parseInt(item.get("pos_three")+""));
            bean.setPos_four(Integer.parseInt(item.get("pos_four")+""));
            bean.setPos_five(Integer.parseInt(item.get("pos_five")+""));
            bean.setPos_six(Integer.parseInt(item.get("pos_six")+""));
            bean.setPos_seven(Integer.parseInt(item.get("pos_seven")+""));
            bean.setUser_id(Integer.parseInt(item.get("user_id")+""));
            pages.add(bean);
        }
        return pages;
    }
    
}
