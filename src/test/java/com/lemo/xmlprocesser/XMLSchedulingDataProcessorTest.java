package com.lemo.xmlprocesser;

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

    Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
    scheduler.start();
    Thread.sleep(300000L);
  }
}
