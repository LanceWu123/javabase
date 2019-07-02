package collection;

/**
 * ClassName: Set
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/28 18:42
 * Description:
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * HashSet： 无序
 * LinkedHashSet： 按照插入顺序
 * TreeSet： 从小到大排序
 */
public class Set {
    public static void main(String[] args) {
        HashSet<Integer> numberSet1 =new HashSet<Integer>();
        //HashSet中的数据不是按照插入顺序存放
        numberSet1.add(88);
        numberSet1.add(8);
        numberSet1.add(888);
        System.out.println(numberSet1);

        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);

        System.out.println(numberSet2);
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();
        //TreeSet 中的数据是进行了排序的
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);

        System.out.println(numberSet3);

    }
}
