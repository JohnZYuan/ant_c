/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.controller;

import com.google.gson.Gson;
import edu.jlxy.community.model.PageBean;
import edu.jlxy.community.model.UserBean;
import edu.jlxy.community.service.AntService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 袁振 关于用户管理的控制器
 */
@RestController
public class AntController {

    private Map<String ,Object> result = new HashMap<String, Object>();
    @Autowired
    private AntService antService;

    @RequestMapping("/user_register")
    public Object do_user_register(@RequestParam("json") String json) {
        UserBean bean = new Gson().fromJson(json, UserBean.class);
        result = antService.userRegister(bean);
        return result;
    }
    
    @RequestMapping("/user_login")
    public Object do_user_login(@RequestParam("json") String json) {
        UserBean bean = new Gson().fromJson(json, UserBean.class);
        result = antService.userLogin(bean);
        return result;
    }
    
    @RequestMapping("/user_delete")
    public Object do_user_delete(@RequestParam("json") String json){
        String id_card = new Gson().fromJson(json, String.class);
        result = antService.userDelte(id_card);
        return result;
    }
    
    /*
    *page类相关服务
    */
    @RequestMapping("/page_create")
    public Object do_page_create(@RequestParam("json") String json) {
        PageBean page = new Gson().fromJson(json, PageBean.class);
        result = antService.pageCreate(page);
        return result;
    }
    
    @RequestMapping("page_select")
    public Object do_page_select (@RequestParam("json") String json) {
        String id_card = new Gson().fromJson(json, String.class);
        result = antService.pageSelect(id_card);
        return result;
    }
    
//    @RequestMapping("/page_delete")
//    public Object do_page_delete(@RequestParam("json") String json){
//        int id = new Gson().fromJson(json, int.class);
//        result = antService.pageDelete(id);
//        return result;
//    }
    @RequestMapping("page_load")
    public Object do_page_load (@RequestParam("json")String json){
        String id_card = new Gson().fromJson(json, String.class);
        result = antService.pageLoad(id_card);
        return result;  
    }
    
    
    @RequestMapping("/carport_get")
    public Object do_carport_get (@RequestParam("json")String json){
        String id_card = new Gson().fromJson(json, String.class);
        result = antService.getCarport(id_card);
        return result;
    }
}
