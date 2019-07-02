package swing.SwingTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClassName: SwingTest1
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 16:48
 * Description:
 */

public class SwingTest1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Swing综合示例测试窗体");
        jf.setLayout(null);//使用绝对布局
        final JTextField num1Txt = new JTextField();
        JLabel fuhao = new JLabel("+", JLabel.CENTER);
        final JTextField num2Txt = new JTextField();
        final JTextField resultTxt = new JTextField();
        JButton jb = new JButton("=");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = num1Txt.getText(); //获取第一个数字文本
                String s2 = num2Txt.getText(); //获取第二个数字文本
                int result = Integer.parseInt(s1) + Integer.parseInt(s2);
                resultTxt.setText(result + "");
            }
        });
        num1Txt.setBounds(20, 60, 50, 25);
        fuhao.setBounds(80, 60, 50, 25);
        num2Txt.setBounds(140, 60, 50, 25);
        jb.setBounds(220, 60, 50, 25);
        resultTxt.setBounds(300, 60, 50, 25);
        jf.add(num1Txt);
        jf.add(fuhao);
        jf.add(num2Txt);
        jf.add(jb);
        jf.add(resultTxt);
        jf.setLocation(700, 400);
        jf.setSize(390, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
