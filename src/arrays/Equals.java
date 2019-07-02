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
 * 比较两个数组的内容是否一样
 * 第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false
 */
public class Equals {
    public static void main(String[] args) {
            int a[] = new int[]{18, 62, 68, 82, 65, 9};
            int b[] = new int[]{18, 62, 68, 82, 65, 8};
            System.out.println(Arrays.equals(a, b));

    }
}
