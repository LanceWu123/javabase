package reflection;

import java.lang.reflect.Field;

/**
 * ClassName: $3_ChangeValue
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/7/14 20:37
 * Description:
 */

/**
 * 通过反射修改属性的值
 * 对于private修饰的成员，需要使用setAccessible(true)才能访问和修改。
 * getField和getDeclaredField的区别
 * 这两个方法都是用于获取字段
 * getField 只能获取public的，包括从父类继承来的字段。
 * getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。
 * (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
 */

public class $3_ChangeValue {
public static void main(String[] args){
 Hero h=new Hero("garen");
 try {
     System.out.println(h.getName());
     Field f=h.getClass().getDeclaredField("name");
     f.set(h,"teemo");
     System.out.println(h.getName());
 }catch (IllegalAccessException e){
e.printStackTrace();
 }catch (NoSuchFieldException e){
     e.printStackTrace();
 }
}
}
