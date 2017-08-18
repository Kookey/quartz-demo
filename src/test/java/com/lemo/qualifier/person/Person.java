package com.lemo.qualifier.person;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 王兴岭
 * @create 2017-05-27 21:27
 */
public class Person {

  @Autowired
  public Cat cat;
}
