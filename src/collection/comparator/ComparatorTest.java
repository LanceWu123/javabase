package collection.comparator;

/**
 * ClassName: ComparatorTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/28 19:20
 * Description:
 */

import java.util.*;

/**
 * 假设Hero有三个属性 name,hp,damage
 * 一个集合中放存放10个Hero,通过Collections.sort对这10个进行排序
 * 那么到底是hp小的放前面？还是damage小的放前面？Collections.sort也无法确定
 * 所以要指定到底按照哪种属性进行排序
 * 这里就需要提供一个Comparator给定如何进行两个对象之间的大小比较
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Random r =new Random();
        List<Hero1> heros = new ArrayList<Hero1>();

        for (int i = 0; i < 10; i++) {
            //通过随机值实例化hero的hp和damage
            heros.add(new Hero1("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);

        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //Collections.sort(heros);

        //引入Comparator，指定比较的算法
        Comparator<Hero1> c = new Comparator<Hero1>() {
            @Override
            public int compare(Hero1 h1, Hero1 h2) {
                //按照hp进行排序
                if(h1.hp>=h2.hp)
                { return 1;}  //正数表示h1比h2要大
                else
                { return -1;}
            }
        };
        Collections.sort(heros,c);
        System.out.println("按照血量排序后的集合：");
        System.out.println(heros);
    }
}
