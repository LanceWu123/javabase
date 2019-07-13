package genericity;

import java.util.LinkedList;

/**
 * ClassName: Test
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/7/13 15:49
 * Description:
 */


/**
 * 如果希望只取出，不插入，就使用? extends Hero
 * 如果希望只插入，不取出，就使用? super Hero
 * 如果希望，又能插入，又能取出，就不要用通配符？
 * @param <T>
 *     ps.子类泛型不可以转换为父类泛型  父类泛型不可以转换为子类泛型
 *
 */


class MyStack<T>{
    LinkedList<T> values=new LinkedList<>();

    public void push(T t){
        values.addLast(t);
    }

    public T pull(){
        return values.removeLast();
    }

    public T peek(){
        return values.getLast();
    }
}

public class Test {
    public static void main(String[] args){
        MyStack<Integer> stack1=new MyStack<>();
        MyStack<String>  stack2=new MyStack<>();
        stack1.push(1);
        stack2.push("abc");
        stack1.push(2);
        stack2.push("def");
        System.out.println(stack1.peek());
        System.out.println(stack2.peek());
        stack1.pull();
        stack2.pull();
        System.out.println(stack1.peek());
        System.out.println(stack2.peek());
    }
}
