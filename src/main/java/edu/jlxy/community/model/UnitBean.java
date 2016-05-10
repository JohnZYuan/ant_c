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
public class UnitBean {
    private int id;
    private int start_pos_x ;
    private int start_pos_y ;
    private int end_pos_x ;
    private int end_pos_y;
    private int community_id ;
    private String name ;
    
    public UnitBean() {
    }

    public UnitBean(int start_pos_x, int start_pos_y, int end_pos_x, int end_pos_y, int community_id, String name) {
        this.start_pos_x = start_pos_x;
        this.start_pos_y = start_pos_y;
        this.end_pos_x = end_pos_x;
        this.end_pos_y = end_pos_y;
        this.community_id = community_id;
        this.name = name;
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

    public int getStart_pos_y() {
        return start_pos_y;
    }

    public void setStart_pos_y(int start_pos_y) {
        this.start_pos_y = start_pos_y;
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

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
