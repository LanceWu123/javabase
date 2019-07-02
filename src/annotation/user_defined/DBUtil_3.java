package annotation.user_defined;

/**
 * ClassName: DBUtil_3
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/13 14:39
 * Description:
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 接下来就通过反射，获取这个DBUtil这个类上的注解对象
 * JDBCConfig config = DBUtil.class.getAnnotation(JDBCConfig.class);
 *
 拿到注解对象之后，通过其方法，获取各个注解元素的值：

 String ip = config.ip();
 int port = config.port();
 String database = config.database();
 String encoding = config.encoding();
 String loginName = config.loginName();
 String password = config.password();


 后续就一样了，根据这些配置信息得到一个数据库连接Connection实例。
 */
@JDBCConfig(ip = "127.0.0.1", database = "web01", encoding = "UTF-8", loginName = "root", password = "root")
public class DBUtil_3 {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException, NoSuchMethodException, SecurityException {
        JDBCConfig config = DBUtil_3.class.getAnnotation(JDBCConfig.class);

        String ip = config.ip();
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String loginName = config.loginName();
        String password = config.password();

        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&useSSL=true", ip, port, database, encoding);
        return DriverManager.getConnection(url, loginName, password);
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, SQLException {
        Connection c = getConnection();
        System.out.println(c);
    }
}
