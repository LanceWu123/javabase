package exception;

/**
 * ClassName: DIYException
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/5/29 16:27
 * Description:
 */
class EnemyDIYExceptionIsDeadException extends Exception{

    public EnemyDIYExceptionIsDeadException(){

    }
    public EnemyDIYExceptionIsDeadException(String msg){
        super(msg);
    }
}
public class DIYException {
    public String name;
    protected float hp;

    public void attackDIYException(DIYException h) throws EnemyDIYExceptionIsDeadException{
        if(h.hp == 0){
            throw new EnemyDIYExceptionIsDeadException(h.name + " 已经挂了,不需要施放技能" );
        }
    }

    @Override
    public String toString(){
        return name;
    }

    class EnemyDIYExceptionIsDeadException extends Exception{

        public EnemyDIYExceptionIsDeadException(){

        }
        public EnemyDIYExceptionIsDeadException(String msg){
            super(msg);
        }
    }

    public static void main(String[] args) {

        DIYException garen =  new DIYException();
        garen.name = "盖伦";
        garen.hp = 616;

        DIYException teemo =  new DIYException();
        teemo.name = "提莫";
        teemo.hp = 0;

        try {
            garen.attackDIYException(teemo);

        } catch (EnemyDIYExceptionIsDeadException e) {
            // TODO Auto-generated catch block
            System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
        }

    }
}
