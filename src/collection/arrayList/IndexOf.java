package collection.arrayList;

/**
 * ClassName: IndexOf
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/21 14:59
 * Description:
 */

import collection.Hero;

import java.util.ArrayList;

/**
 * indexOf用于判断一个对象在ArrayList中所处的位置
 * 与contains一样，判断标准是对象是否相同，而非对象的name值是否相等
 */
public class IndexOf {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);
        System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));

    }
}
