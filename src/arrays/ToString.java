package arrays;

import java.util.Arrays;

/**
 * ClassName: ToString
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/25 11:09
 * Description:
 */

/**
 * 如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
 *
 * 但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容
 */
public class ToString {
    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        String content = Arrays.toString(a);
        System.out.println(content);

    }
}
