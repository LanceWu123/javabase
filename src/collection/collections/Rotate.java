package collection.collections;

/**
 * ClassName: Rotate
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/27 16:26
 * Description:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * rotate 把List中的数据，向右滚动指定单位的长度
 */
public class Rotate {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
        System.out.println(numbers);

    }
}
