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
public class PageBean {
    private int id;
    private int pos_one ;
    private int pos_two;
    private int pos_three;
    private int pos_four;
    private int pos_five;
    private int pos_six;
    private int pos_seven;
    private int user_id;

    public PageBean() {
    }

    public PageBean(int pos_one, int pos_two, int pos_three, int pos_four, int pos_five, int pos_six, int pos_seven, int user_id) {
        this.pos_one = pos_one;
        this.pos_two = pos_two;
        this.pos_three = pos_three;
        this.pos_four = pos_four;
        this.pos_five = pos_five;
        this.pos_six = pos_six;
        this.pos_seven = pos_seven;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPos_one() {
        return pos_one;
    }

    public void setPos_one(int pos_one) {
        this.pos_one = pos_one;
    }

    public int getPos_two() {
        return pos_two;
    }

    public void setPos_two(int pos_two) {
        this.pos_two = pos_two;
    }

    public int getPos_three() {
        return pos_three;
    }

    public void setPos_three(int pos_three) {
        this.pos_three = pos_three;
    }

    public int getPos_four() {
        return pos_four;
    }

    public void setPos_four(int pos_four) {
        this.pos_four = pos_four;
    }

    public int getPos_five() {
        return pos_five;
    }

    public void setPos_five(int pos_five) {
        this.pos_five = pos_five;
    }

    public int getPos_six() {
        return pos_six;
    }

    public void setPos_six(int pos_six) {
        this.pos_six = pos_six;
    }

    public int getPos_seven() {
        return pos_seven;
    }

    public void setPos_seven(int pos_seven) {
        this.pos_seven = pos_seven;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
