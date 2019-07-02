package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Reverse
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/27 16:21
 * Description:
 */

/**
 * reverse 使List中的数据发生翻转
 */
public class Reverse {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.reverse(numbers);

        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);

    }
}
