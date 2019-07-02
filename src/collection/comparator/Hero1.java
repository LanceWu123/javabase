package collection.comparator;

/**
 * ClassName: Hero1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/28 19:19
 * Description:
 */

public class Hero1 {
    public String name;
    public float hp;
    public int damage;

    public Hero1() {

    }

    public Hero1(String name) {

        this.name = name;
    }
    @Override
    public String toString() {
        return "Hero1 [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public Hero1(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

}
