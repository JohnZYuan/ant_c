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
public class User_InfoBean {
    private String id_card;
    private int community_id;
    private int carport_id;

    public User_InfoBean(String id_card, int community_id, int carport_id) {
        this.id_card = id_card;
        this.community_id = community_id;
        this.carport_id = carport_id;
    }

    public User_InfoBean() {
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public int getCarport_id() {
        return carport_id;
    }

    public void setCarport_id(int carport_id) {
        this.carport_id = carport_id;
    }
    
    
}
