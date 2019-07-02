package collection.binaryTree;

/**
 * ClassName: TestInsert
 * student ID:   20162180121
 * Author:   wujiayuan
 * E-mail:   1107661085@qq.com
 * Date:     2019/6/22 19:12
 * Description:
 */

/**
 * 假设通过二叉树对如下10个随机数进行排序
 * 67,7,30,73,10,0,78,81,10,74
 * 排序的第一个步骤是把数据插入到该二叉树中
 * 插入基本逻辑是，小、相同的放左边，大的放右边
 * 1. 67 放在根节点
 * 2. 7 比 67小，放在67的左节点
 * 3. 30 比67 小，找到67的左节点7，30比7大，就放在7的右节点
 * 4. 73 比67大， 放在67的右节点
 * 5. 10 比 67小，找到67的左节点7，10比7大，找到7的右节点30，10比30小，放在30的左节点。
 * ...
 * ...
 * 9. 10比67小，找到67的左节点7，10比7大，找到7的右节点30，10比30小，找到30的左节点10，10和10一样大，放在左边
 */


class Node1 {
    // 左子节点
    public Node1 leftNode;
    // 右子节点
    public Node1 rightNode;

    // 值
    public Object value;

    // 插入 数据
    public void add(Object v) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value) {
            value = v;
        }

        // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同

            if ((Integer) v - ((Integer) value) <= 0) {
                if (null == leftNode) {
                    leftNode = new Node1();
                }
                leftNode.add(v);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode) {
                    rightNode = new Node1();
                }
                rightNode.add(v);
            }

        }
    }
}
public class TestInsert {
    public static void main(String[] args) {

        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };

        Node1 roots = new Node1();
        for (int number : randoms) {
            roots.add(number);
        }

    }
}
