package collection.arrayList;

import collection.Hero;

import java.util.ArrayList;

/**
 * ClassName: Add
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/21 14:52
 * Description:
 */

public class Add {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 把5个对象加入到ArrayList中
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        System.out.println(heros);

        // 在指定位置增加对象
        Hero specialHero = new Hero("special hero");
        heros.add(3, specialHero);

        System.out.println(heros.toString());

    }
}
