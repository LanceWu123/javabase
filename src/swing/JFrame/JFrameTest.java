package swing.JFrame;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: JFrameTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 12:41
 * Description:
 */

public class JFrameTest {
public static void main(String[] args){
 JFrame jf=new JFrame("JFrame窗体");//创建窗体并命名
    Container c=jf.getContentPane();
    c.setBackground(Color.red);//设置背景颜色
 jf.setLocation(700,400);//设置窗体出现位置
 jf.setSize(500,200);//设置窗体大小
 jf.setVisible(true);//让窗体可视化
}
}
