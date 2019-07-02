package arrays;

/**
 * ClassName: arrays.ArrayCopy
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/25 10:18
 * Description:
 */

public class ArrayCopy {
public static void main(String[] args){
 int []a={1,2,3,4,5};
 int []b={6,7,8,9,10};
int []c=new int[10];
System.arraycopy(a,0,c,0,5);
System.arraycopy(b,0,c,5,5);
for(int i:c){
    System.out.print(" "+i);
}
}
}
