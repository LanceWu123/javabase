package thread.Runnable;

/**
 * ClassName: RunnableText
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/21 17:48
 * Description:
 */

public class RunnableText implements Runnable{

    private static int i=1;
    private String threadName;
    public RunnableText(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override//同步方法
    public synchronized void run() {
        while (i<=100){
            System.out.println(threadName+i);
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
    /* RunnableText t1=new RunnableText("m");
     RunnableText t2=new RunnableText("n");
     new thread(t1).start();
     new thread(t2).start();*/

    RunnableText t1=new RunnableText("a");
    RunnableText t2=new RunnableText("b");
    RunnableText t3=new RunnableText("c");
    Thread t11=new Thread(t1);
    Thread t12=new Thread(t2);
    Thread t13=new Thread(t3);
    //thread.sleep(2000);
    t11.start();
    t12.start();
    t13.start();

    }
}
