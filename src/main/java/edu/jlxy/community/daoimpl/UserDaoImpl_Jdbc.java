/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.daoimpl;

import edu.jlxy.community.dao.UserDao;
import edu.jlxy.community.model.UserBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author 袁振
 * User类jdbc的dao
 */
@Component
public class UserDaoImpl_Jdbc implements UserDao {


    @Autowired private JdbcTemplate jdbc;
    
    @Override
    public void insert(UserBean user) {
        String stmt="insert into user (id_card,name,password,phone_number,e_mail) values(?,?,?,?,?)";
        jdbc.update(stmt, new Object[]{user.getId_card(),user.getName(),user.getPassword(),user.getPhone_number(),user.getE_mail()});  
    }

    @Override
    public void delete(String id_card) {
        String stmt="delete from user where id_card = ?";
        jdbc.update(stmt, new Object[]{id_card});
    }

    @Override
    public void update(String id_card, UserBean user) {
        String stmt = "";
    }

    @Override
    public List<UserBean> select(String id_card) {
        String stmt = "select * from user where id_card = ?";
        List<Map<String ,Object>> result = jdbc.queryForList(stmt, new Object[]{id_card});
        List<UserBean> users = new ArrayList<UserBean>();
        for (int i = 0 ;i<result.size();i++){
            Map<String ,Object> item = result.get(i);
            UserBean bean = new UserBean();
            bean.setId(Integer.parseInt(item.get("id")+""));
            bean.setId_card(item.get("id_card")+"");
            bean.setName(item.get("name")+"");
            bean.setE_mail(item.get("e_mail")+"");
            bean.setPassword(item.get("password")+"");
            bean.setPhone_number(item.get("phone_number")+"");
            users.add(bean);
        }
        return users;
    }
}
