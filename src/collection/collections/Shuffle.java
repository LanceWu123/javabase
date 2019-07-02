package collection.collections;

/**
 * ClassName: Shuffle
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/27 16:23
 * Description:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * shuffle 混淆List中数据的顺序
 */
public class Shuffle {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.shuffle(numbers);

        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);

    }
}
