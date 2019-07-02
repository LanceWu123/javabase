package thread.Runnable;

/**
 * ClassName: Hero1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 12:12
 * Description:
 */

public class RunnableText2 implements Runnable {
private int baozi=10;
    @Override
    public void run() {
        /**
         * 同步块
         */
        synchronized (this){
            while (baozi>0){
                System.out.println(Thread.currentThread().getName()+":吃了第"+baozi+"个包子");
                baozi--;
            }

        }
    }
    public static void main(String[] args){
     RunnableText2 t1=new RunnableText2();
     new Thread(t1,"张三").start();
     new Thread(t1,"李四").start();
     new Thread(t1,"王五").start();
    }
}
