package com.lemo;

import com.lemo.job.DemoJob;

import org.junit.Test;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author 王兴岭
 * @create 2017-05-21 17:43
 */
public class MainTest {


  @Test
  public void startJob() throws SchedulerException, InterruptedException {
    Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
    JobDetail detail = JobBuilder.newJob(DemoJob.class).withIdentity("job1", "group1").build();
    Trigger trigger = TriggerBuilder.newTrigger().startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInMilliseconds(20).repeatForever()).withIdentity("trigger1", "group1").build();
    scheduler.scheduleJob(detail, trigger);
    scheduler.start();
    Thread.sleep(400000);
  }
}
