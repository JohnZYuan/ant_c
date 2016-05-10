/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.daoimpl;

import edu.jlxy.community.dao.FunctionDao;
import edu.jlxy.community.model.FunctionBean;
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
public class FunctionDaoImpl_Jdbc implements FunctionDao{

    @Autowired private JdbcTemplate jdbc;
    
    @Override
    public void insert(FunctionBean function) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int id, FunctionBean function) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FunctionBean> select(int id) {
        String stmt = "select * from function where id = ?";
        List<Map<String ,Object>> result = jdbc.queryForList(stmt, new Object[]{id});
        List<FunctionBean> functions = new ArrayList<FunctionBean>();
        for (int i = 0 ;i<result.size();i++){
            Map<String ,Object> item = result.get(i);
            FunctionBean bean = new FunctionBean();
            bean.setId(Integer.parseInt(item.get("id")+""));
            bean.setImage(item.get("image")+"");
            bean.setName(item.get("name")+"");
            bean.setH_link(item.get("h_link")+"");
            functions.add(bean);
        }
        return functions;
    }
    
}
