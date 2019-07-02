package collection;

/**
 * ClassName: Hero1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/21 14:51
 * Description:
 */

public class Hero {

        public String name;
        public float hp;

        public int damage;

        public Hero() {

        }

        // 增加一个初始化name的构造方法
        public Hero(String name) {

            this.name = name;
        }

        // 重写toString方法
        @Override
        public String toString() {
            return name;
        }

    }

