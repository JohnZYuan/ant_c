/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.model;

/**
 *
 * @author 袁振
 */
public class CarportBean {
    private int id ;
    private int start_pos_x ;
    private int start_pso_y ;
    private int end_pos_x ;
    private int end_pos_y ;
    private String user_id_card ;
    private int unit_id ;
    private int community_id ;
    private int state;

    public CarportBean() {
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStart_pos_x() {
        return start_pos_x;
    }

    public void setStart_pos_x(int start_pos_x) {
        this.start_pos_x = start_pos_x;
    }

    public int getStart_pso_y() {
        return start_pso_y;
    }

    public void setStart_pso_y(int start_pso_y) {
        this.start_pso_y = start_pso_y;
    }

    public int getEnd_pos_x() {
        return end_pos_x;
    }

    public void setEnd_pos_x(int end_pos_x) {
        this.end_pos_x = end_pos_x;
    }

    public int getEnd_pos_y() {
        return end_pos_y;
    }

    public void setEnd_pos_y(int end_pos_y) {
        this.end_pos_y = end_pos_y;
    }

    public String getUser_id_card() {
        return user_id_card;
    }

    public void setUser_id_card(String user_id_card) {
        this.user_id_card = user_id_card;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }
    
}
