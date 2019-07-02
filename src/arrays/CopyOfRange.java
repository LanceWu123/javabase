package arrays;

import java.util.Arrays;

/**
 * ClassName: CopyOfRange
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/25 11:03
 * Description:
 */

/**
 * 与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
 * 不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。
 * copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。
 * 除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。
 */
public class CopyOfRange {
public static void main(String[] args){
    int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
    // copyOfRange(int[] original, int from, int to)
    // 第一个参数表示源数组
    // 第二个参数表示开始位置(取得到)
    // 第三个参数表示结束位置(取不到)
    int[] b = Arrays.copyOfRange(a, 0, 3);

    for (int i = 0; i < b.length; i++) {
        System.out.print(b[i] + " ");
    }

}
}
