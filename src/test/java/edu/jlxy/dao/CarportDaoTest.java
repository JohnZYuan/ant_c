/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.dao;

import edu.jlxy.community.dao.CarportDao;
import edu.jlxy.community.daoimpl.CarportDaoImpl_Jdbc;
import edu.jlxy.community.model.CarportBean;
import org.junit.Test;

/**
 *
 * @author 袁振
 */

public class CarportDaoTest {
    private CarportDao carportDao = new CarportDaoImpl_Jdbc();
    @Test
    public void insert_test(){
        CarportBean carport = new CarportBean();
        carport.setCommunity_id(1);
        carport.setEnd_pos_x(10);
        carport.setEnd_pos_y(10);
        carport.setStart_pos_x(0);
        carport.setStart_pso_y(0);
        carport.setState(0);
        carport.setUnit_id(1);
        carport.setUser_id_card("370103199408282013");
        carportDao.insert(carport);
    }
}
