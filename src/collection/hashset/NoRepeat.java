package collection.hashset;

import java.util.HashSet;

/**
 * ClassName: NoRepeat
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/26 15:34
 * Description:
 */

/**
 * Set中的元素，不能重复
 */
public class NoRepeat {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("gareen");

        System.out.println(names);

        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen");
        System.out.println(names);
    }
}
