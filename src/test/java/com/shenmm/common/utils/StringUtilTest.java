package com.shenmm.common.utils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.shenmm.common.entity.User;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:申明明(823865618@qq.com)
 * <br>Date:2019年6月17日
 */
public class StringUtilTest {
  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   * @throws UnsupportedEncodingException
   */
  @Test
  public void testHasLength() throws UnsupportedEncodingException {
    for (int i = 0; i < 100; i++) {
      System.out.print(StringUtil.randomoneChineseString() + "  ");
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   * @throws UnsupportedEncodingException
   */
  @Test
  public void testHasText() throws UnsupportedEncodingException {
    for (int i = 0; i < 100; i++) {
      System.out.print(StringUtil.generateChineseName() + "  ");
    }
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   */
  @Test
  public void testRandomoneChineseString() {
    System.out.print(StringUtil.hasLength(" ") + "  ");
  }

  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   */
  @Test
  public void testRandomChineseString() {
    System.out.print(StringUtil.hasText(" ") + "  ");
  }

  @Test
  public void testGenerateChineseName() throws UnsupportedEncodingException {
    System.out.println(StringUtil.randomChineseString(5));
  }

  @Test
  public void testGenerateUser() throws UnsupportedEncodingException {
    SimpleDateFormat sd = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
    Date dd = new Date();

    Calendar inst = Calendar.getInstance();

    for (int i = 0; i < 10000; i++) {
      User u = new User(StringUtil.generateChineseName(), RandomUtil.random(1, 120),
        StringUtil.randomChineseString(140), sd.format(new Date()));
      System.out.println(u);
    }

  }

}
