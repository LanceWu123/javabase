package arrays;

import java.util.Arrays;

/**
 * ClassName: BinarySearch
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/25 11:17
 * Description:
 */

/**
 * 查询元素出现的位置
 * 需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
 * 如果数组中有多个相同的元素，查找结果是不确定的
 */
public class BinarySearch {
    public static void main(String[] args) {
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));
    }
}
