/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.daoimpl;

import edu.jlxy.community.dao.CarportDao;
import edu.jlxy.community.model.CarportBean;
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
public class CarportDaoImpl_Jdbc implements CarportDao{
    
    @Autowired private JdbcTemplate jdbc;

    @Override
    public void insert(CarportBean carport) {
        String stmt="insert into carport (start_pos_x,start_pos_y,end_pos_x,end_pos_y,user_id_card,unit_id,community_id,state) values(?,?,?,?,?,?,?,?)";
        jdbc.update(stmt, new Object[]{carport.getStart_pos_x(),carport.getStart_pso_y(),carport.getEnd_pos_x(),carport.getEnd_pos_y(),
        carport.getUser_id_card(),carport.getUnit_id(),carport.getCommunity_id(),carport.getState()});
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public void update(int id, CarportBean carport) {
        String stmt = "update carport set state = ? where id = ? ";
        jdbc.update(stmt, new Object[]{carport.getState(),id});
    }

    @Override
    public List<CarportBean> select(int id) {
        String stmt = "select * from carport where id = ?";
        List<Map<String ,Object>> result = jdbc.queryForList(stmt, new Object[]{id});
        List<CarportBean> carports = new ArrayList<CarportBean>();
        for (int i=0; i < result.size();i++){
            Map<String ,Object> item = result.get(i);
            CarportBean bean = new CarportBean();
            bean.setId(Integer.parseInt(item.get("id")+""));
            bean.setCommunity_id(Integer.parseInt(item.get("community_id")+""));
            bean.setEnd_pos_x(Integer.parseInt(item.get("end_pos_x")+""));
            bean.setEnd_pos_y(Integer.parseInt(item.get("end_pos_y")+""));
            bean.setStart_pos_x(Integer.parseInt(item.get("start_pos_x")+""));
            bean.setStart_pso_y(Integer.parseInt(item.get("start_pos_y")+""));
            bean.setUnit_id(Integer.parseInt(item.get("unit_id")+""));
            bean.setUser_id_card(item.get("user_id_card")+"");
            bean.setState(Integer.parseInt(item.get("state")+""));
            carports.add(bean);
        }
        return carports;
    }

    @Override
    public List<CarportBean> query() {
        String stmt = "select * from carport";
        List<Map<String ,Object>> result = jdbc.queryForList(stmt);
        List<CarportBean> carports = new ArrayList<CarportBean>();
        for (int i=0; i < result.size();i++){
            Map<String ,Object> item = result.get(i);
            CarportBean bean = new CarportBean();
            bean.setId(Integer.parseInt(item.get("id")+""));
            bean.setCommunity_id(Integer.parseInt(item.get("community_id")+""));
            bean.setEnd_pos_x(Integer.parseInt(item.get("end_pos_x")+""));
            bean.setEnd_pos_y(Integer.parseInt(item.get("end_pos_y")+""));
            bean.setStart_pos_x(Integer.parseInt(item.get("start_pos_x")+""));
            bean.setStart_pso_y(Integer.parseInt(item.get("start_pos_y")+""));
            bean.setUnit_id(Integer.parseInt(item.get("unit_id")+""));
            bean.setUser_id_card(item.get("user_id_card")+"");
            bean.setState(Integer.parseInt(item.get("state")+""));
            carports.add(bean);
        }
        return carports;
    }
    
    
}
