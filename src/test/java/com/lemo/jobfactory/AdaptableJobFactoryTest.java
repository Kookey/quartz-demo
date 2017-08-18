package com.lemo.jobfactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * quartz spring测试
 *
 * @author 王兴岭
 * @create 2017-05-23 16:01
 */
@ContextConfiguration("classpath:context-adaptablejobfactory.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AdaptableJobFactoryTest {


  @Autowired
  private Scheduler scheduler;


  @Test
  public void test1() throws Exception {

    Thread.sleep(300000L);
  }
}
