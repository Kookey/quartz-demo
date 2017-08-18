package com.lemo.qualifier.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * quartz spring测试
 *
 * @author 王兴岭
 * @create 2017-05-23 16:01
 */
@ContextConfiguration("classpath:qualifier/person.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonSpringTest {

  @Autowired
  Person person;

  @Test
  public void test1() throws InterruptedException {
    Cat cat = person.cat;
    System.out.println(cat);
  }
}
