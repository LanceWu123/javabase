package swing.JLabel;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: JTextFieldTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 15:41
 * Description:
 */

public class JTextFieldTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JTextField单行文本框测试窗体");
        jf.setLayout(new GridLayout(1, 2, 10, 10));
        JLabel jl = new JLabel("用户名：");
        JTextField jtf = new JTextField();
        jf.add(jl);
        jf.add(jtf);
        jf.setLocation(700, 400);
        jf.setSize(300, 100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
