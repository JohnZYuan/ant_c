/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.community.service;

import edu.jlxy.community.dao.FunctionDao;
import edu.jlxy.community.dao.PageDao;
import edu.jlxy.community.dao.UserDao;
import edu.jlxy.community.model.FunctionBean;
import edu.jlxy.community.model.PageBean;
import edu.jlxy.community.model.UserBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 袁振
 * 关于用户的服务
 */
@Service
@Transactional

public class AntService {
    
    private Map<String,Object> map = new HashMap<String,Object>();
    @Autowired
    private UserDao userdao;
    @Autowired
    private PageDao pagedao;
    @Autowired
    private FunctionDao functiondao;
    
    /*-------------------------------------------------------用户相关服务----------------------------------------------------------*/
    /*
    *用户注册
    */
    public Map userRegister (UserBean user) {
        List<UserBean> select_result = userdao.select(user.getId_card());
        if (select_result.size()==0){
            userdao.insert(user);
            map.put("result", "注册成功啦！");
            return map;
        }
        else 
        {
            map.put("result", "该身份证号已被注册！");
            return map;
        }
    }
    
    /*
    *用户登陆
    */
    public Map userLogin (UserBean user) {
        List<UserBean> result = userdao.select(user.getId_card());
        if (result.size()==1){
            UserBean _result = result.get(0);
            if (!user.getPassword().equals(_result.getPassword()))
            {
                map.put("result", "密码输入有误！");
                return map;
            }
            else
            {
                map.put("id_card", _result.getId_card());
                map.put("result","登陆成功！您好" + _result.getName() + "！");
                return map; 
            }
        }
        else {
            map.put("result","身份证号不存在或输入有误！");
            return map;
        }
    }

    /*
    *删除用户
    */
    public Map userDelte(String id_card) {
        List<UserBean> select_result = userdao.select(id_card);
        if (select_result.size()==1){
            userdao.delete(id_card);
            map.put("result", "删除成功");
            return map;
        }
        else
        {
            map.put("result", "删除失败");
            return map;
        }
    }
    
    /*
    *车位管理系统的用户注册
    */
    public Map userCarportRegister (UserBean user) {
        List<UserBean> select_result = userdao.select(user.getId_card());
        if (select_result.size()==0){
            userdao.insert(user);
            map.put("result", "注册成功啦！");
            return map;
        }
        else 
        {
            map.put("result", "该身份证号已被注册！");
            return map;
        }
    }
   
/*-------------------------------------------------------功能相关服务----------------------------------------------------------*/   
    /*
    *查找功能
    */
    public Map<String , Object> functionSelect (int id){
        FunctionBean function = functiondao.select(id).get(0);
        map.put("result", function);
        return map;
    }
/*-------------------------------------------------------页面相关服务----------------------------------------------------------*/
    /*
    *添加页面
    */
    public Map pageCreate (PageBean page) {
        List<PageBean> oldpages = pagedao.select(page.getUser_id());
        if (oldpages.size()>=1){
            PageBean oldpage = oldpages.get(0);
            pagedao.delete(oldpage.getId());
            pagedao.insert(page);
            map.put("result", "功能修改成功啦！");
            return map;
        }
        else{
            pagedao.insert(page);
            map.put("result", "功能选择成功啦！");
            return map;
        }
    }
    
    /*
    *删除页面
    */
    public Map<String, Object> pageDelete(int id) {
        pagedao.delete(id);
        map.put("result", "页面删除成功");
        return map;
    }
    
    /*
    *根据id查找页面
    */
    public Map<String , Object> pageSelect (String id_card){
        UserBean user = userdao.select(id_card).get(0);
        PageBean page = pagedao.select(user.getId()).get(0);
        map.put("result", page);
        return map;
    }

    public Map<String ,Object> pageLoad (String id_card){
        UserBean user = userdao.select(id_card).get(0);
        PageBean page = pagedao.select(user.getId()).get(0);
        int i = page.getPos_one();
        FunctionBean function = functiondao.select(i).get(0);
        map.put("pos_one_name", function.getName());
        map.put("pos_one_image", function.getImage());
        map.put("pos_one_h_link", function.getH_link());
        i = page.getPos_two();
        function = functiondao.select(i).get(0);
        map.put("pos_two_name", function.getName());
        map.put("pos_two_image", function.getImage());
        map.put("pos_two_h_link", function.getH_link());
        i = page.getPos_three();
        function = functiondao.select(i).get(0);
        map.put("pos_three_name", function.getName());
        map.put("pos_three_image", function.getImage());
        map.put("pos_three_h_link", function.getH_link());
        i = page.getPos_four();
        function = functiondao.select(i).get(0);
        map.put("pos_four_name", function.getName());
        map.put("pos_four_image", function.getImage());
        map.put("pos_four_h_link", function.getH_link());
        i = page.getPos_five();
        function = functiondao.select(i).get(0);
        map.put("pos_five_name", function.getName());
        map.put("pos_five_image", function.getImage());
        map.put("pos_five_h_link", function.getH_link());
        i=page.getPos_six();
        function = functiondao.select(i).get(0);
        map.put("pos_six_name", function.getName());
        map.put("pos_six_image", function.getImage());
        map.put("pos_six_h_link", function.getH_link());
        i = page.getPos_seven();
        function = functiondao.select(i).get(0);
        map.put("pos_seven_name", function.getName());
        map.put("pos_seven_image", function.getImage());
        map.put("pos_seven_h_link", function.getH_link());
        return map;
    }
    
/*-------------------------------------------------------车位相关服务----------------------------------------------------------*/
}
