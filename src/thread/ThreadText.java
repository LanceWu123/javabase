package thread;

/**
 * ClassName: ThreadText
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/21 17:37
 * Description:
 */

public class ThreadText extends Thread{
private String threadName;
   private int i=1;
    public ThreadText(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
      while (i<10){
          System.out.println(threadName+i);
          i++;
      }
    }

    public static void main(String[] args){
     ThreadText t1=new ThreadText("m");
     ThreadText t2=new ThreadText("n");
     t1.start();
     t2.start();
    }
}
