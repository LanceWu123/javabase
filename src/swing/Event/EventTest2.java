package swing.Event;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * ClassName: EventTest2
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 16:20
 * Description:
 */

/**
 * 窗体监听事件
 */

public class EventTest2 {
public static void main(String[] args){
    JFrame jf=new JFrame("swing事件测试窗体");
    jf.addWindowListener(new WindowListener() {   //使用了和上一个actionlistener不同的创建方式：使用匿名类 避免多创建一个类
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("窗口被打开。。。");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("窗口关闭。。。");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("窗口被关闭。。。");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("窗口最小化。。。");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("窗口从最小化恢复。。。");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("窗口被选中。。。");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("窗口选中被取消。。。");
        }
    });
    jf.setSize(500,200);
    jf.setLocation(700,400);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
