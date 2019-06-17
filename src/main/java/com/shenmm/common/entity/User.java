package com.shenmm.common.entity;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:申明明(823865618@qq.com)
 * <br>Date:2019年6月17日
 */
public class User {

  private String name;

  private int age;

  private String duc;

  private String zdate;

  public User(String name, int age, String duc, String zdate) {
    super();
    this.name = name;
    this.age = age;
    this.duc = duc;
    this.zdate = zdate;
  }

  public User() {
    super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDuc() {
    return duc;
  }

  public void setDuc(String duc) {
    this.duc = duc;
  }

  public String getZdate() {
    return zdate;
  }

  public void setZdate(String zdate) {
    this.zdate = zdate;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", age=" + age + ", duc=" + duc + ", zdate=" + zdate + "]";
  }

}
