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

    //获取单词的长度
    public int getSize() {
        return size;
    }

    //将单词添加到字典树中，不会添加重复单词
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
    //递归写法

    //查询单词word是否在Trie中，会查找一个完整的单词
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
    //递归写法



}