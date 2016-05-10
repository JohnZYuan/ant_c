package edu.jlxy.community.controller;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author 袁振
 */
@RestController
public class SampleController {

    @RequestMapping("/return_json")
    public Object do_return_json() {
        Map map = new HashMap();
        map.put("id", 2);
        map.put("name", "黎明");
        return map;
    }

    @RequestMapping("/test_json")
    public Object do_test_json(@RequestParam("json") String json) {
        String ret = new Gson().fromJson(json, String.class);
        Map map = new HashMap();
        map.put("resualt", ret);
        return map;
    }

    @RequestMapping("/return_jsp")
    public ModelAndView do_return_jsp() {
        Map map = new HashMap();
        map.put("id", 4);
        map.put("name", "黎明");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("abcd");
        mv.addObject("obj", map);
        return mv;
    }
}
