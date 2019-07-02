package reflection;

/**
 * ClassName: $2_TestReflection
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/29 16:42
 * Description:
 */

/**
 * 为Hero增加一个静态属性,并且在静态初始化块里进行初始化
 * static String copyright;
 * static {
 *     System.out.println("初始化 copyright");
 *     copyright = "版权由Riot Games公司所有";
 * }
 *
 *
 无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次。
 （除了直接使用 Class c = Hero1.class 这种方式，这种方式不会导致静态属性被初始化）
 */
public class $2_TestReflection {
    public static void main(String[] args) {
        String className = "reflection.Hero1";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;  //这种方式不会导致静态属性被初始化
            Class pClass3=new Hero().getClass();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
