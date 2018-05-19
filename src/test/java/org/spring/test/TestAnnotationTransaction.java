package org.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.service.AccoutService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAnnotationTransaction {
	@Resource(name="accountService")
    private AccoutService accountService;
     
    @Test
    public void testTransfer() {
         
        accountService.transfer("李四", "张三", 200d);
         
    }
}
