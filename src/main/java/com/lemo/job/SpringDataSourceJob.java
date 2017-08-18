package com.lemo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author 王兴岭
 * @create 2017-05-27 15:13
 */
public class SpringDataSourceJob implements Job {
  public void execute(JobExecutionContext context) throws JobExecutionException {
    System.out.println("DataSource-------->SpringDataSourceJob");
  }
}
