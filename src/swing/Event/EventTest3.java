package swing.Event;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName: EventTest3
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 16:32
 * Description:
 */

/**
 * 适配器监听事件
 * 对比EventTest2,可以无需重写全部方法，而只选取需要的，本例用的是windowClosing方法
 */

public class EventTest3 {
public static void main(String[] args){
    JFrame jf=new JFrame("swing事件测试窗体");
jf.addWindowListener(new WindowAdapter() {    //同样用匿名类实现
    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        System.out.println("窗口关闭....");
    }
});
    jf.setSize(500,200);
    jf.setLocation(700,400);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}

}
