/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.model;

/**
 *
 * @author 袁振
 * 用户类型 用户登录版本
 */
public class UserBean {
    private int id;
    private String id_card ;
    private String name ;
    private String password;
    private String phone_number;
    private String e_mail;

    public UserBean(String id_card, String name, String password, String phone_number, String e_mail) {
        this.id_card = id_card;
        this.name = name;
        this.password = password;
        this.phone_number = phone_number;
        this.e_mail = e_mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public UserBean() {
    }

}
