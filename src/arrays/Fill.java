package arrays;

import java.util.Arrays;

/**
 * ClassName: Equals
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/25 11:19
 * Description:
 */

/**
 * 使用同一个值，填充整个数组
 */
public class Fill {
public static void main(String[] args){
    int a[] = new int[10];

    Arrays.fill(a, 5);

    System.out.println(Arrays.toString(a));
}
}
