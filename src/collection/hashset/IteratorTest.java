package collection.hashset;

/**
 * ClassName: IteratorTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/26 16:00
 * Description:
 */

import java.util.HashSet;
import java.util.Iterator;

/**
 * Set不提供get()来获取指定位置的元素
 * 所以遍历需要用到迭代器，或者增强型for循环
 */
public class IteratorTest {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            numbers.add((int)(Math.random()*30));
        }

        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)

        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> it = numbers.iterator(); it.hasNext();) {
            Integer i = it.next();
            System.out.println(i);
        }

        //或者采用增强型for循环
        for (Integer i : numbers) {
            System.out.println(i);
        }

    }
}
