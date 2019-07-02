import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

/**
 * ClassName: SwingTest2
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/28 13:32
 * Description:
 */

public class SwingTest2 {
    public static void main(String[] args) throws AWTException {
        Robot robot=new Robot();
        JFrame jf=new JFrame("1");//创建窗体并命名
        jf.setLayout(new FlowLayout(FlowLayout.CENTER,200,20));
        JButton jb=new JButton(" ON ");
        JButton jb2=new JButton("EXIT");

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(true){
                   System.out.println("单击");
                    robot.mouseMove(880,780);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.delay(60000);
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        jf.add(jb);
        jf.add(jb2);
        jf.setLocation(700,400);//设置窗体出现位置
        jf.setSize(200,180);//设置窗体大小
        jf.setVisible(true);//让窗体可视化
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
