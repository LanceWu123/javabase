package reflection;
/**
 * ClassName: $1_GetClass
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/29 16:35
 * Description:
 */

/**
 * 获取类对象有3种方式
 * 1. Class.forName
 * 2. 类名.class
 * 3. new 类名().getClass()
 * 在一个JVM中，一种类，只会有一个类对象存在。所以以上三种方式取出来的类对象，都是一样的。
 * 注： 准确的讲是一个ClassLoader下，一种类，只会有一个类对象存在。通常一个JVM下，只会有一个ClassLoader。
 */
public class $1_GetClass {
public static void main(String[] args){
    String className = "reflection.Hero1";
    try {
        Class pClass1=Class.forName(className);
        Class pClass2= Hero.class;
        Class pClass3=new Hero().getClass();
        System.out.println(pClass1==pClass2);
        System.out.println(pClass1==pClass3);
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
