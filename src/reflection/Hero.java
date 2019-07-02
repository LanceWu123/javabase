package reflection;

/**
 * ClassName: Hero1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/29 16:38
 * Description:
 */

public class Hero {
    public String name;
    public float hp;
    public int damage;
    public int id;

    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }
}
