package com.lemo.quartzjobbean;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author 王兴岭
 * @create 2017-05-23 22:53
 */
public class ExampleJob extends QuartzJobBean {

  private int timeout;

  protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    System.out.println("timeout========"+timeout);

  }

  public void setTimeout(int timeout) {
    this.timeout = timeout;
  }
}
