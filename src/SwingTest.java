import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SwingTest {
    public static void listFile(File file){
        if(file!=null){
            if(file.isDirectory()){
                File[] f=file.listFiles();
                if(f!=null){
                    for(int i=0;i<f.length;i++){
                        listFile(f[i]);
                        file.setLastModified(System.currentTimeMillis());
                    }
                }
            }
            else{
                file.setLastModified(System.currentTimeMillis());
            }
        }
    }
    public static void main(String[] args){
        JFrame jf=new JFrame("修改最后修改日期");
        jf.setLayout(null);
        final JTextField addr=new JTextField();
        JButton jb=new JButton("修改");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = addr.getText();
                File file=new File(s1);
                SwingTest.listFile(file);
                JOptionPane.showMessageDialog(null,"修改完成");
            }
        });
        addr.setBounds(40,50,300,30);
        jb.setBounds(140,100,80,20);
        jf.add(addr);
        jf.add(jb);
        jf.setLocation(700, 400);
        jf.setSize(390, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
