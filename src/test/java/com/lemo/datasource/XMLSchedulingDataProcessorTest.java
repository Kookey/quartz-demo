package com.lemo.datasource;

import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

/**
 * quartz spring测试
 *
 * @author 王兴岭
 * @create 2017-05-23 16:01
 */

public class XMLSchedulingDataProcessorTest {


  @Test
  public void processerTest() throws Exception {

    String file = "quartz-datasource.properties";
    StdSchedulerFactory factory = new StdSchedulerFactory(file);
    Scheduler scheduler = factory.getScheduler();
    scheduler.start();
    Thread.sleep(300000L);
  }
}
