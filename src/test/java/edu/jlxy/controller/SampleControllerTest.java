/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.controller;

import com.jhhc.baseframework.test.IntegrateRestfulBase;
import com.jhhc.baseframework.test.TestReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author 袁振
 */
public class SampleControllerTest extends IntegrateRestfulBase{
    @Test
    public void jsonReturnTest() {
        TestReturn ret = doGet("/return_json");
        assertThat(ret.getStatus(),is("ok"));
        assertThat(ret.getMessage(),is("ok"));
        assertThat(ret.getBody(), not(nullValue()));
    }
}
