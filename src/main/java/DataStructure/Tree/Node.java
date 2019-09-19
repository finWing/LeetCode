package DataStructure.Tree;

//Node:��������Ľڵ�

    //
public class Node {
    public Object value;   //�ڵ�ֵ
    public Node leftChild;   //������������
    public Node rightChild;   //������������


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
