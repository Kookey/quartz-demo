package com.lemo.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.quartz.simpl.CascadingClassLoadHelper;
import org.quartz.spi.ClassLoadHelper;
import org.quartz.xml.XMLSchedulingDataProcessor;
import org.springframework.beans.factory.annotation.Autowired;
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
public class QuartzSpringTest2 {


  @Autowired
  private Scheduler scheduler;


  @Test
  public void test1() throws Exception {

    ClassLoadHelper clhelper = new CascadingClassLoadHelper();
    clhelper.initialize();
    scheduler.start();
    XMLSchedulingDataProcessor processor = new XMLSchedulingDataProcessor(clhelper);
    processor.processFileAndScheduleJobs("simple-job-trigger-no-repeat.xml",scheduler);
//    System.out.println(scheduler);
    Thread.sleep(2000000L);
  }
}
