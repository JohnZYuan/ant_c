/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.model;

/**
 *
 * @author 袁振
 * 功能类数据模型
 */
public class FunctionBean {
    private int id ;
    private String name ;
    private String image ;
    private String h_link ;

    public FunctionBean() {
    }

    public FunctionBean(String name, String image, String h_link) {
        this.name = name;
        this.image = image;
        this.h_link = h_link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getH_link() {
        return h_link;
    }

    public void setH_link(String h_link) {
        this.h_link = h_link;
    }
    
    
}
