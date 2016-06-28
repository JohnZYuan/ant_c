/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.controller;

import com.jhhc.baseframework.test.IntegrateRestfulBase;
import com.jhhc.baseframework.test.TestReturn;
import edu.jlxy.community.model.UserBean;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author 袁振
 */
public class UserControllerTest extends IntegrateRestfulBase {

    private Map<String, Object> result = new HashMap<String, Object>();

    @Test
    public void dbUserRegisterTest() {
       /* UserBean user = new UserBean("370103199408282013", "袁振", "wodemima", "15651073570", "smartyz94@gmail.com");
        Map map = new HashMap();
        map.put("json", user);
       TestReturn ret = doPost("/user_register", map);
        assertThat(ret.getStatus(), is("ok"));
        assertThat(ret.getMessage(), is("ok"));
        assertThat(ret.getBody(), not(nullValue()));
       result = ret.getObject(Map.class);
        String result_string = result.get("result") + "";
        assertThat(result_string, is("注册成功啦！"));*/
    }

    @Test
    public void dbUserLoginTest() {
       UserBean user = new UserBean("370103199408282013", "1", "wodemima", "1", "1");
        Map map = new HashMap(); 
        map.put("json", user);
       TestReturn ret = doPost("/user_login", map);
        assertThat(ret.getStatus(), is("ok"));
        assertThat(ret.getMessage(), is("ok"));
        assertThat(ret.getBody(), not(nullValue()));
        result = ret.getObject(Map.class);
        String result_string = result.get("result") + "";
        assertThat(result_string, is("登陆成功！您好袁振！"));
    }

    @Test
    public void dbUserDeleteTest() {
       /*String id_card = "370103199408282013";
        Map map = new HashMap();
        map.put("json", id_card);
        TestReturn ret = doPost("/user_delete", map);
        assertThat(ret.getStatus(), is("ok"));
        assertThat(ret.getMessage(), is("ok"));
        assertThat(ret.getBody(), not(nullValue()));
        result = ret.getObject(Map.class);
        String result_string = result.get("result") + "";
        assertThat(result_string, is("删除成功"));*/
    }

}
