package DataStructures.Trie;

import java.util.TreeMap;

public class Trie {
    class Node {
        private boolean isWord;
        private TreeMap<Character, Node> next;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<Character, Node>();
        }

        public Node() {
            this(false);
        }

    }

    private Node root;
    private int size;

    public Trie() {
        root = new Node();
        size = 0;
    }

    //��ȡ���ʵĳ���
    public int getSize() {
        return size;
    }

    //��������ӵ��ֵ����У���������ظ�����
    public void add(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null) {
                cur.next.put(c, new Node());
                cur = cur.next.get(c);
            }
            if (!cur.isWord) {
                cur.isWord = true;
                size++;
            }
        }

    }
    //�ݹ�д��

    //��ѯ����word�Ƿ���Trie�У������һ�������ĵ���
    public boolean contains(String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(cur.next.get(c)==null)
                return false;
            cur=cur.next.get(c);
        }
        return cur.isWord;
    }
    //�ݹ�д��



}