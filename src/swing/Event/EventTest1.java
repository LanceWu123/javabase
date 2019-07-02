package swing.Event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClassName: EventTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 16:07
 * Description:
 */


/**
 * 动作监听事件
 */
class JButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {   //设置一个按钮监听
        System.out.println(e.getActionCommand());//点击按钮后返回按钮的文本描述（即按钮名称）
        JOptionPane.showMessageDialog(null,"被点击"); //点击按钮后弹出框的内容
    }
}

public class EventTest1 {
public static void main(String[] args){
    JFrame jf=new JFrame("swing事件测试窗体");
    JButtonListener jbl=new JButtonListener();
    JButton jb=new JButton("事件触发");
    jb.addActionListener(jbl);   //将按钮监听加入按钮中触发
    jf.add(jb);
    jf.setSize(500,200);
    jf.setLocation(700,400);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
