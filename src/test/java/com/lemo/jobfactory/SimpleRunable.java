package com.lemo.jobfactory;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 王兴岭
 * @create 2017-05-23 23:25
 */
public class SimpleRunable implements Runnable, Job {

  private static final Logger LOG = LoggerFactory.getLogger(SimpleRunable.class);

  public void run() {
    System.out.println("SimpleRunable->run");
  }

  public void execute(JobExecutionContext context) throws JobExecutionException {
    System.out.println("SimpleRunable->execute");
  }
}
