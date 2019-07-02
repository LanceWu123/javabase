package thread.ThreadDemo;

/**
 * ClassName: arrays.ArrayCopy
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/21 17:05
 * Description:
 */

public class Demo1 {
    public static void main(String[] args){
        Eat e=new Eat();
        Laugh l=new Laugh();
        e.start();
        l.start();
    }

}
