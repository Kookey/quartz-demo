package com.lemo.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * quartz spring测试
 *
 * @author 王兴岭
 * @create 2017-05-23 16:01
 */
@ContextConfiguration("classpath:context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class QuartzSpringTest {


  @Test
  public void test1() throws InterruptedException {
    System.out.println("111");
    Thread.sleep(2000000L);
  }
}
