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
public class CommunityBean {
    private int id ;
    private String name ;
    private String manager_name ;
    private String manager_password;
    private String manager_phone_number;
    private String manager_e_mail;

    public CommunityBean(String name, String manager_name, String manager_password, String manager_phone_number, String manager_e_mail) {
        this.name = name;
        this.manager_name = manager_name;
        this.manager_password = manager_password;
        this.manager_phone_number = manager_phone_number;
        this.manager_e_mail = manager_e_mail;
    }

    public CommunityBean() {
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

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_password() {
        return manager_password;
    }

    public void setManager_password(String manager_password) {
        this.manager_password = manager_password;
    }

    public String getManager_phone_number() {
        return manager_phone_number;
    }

    public void setManager_phone_number(String manager_phone_number) {
        this.manager_phone_number = manager_phone_number;
    }

    public String getManager_e_mail() {
        return manager_e_mail;
    }

    public void setManager_e_mail(String manager_e_mail) {
        this.manager_e_mail = manager_e_mail;
    }
}
