package DataStructure.Tree;

import java.util.*;

public class LinkedBinaryTree implements BinaryTree {
    private Node root;//���ڵ�





    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        System.out.println("�������ڵ������");
        return this.size(root);
    }

    //�ж϶������ĳ���
    public int size(Node root){
        if(root==null){
            return 0;
        }
        else{
            //��ȡ��������size
            int lt=this.size(root.rightChild);
            //��ȡ��������size
            int rt=this.size(root.rightChild);
            //����ڵ���ҽڵ��size��Ӳ����ϸ��ڵ��size
            return lt+rt+1;
        }
    }

    //��ȡ�������ĸ߶�
    @Override
    public int getHeight() {

        System.out.println("�������ĸ߶�");

        return this.getHeight(root);
    }

    private int getHeight(Node root){
        if(root==null){
          return 0;
        }else{
            //��ȡ�������ĸ߶�
           int nl=this.getHeight(root.leftChild);
            //��ȡ�������ĸ߶�
           int nr=this.getHeight(root.rightChild);
            //�������������������ϴ�߶Ȳ�+1
            return  nl>nr ? nl+1:nr+1;
        }

    }



    @Override
    //����ݹ����������
    public void preOrderTraverse() {
      //������ڵ��ֵ
        if(root !=null){
            System.out.println(root.value);
            //�������������������
            //����һ���������������������ĸ�
            BinaryTree leftTree=new LinkedBinaryTree(root.leftChild);
            leftTree.preOrderTraverse();
            //�������������������
            //����һ���������������������ĸ�
            BinaryTree rightTree=new LinkedBinaryTree(root.rightChild);
            rightTree.preOrderTraverse();
        }
    }

    @Override


    //����ݹ����������
    public void inOrderTraverse(){
        System.out.println("�������");
        this.inOrderTraverse(root);
//        System.out.println();
    }

        @Override
        public void inOrderTraverse(Node root){
        if(root!=null){
        //����������
            this.inOrderTraverse(root.leftChild);
            //�������ֵ
            System.out.println(root.value);
            //����������
            this.inOrderTraverse(root.rightChild);
        }
    }

    @Override


    //����ݹ����������
    public void postOrderTraverse(){
        System.out.println("�������");
        this.postOrderTraverse(root);
        System.out.println();
    }

    public void postOrderTraverse(Node root){
        if(root!=null){
            this.postOrderTraverse(root.leftChild);
            this.postOrderTraverse(root.rightChild);
            System.out.println(root.value);
        }

    }


    //����ǵݹ����(����ջ)
    @Override
    public void inOrderByStack() {
        System.out.println("����ǵݹ����");
        //����ջ
        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.leftChild;
            }
            if (!stack.isEmpty()) {
                current = stack.pop();
                System.out.println(current.value + " ");
                current = current.rightChild;
            }

        }
    }

    //���ղ�α���������(��������)

    public void levelOrderByStack() {

        System.out.println("���������ղ�α���");
        if(root==null) return;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(queue.size()!=0){
           int len=queue.size();
           for(int i=0;i<len;i++){
               Node temp=queue.poll();
               System.out.println(temp.value+" ");
               if(root.leftChild!=null) queue.add(root.leftChild);
               if(root.rightChild!=null) queue.add(root.rightChild);
           }
        }


    }

    //���Ҷ������е�ĳ��ֵ
    public Node findKey(int value){
        return this.findKey(value,root);
    }

    public Node findKey(Object value,Node root){

        if(root ==null){//�ڵ�Ϊ�գ��������������ĸ��ڵ㣬Ҳ�����ǵݹ������Ҷ�ӽڵ�����Ӻ��Һ���
            return null;
        }
        else if(root!=null && root.value==value){//�ݹ�Ľ�������2���ҵ���
            return root;
        }
        else{//�ݹ���
            Node node1=this.findKey(value,root.leftChild);
            Node node2=this.findKey(value,root.rightChild);
                if(node1 !=null && node1.value==value){
                return node1;
            }
            else if(node2!=null && node2.value==value){
                return node2;
            }
            else{
                return null;
            }
        }
    }







}
