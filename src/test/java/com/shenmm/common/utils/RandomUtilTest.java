package com.shenmm.common.utils;

import org.junit.Test;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:申明明(823865618@qq.com)
 * <br>Date:2019年6月17日
 */
public class RandomUtilTest {
  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   */
  @Test
  public void testRandom() {
    for (int i = 0; i < 100; i++) {
      System.out.print(RandomUtil.random(1, 12) + "  ");
    }

  }

  @Test
  public void testSubRandom() {
    for (int i = 0; i < 100; i++) {
      System.out.print(RandomUtil.subRandom(1, 20, 5) + "  ");
    }
  }

  @Test
  public void testRandomCharacter() {
    for (int i = 0; i < 100; i++) {
      System.out.print(RandomUtil.randomCharacter() + "  ");
    }
  }

  @Test
  public void testRandomString() {
    for (int i = 0; i < 100; i++) {
      System.out.print(RandomUtil.randomString(4) + "  ");
    }
  }

}
