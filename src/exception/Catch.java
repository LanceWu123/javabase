package exception;

/**
 * ClassName: Catch
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/29 16:17
 * Description:
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 多异常捕捉
 *
 */

/* 方法一：
catch (FileNotFoundException e) {
        System.out.println("d:/LOL.exe不存在");
        e.printStackTrace();
        } catch (ParseException e) {
        System.out.println("日期格式解析错误");
        e.printStackTrace();
        }*/


//方法二：
public class Catch {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException | ParseException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("d:/LOL.exe不存在");
            }
            if (e instanceof ParseException) {
                System.out.println("日期格式解析错误");
                e.printStackTrace();
            }
        }
    }
}