package com.lemo.qualifier.person;

/**
 * @author 王兴岭
 * @create 2017-05-27 21:27
 */
public class Cat {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Cat{");
    sb.append("name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
