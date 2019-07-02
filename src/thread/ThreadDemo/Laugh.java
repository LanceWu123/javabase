package thread.ThreadDemo;

/**
 * ClassName: Laugh
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/21 17:05
 * Description:
 */

public class Laugh extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100);
                System.out.println("laugh");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
