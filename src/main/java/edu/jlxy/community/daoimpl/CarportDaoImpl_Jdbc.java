/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.daoimpl;

import edu.jlxy.community.dao.CarportDao;
import edu.jlxy.community.model.CarportBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author 袁振
 */
@Component
public class CarportDaoImpl_Jdbc implements CarportDao{
    
    @Autowired private JdbcTemplate jdbc;

    @Override
    public void insert(CarportBean carport) {
        String stmt="insert into carport (start_pos_x,start_pos_y,end_pos_x,end_pos_y,user_id_card,unit_id,community_id) values(?,?,?,?,?,?,?)";
        jdbc.update(stmt, new Object[]{carport.getStart_pos_x(),carport.getStart_pso_y(),carport.getEnd_pos_x(),carport.getEnd_pos_y(),
        carport.getUser_id_card(),carport.getUnit_id(),carport.getCommunity_id()});
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public void update(int id, CarportBean carport) {
    }

    @Override
    public List<CarportBean> select(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
