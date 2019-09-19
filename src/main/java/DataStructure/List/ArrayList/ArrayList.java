package DataStructure.List.ArrayList;

import java.util.Arrays;

/**
 * ˳���  
 * �ײ���õ����飬���ǳ��ȿ��Զ�̬�仯
 * 
 * java.util.ArrayList ÿ������50%
 * @author Administrator
 *
 */
public class ArrayList implements List {

	private Object[] elementData; //�ײ���һ�����飬Ŀǰ��û��ȷ������
	
	private int size;  //������������˼����ռ䣬����Ԫ�صĸ���
	
	
	public ArrayList() {
		//û��ָ�����ȣ�Ĭ�ϳ�����4
		this(4);
		//û��ָ������,������0
		//elementData = new Object[]{};
	}
	/**
	 * 
	 * @param initialCapacity ָ������ĳ�ʼ����
	 */
	public ArrayList(int initialCapacity) {
		//���������ָ�������Ŀռ�
		elementData = new  Object[initialCapacity];
		//ָ��˳����Ԫ�ظ�����Ĭ����0
		//size=0;
		
	}
	

	public int size() {
		
		return size;
	}


	public Object get(int i) {
		
		if(i<0 || i>=size){//i<0  ���� i>=size
			//throw new RuntimeException("��������Խ���쳣��"+i);
			throw new MyArrayIndexOutOfBoundsException("��������Խ���쳣��"+i);
		}
		
		return elementData[i];
	}


	public boolean isEmpty() {
		return size ==0;
	}


	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}


	public int indexOf(Object e) {
		
		return 0;
	}


	public void add(int i, Object e) {
		//i��λ��Ҫ��ȷ
		if(i<0 || i>size){
			throw new MyArrayIndexOutOfBoundsException("��������Խ���쳣:"+i);
		}
		//�������ˣ�������
		if(size == elementData.length){
			grow();
		}
		//����i�������Ԫ�أ������һ��Ԫ�ؿ�ʼ
		for(int j=size ;j>i; j--){
			elementData[j] = elementData[j-1];
		}
		
		//�������i��λ�ø�ֵ
		elementData[i] = e;
		//Ԫ�ظ���+1
		size++;
		//elementData[size++] = e;
		//System.out.println("length="+elementData.length);
		
	}
	

	public void add(Object e) {
		this.add(size, e);
//		//�������ˣ�������
//		if(size == elementData.length){
//			grow();
//		}
//		
//		//�����鸳ֵ
//		elementData[size] = e;
//		//Ԫ�ظ���+1
//		size++;
//		//elementData[size++] = e;
//		//System.out.println("length="+elementData.length);
		
	}
	
	private void grow(){
//		//�´���һ���µ����飬�����Ǿ�����2��
//		Object [] newArr = new Object[elementData.length*2];
//		//������������ݿ�����������
//		for(int i=0;i<size;i++){
//			newArr[i] = elementData[i];
//		}
//		//��elementDataָ��������
//		elementData = newArr;
		elementData = Arrays.copyOf(elementData, elementData.length*2);
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
	//[123,321,456,666,678.....]

	public String toString() {
		if(size == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i<size;i++){
			if(i !=size -1){
				builder.append(elementData[i]+",");
			}else{
				builder.append(elementData[i]);
			}
			
		}
		builder.append("]");
		return builder.toString();
	}
}
