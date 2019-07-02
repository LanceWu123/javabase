package collection.collections;

/**
 * ClassName: SynchronizedList
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/27 16:36
 * Description:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * synchronizedList 把非线程安全的List转换为线程安全的List。
 *
 */
public class SynchronizedList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);

    }
}
