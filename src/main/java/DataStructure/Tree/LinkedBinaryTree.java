package DataStructure.Tree;

import java.util.*;

public class LinkedBinaryTree implements BinaryTree {
    private Node root;//根节点





    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        System.out.println("二叉树节点个数：");
        return this.size(root);
    }

    //判断二叉树的长度
    public int size(Node root){
        if(root==null){
            return 0;
        }
        else{
            //获取左子树的size
            int lt=this.size(root.rightChild);
            //获取右子树的size
            int rt=this.size(root.rightChild);
            //将左节点和右节点的size相加并加上根节点的size
            return lt+rt+1;
        }
    }

    //获取二叉树的高度
    @Override
    public int getHeight() {

        System.out.println("二叉树的高度");

        return this.getHeight(root);
    }

    private int getHeight(Node root){
        if(root==null){
          return 0;
        }else{
            //获取左子树的高度
           int nl=this.getHeight(root.leftChild);
            //获取右子树的高度
           int nr=this.getHeight(root.rightChild);
            //返回左子树，右子树较大高度并+1
            return  nl>nr ? nl+1:nr+1;
        }

    }



    @Override
    //先序递归遍历二叉树
    public void preOrderTraverse() {
      //输出根节点的值
        if(root !=null){
            System.out.println(root.value);
            //对左子树进行先序遍历
            //构建一个二叉树，根是左子树的根
            BinaryTree leftTree=new LinkedBinaryTree(root.leftChild);
            leftTree.preOrderTraverse();
            //对右子树进行先序遍历
            //构建一个二叉树，根是右子树的根
            BinaryTree rightTree=new LinkedBinaryTree(root.rightChild);
            rightTree.preOrderTraverse();
        }
    }

    @Override


    //中序递归遍历二叉树
    public void inOrderTraverse(){
        System.out.println("中序遍历");
        this.inOrderTraverse(root);
//        System.out.println();
    }

        @Override
        public void inOrderTraverse(Node root){
        if(root!=null){
        //遍历左子树
            this.inOrderTraverse(root.leftChild);
            //输出根的值
            System.out.println(root.value);
            //遍历右子树
            this.inOrderTraverse(root.rightChild);
        }
    }

    @Override


    //后序递归遍历二叉树
    public void postOrderTraverse(){
        System.out.println("后序遍历");
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


    //中序非递归遍历(借助栈)
    @Override
    public void inOrderByStack() {
        System.out.println("中序非递归遍历");
        //创建栈
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

    //按照层次遍历二叉树(借助队列)

    public void levelOrderByStack() {

        System.out.println("二叉树按照层次遍历");
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

    //查找二叉树中的某个值
    public Node findKey(int value){
        return this.findKey(value,root);
    }

    public Node findKey(Object value,Node root){

        if(root ==null){//节点为空，可能是整个数的根节点，也可能是递归调用中叶子节点的左孩子和右孩子
            return null;
        }
        else if(root!=null && root.value==value){//递归的结束条件2：找到了
            return root;
        }
        else{//递归体
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
