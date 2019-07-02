package collection.arrayList;

import collection.Hero;

import java.util.ArrayList;

/**
 * ClassName: Get
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/21 14:58
 * Description:
 */

/**
 * 通过get获取指定位置的对象，如果输入的下标越界，一样会报错
 */
public class Get {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        System.out.println(heros.get(6));

    }
}
