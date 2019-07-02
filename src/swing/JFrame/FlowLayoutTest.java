package swing.JFrame;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: FlowLayoutTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 13:13
 * Description:
 */

public class FlowLayoutTest {
public static void main(String[] args){
    JFrame jf=new JFrame("FlowLayout测试");//创建窗体并命名
    jf.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));//设置流式布局(左对齐,间隔)
    JButton jb=null;
    for (int i=0;i<9;i++){
     jb=new JButton("JButton"+i);
     jf.add(jb);
    }
    jf.setLocation(700,400);//设置窗体出现位置
    jf.setSize(500,200);//设置窗体大小
    jf.setVisible(true);//让窗体可视化
    jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
}
