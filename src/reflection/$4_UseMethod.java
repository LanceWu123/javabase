package reflection;

import java.lang.reflect.Method;

/**
 * ClassName: $4_UseMethod
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/7/14 21:07
 * Description:
 */

public class $4_UseMethod {
    public static void main(String[] args) {
        Hero h=new Hero();
        try {
            // 获取这个名字叫做setName，参数类型是String的方法
            Method m = h.getClass().getMethod("setName", String.class);
            // 对h对象，调用这个方法
            m.invoke(h, "盖伦");
            // 使用传统的方式，调用getName方法
            System.out.println(h.getName());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
