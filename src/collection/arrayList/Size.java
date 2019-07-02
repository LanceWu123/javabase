package collection.arrayList;

/**
 * ClassName: Size
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/21 15:03
 * Description:
 */

import collection.Hero;

import java.util.ArrayList;

/**
 * size 用于获取ArrayList的大小
 */
public class Size {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        System.out.println(heros);
        System.out.println("获取ArrayList的大小：");
        System.out.println(heros.size());
    }
}
