package annotation.user_defined;

/**
 * ClassName: DBUtil_2_Annotation
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/13 14:24
 * Description:
 */

/**
 * 有了自定义注解@JDBCConfig之后，我们就把非注解方式DBUtil改造成为注解方式DBUtil。
 * 如例所示，数据库相关配置信息本来是以属性的方式存放的，现在改为了以注解的方式，提供这些信息了。
 *
 * 注： 目前只是以注解的方式提供这些信息，但是还没有解析，接下来进行解析
 */
@JDBCConfig(ip = "127.0.0.1", database = "web01", encoding = "UTF-8", loginName = "root", password = "root")
public class DBUtil_2_Annotation {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
