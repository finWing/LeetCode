package DataStructure.Tree;

//Node:二叉链表的节点

    //
public class Node {
    public Object value;   //节点值
    public Node leftChild;   //左子树的引用
    public Node rightChild;   //右子树的引用


        public Node(Object value) {
            super();
            this.value = value;
        }

        public Node(Object value, Node leftChild, Node rightChild) {
            super();
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }
