package swing.JLabel;

import javax.swing.*;

/**
 * ClassName: JLabelTest
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/22 15:14
 * Description:
 */

public class JLabelTest{
   public static void main(String[] args){
       JFrame jf=new JFrame("JLabel测试窗体");
       JLabel jl=new JLabel("JLabel组件",JLabel.CENTER);//设置JLabel组件并居中
       jf.add(jl);
       jf.setLocation(700,400);
       jf.setSize(500,200);
       jf.setVisible(true);
       jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }
}
