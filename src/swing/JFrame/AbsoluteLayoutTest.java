package swing.JFrame;

import javax.swing.*;

/**
 * ClassName: AbsoluteLayoutTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 14:59
 * Description:
 */

public class AbsoluteLayoutTest {
public static void main(String[] args){
    JFrame jf = new JFrame("GridLayout测试");//创建窗体并命名
jf.setLayout(null);//设置layout为空，进行绝对布局
JButton jb1=new JButton("按钮一");
JButton jb2=new JButton("按钮二");
    jf.add(jb1);
    jf.add(jb2);
    jb2.setBounds(80,60,200,50);//按钮二离左边界80 离右边界60 按钮二宽度为200 高度为50
    jb1.setBounds(50,10,100,20);//按钮一离左边界50 离右边界10 按钮一宽度为100 高度为20

    jf.setLocation(700, 400);//设置窗体出现位置
    jf.setSize(500, 200);//设置窗体大小
    jf.setVisible(true);//让窗体可视化
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
