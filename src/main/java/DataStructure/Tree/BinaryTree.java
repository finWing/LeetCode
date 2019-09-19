package DataStructure.Tree;

//�������Ľӿڣ������в�ͬ��ʵ����
//ÿ�������ʹ�ò�ͬ�Ĵ洢�ṹ������˳��ṹ����ʽ�ṹ

public interface BinaryTree {

    //�������Ƿ�Ϊ��
    public boolean isEmpty();


    //��ȡ�ڵ������
    public int size();

    //��ȡ�������ĸ߶�
    public int getHeight();

    //����
    public Node findKey(int value);

    //ǰ������ݹ����
    public void preOrderTraverse();

    //��������ݹ����
    public void inOrderTraverse();

    //��������ݹ鴫ֵ
    public void inOrderTraverse(Node root);

    //��������ݹ����
    public void postOrderTraverse();

    //���������ݹ鴬ֻ
    public void postOrderTraverse(Node root);

    //��������ǵݹ����(����ջ)
  public void inOrderByStack();

    //���ղ�α���(��������)
    public void levelOrderByStack();

}
