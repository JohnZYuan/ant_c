/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.daoimpl;

import edu.jlxy.community.dao.User_AuthorityDao;
import edu.jlxy.community.model.User_AuthorityBean;
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
public class User_AuthorityDaoImpl_Jdbc implements User_AuthorityDao{

    @Autowired private JdbcTemplate jdbc;
    
    @Override
    public void insert(User_AuthorityBean user_authority) {
        String stmt="insert into user_authority (user_id,authority) values(?,?)";
        jdbc.update(stmt, new Object[]{user_authority.getUser_id(),user_authority.getAuthority()});  
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String id_card, User_AuthorityBean user_authority) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User_AuthorityBean> select(int user_id) {
        String stmt = "select * from user_authority where user_id = ?";
        List<Map<String ,Object>> result = jdbc.queryForList(stmt, new Object[]{user_id});
        List<User_AuthorityBean> authoritys = new ArrayList<User_AuthorityBean>();
        for (int i = 0 ;i<result.size();i++){
            Map<String ,Object> item = result.get(i);
            User_AuthorityBean bean = new User_AuthorityBean();
            bean.setId(Integer.parseInt(item.get("id")+""));
            bean.setUser_id(Integer.parseInt(item.get("user_id")+""));
            bean.setAuthority(Integer.parseInt(item.get("authority")+""));
            authoritys.add(bean);
        }
        return authoritys;
    }
}
