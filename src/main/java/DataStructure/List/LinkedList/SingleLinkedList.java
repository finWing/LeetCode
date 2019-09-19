package DataStructure.List.LinkedList;

public class SingleLinkedList implements List{

	private Node head = new Node();//头结点，不存储数据，为了编程方便
	
	private int size;//一共有几个结点
	

	public int size() {
		
		return size;
	}


	public Object get(int i) {
		//可就和顺序表不一样了,不能通过索引直接计算定位，而需要从头结点开始进行查找
		Node p = head;
		for(int j = 0;j<=i;j++){
			p = p.next;
		}
		return p.data;
	}


	public boolean isEmpty() {
		
		return size ==0;
	}


	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}


	public void add(int i, Object e) {
		//如果i位置错误报异常
		if(i <0  || i> size){
			throw new MyArrayIndexOutOfBoundsException("数组指针越界异常："+i);
		}
		
		//找到前一个结点，从head结点开始
		Node p = head;
		for(int j = 0;j<i;j++){
			p = p.next;
		}
		//新创建一个结点
		//Node newNode = new Node(e);
		Node newNode = new Node();
		newNode.data = e;
		//newNode.next = null;
	    //指明新节点的直接后继节点
		newNode.next=p.next;
		//指明新节点的直接前驱节点
		p.next=newNode;
		//size++
		size++;
	}


	public void add(Object e) {
		this.add(size, e);
		
	}


	public boolean addBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean addAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	public Object replace(int i, Object e) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public String toString() {
		if(size == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Node p = head.next;
		for(int i=0;i<size;i++){
			if(i !=size -1){
				builder.append(p.data+",");
			}else{
				builder.append(p.data);
			}
			//移动指针到下一个结点
			p  = p.next;
			
		}
		builder.append("]");
		return builder.toString();
	}

}
