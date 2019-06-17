package com.shenmm.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:申明明(823865618@qq.com)
 * <br>Date:2019年6月17日
 */
public class RandomUtil {
  //方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明823865618@qq.com)
   * <br>Date:2019年6月17日
   * @param min
   * @param max
   * @return
   */
  public static int random(int min, int max) {
    //TODO 实现代码
    Random r = new Random();
    int ss = (r.nextInt(max - min + 1) + min);
    return ss;
  }

  //方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   * @param min
   * @param max
   * @param subs
   * @return
   */
  public static Set subRandom(int min, int max, int subs) {
    //TODO 实现代码
    Set set = new HashSet();
    while (set.size() != subs) {
      Random r = new Random();
      int ss = (r.nextInt(max - min + 1) + min);
      set.add(ss);
    }
    return set;

  }

  //方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   * @return
   */
  public static char randomCharacter() {
    //TODO 实现代码
    String str = "123456789zxcvbnmasdfghjklqwertyuiop";
    Random r = new Random();
    int ss = r.nextInt(str.length());
    return str.charAt(ss);
  }

  //方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
  /**
   * 
   * <br>Description:TODO 方法功能描述
   * <br>Author:申明明(823865618@qq.com)
   * <br>Date:2019年6月17日
   * @param length
   * @return
   */
  public static String randomString(int length) {
    //TODO 实现代码
    String st = "";
    for (int i = 0; i < length; i++) {
      char c = RandomUtil.randomCharacter();
      st += c;
    }
    return st;
  }
}
