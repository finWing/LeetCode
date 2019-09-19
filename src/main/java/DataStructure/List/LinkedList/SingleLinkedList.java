package DataStructure.List.LinkedList;

public class SingleLinkedList implements List{

	private Node head = new Node();//ͷ��㣬���洢���ݣ�Ϊ�˱�̷���
	
	private int size;//һ���м������
	

	public int size() {
		
		return size;
	}


	public Object get(int i) {
		//�ɾͺ�˳���һ����,����ͨ������ֱ�Ӽ��㶨λ������Ҫ��ͷ��㿪ʼ���в���
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
		//���iλ�ô����쳣
		if(i <0  || i> size){
			throw new MyArrayIndexOutOfBoundsException("����ָ��Խ���쳣��"+i);
		}
		
		//�ҵ�ǰһ����㣬��head��㿪ʼ
		Node p = head;
		for(int j = 0;j<i;j++){
			p = p.next;
		}
		//�´���һ�����
		//Node newNode = new Node(e);
		Node newNode = new Node();
		newNode.data = e;
		//newNode.next = null;
	    //ָ���½ڵ��ֱ�Ӻ�̽ڵ�
		newNode.next=p.next;
		//ָ���½ڵ��ֱ��ǰ���ڵ�
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
			//�ƶ�ָ�뵽��һ�����
			p  = p.next;
			
		}
		builder.append("]");
		return builder.toString();
	}

}
