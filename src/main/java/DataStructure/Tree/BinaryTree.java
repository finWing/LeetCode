package DataStructure.Tree;

//二叉树的接口，可以有不同的实现类
//每个类可以使用不同的存储结构，比如顺序结构，链式结构

public interface BinaryTree {

    //二叉树是否为空
    public boolean isEmpty();


    //获取节点的数量
    public int size();

    //获取二叉树的高度
    public int getHeight();

    //查找
    public Node findKey(int value);

    //前序遍历递归操作
    public void preOrderTraverse();

    //中序遍历递归操作
    public void inOrderTraverse();

    //中序遍历递归传值
    public void inOrderTraverse(Node root);

    //后序遍历递归操作
    public void postOrderTraverse();

    //后续遍历递归船只
    public void postOrderTraverse(Node root);

    //中序遍历非递归操作(借助栈)
  public void inOrderByStack();

    //按照层次遍历(借助队列)
    public void levelOrderByStack();

}
