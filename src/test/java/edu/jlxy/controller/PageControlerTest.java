/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.controller;

import com.jhhc.baseframework.test.IntegrateRestfulBase;
import com.jhhc.baseframework.test.TestReturn;
import edu.jlxy.community.model.PageBean;
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
public class PageControlerTest extends IntegrateRestfulBase{
    
    private Map<String,Object> result = new HashMap<String,Object>();
    @Test
    public void dbPageCreateTest() {
        PageBean page = new PageBean(1,2,3,4,5,6,7,1);
        Map map = new HashMap();
        map.put("json", page);
        TestReturn ret = doPost("/page_create", map);
        assertThat(ret.getStatus(), is("ok"));
        assertThat(ret.getMessage(), is("ok"));
        assertThat(ret.getBody(), not(nullValue()));
        result = ret.getObject(Map.class);
        String result_string = result.get("result")+"";
        assertThat(result_string, is("功能修改成功啦！"));
    }
    
    @Test 
    public void dbPageLoadTest (){
        String id_card = "370103199408282013";
        Map map = new HashMap();
        map.put("json", id_card);
        TestReturn ret = doPost("/page_load", map);
        assertThat(ret.getStatus(), is("ok"));
        assertThat(ret.getMessage(), is("ok"));
        assertThat(ret.getBody(), not(nullValue()));
        result = ret.getObject(Map.class);
        String name = result.get("pos_one_name")+"";
        assertThat(name, is("缴水费"));
        name = result.get("pos_seven_name")+"";
        assertThat(name, is("家政服务"));
    }
}
