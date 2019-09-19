package DataStructures.Queue;

//�ֶ�ʵ��ѭ�������Լ����еķ���

import java.io.ObjectInput;
import java.util.Queue;

public class LoopQueue<E>  {
    private E[] data;  //����E����������
    private int front,tail;
    private int size;

    public LoopQueue(int capacity){
        data=(E[])new Object[capacity+1];
        front=0;
        tail=0;
        size=0;
    }
    public LoopQueue(){
        this(20);
    }

    public int getCapacity(){
        return data.length-1;
    }

    public boolean isEmpty(){
        return front==tail;
    }

    public int getSize(){
        return size;
    }

    //����
    private void resize(int newCapacity){
        E[] newData=(E[])new Object[newCapacity+1];
        for(int i=0;i<size;i++){
            newData[i] = data[(front+i)%data.length];
            data=newData;
            front=0;
            tail=size;
        }
    }

    //���
    public void enQueue(E e){
        /*
        ����ѧ���ж϶����Ƿ������ĺ���Ҫ�����ڲ��õ���ѭ�����У�


         */
        if((tail+1)%data.length==front){
          //������������Ҫ�����Ǹ�
            resize(getCapacity()*2);
            data[tail]=e;
            tail=(tail+1)% data.length;
            size++;
        }
    }

    //����
    public E deQueue(){
        if(isEmpty()){
            throw new IllegalArgumentException("����Ϊ�գ��Ҳ���Ԫ�أ�");
        }
        E ret=data[front];
        data[front]=null;
        front=(front+1) % data.length;
        size--;

        return ret;
    }



}
