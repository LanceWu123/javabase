package arrays;

/**
 * ClassName: FindMax
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/25 10:23
 * Description:
 */

public class FindMax {
public static void main(String[] args){
 int [][]a=new int [5][5];
 for(int i=0;i<5;i++){
for (int j=0;j<5;j++){
    a[i][j]=(int)(Math.random()*100);
}
 }
    for(int i=0;i<5;i++){
        for (int j=0;j<5;j++){
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
int m=0,n=0;
    for(int i=0;i<5;i++){
        for (int j=0;j<5;j++){
          if(a[i][j]>a[m][n]){
              a[m][n]=a[i][j];
              m=i;n=j;
          }
          }

        }

    System.out.println("最大数为："+a[m][n]);
    System.out.println("其坐标为："+"["+m+"]"+"["+n+"]");
}
}
