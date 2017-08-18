package com.lemo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 任务
 *
 * @author 王兴岭
 * @create 2017-05-21 17:05
 */
public class DemoJob implements Job {
  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    System.out.println("hello world!");
  }
}
