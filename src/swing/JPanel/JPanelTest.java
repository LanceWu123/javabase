package swing.JPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * ClassName: JPanelTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 15:51
 * Description:
 */

public class JPanelTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JPanel面板测试窗体");
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3, 2, 10, 10));
        jp.setBorder(new EmptyBorder(10,10,10,10));//设置边距
        jf.add(jp);
        JLabel jl1 = new JLabel("用户名:");
        JTextField jtf = new JTextField();
        JLabel jl2 = new JLabel("密码：");
        JPasswordField jpf = new JPasswordField();
        JButton jb1=new JButton("登陆");
        JButton jb2=new JButton("重置");
        jp.add(jl1);
        jp.add(jtf);
        jp.add(jl2);
        jp.add(jpf);
        jp.add(jb1);
        jp.add(jb2);
        jf.setLocation(700, 400);
        jf.setSize(500, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
