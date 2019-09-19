package DataStructures.Queue;

//手动实现循环队列以及其中的方法

import java.io.ObjectInput;
import java.util.Queue;

public class LoopQueue<E>  {
    private E[] data;  //数组E的所有容量
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

    //扩容
    private void resize(int newCapacity){
        E[] newData=(E[])new Object[newCapacity+1];
        for(int i=0;i<size;i++){
            newData[i] = data[(front+i)%data.length];
            data=newData;
            front=0;
            tail=size;
        }
    }

    //入队
    public void enQueue(E e){
        /*
        这里学会判断队列是否是满的很重要。由于采用的是循环队列，


         */
        if((tail+1)%data.length==front){
          //队列已满，需要扩容那个
            resize(getCapacity()*2);
            data[tail]=e;
            tail=(tail+1)% data.length;
            size++;
        }
    }

    //出队
    public E deQueue(){
        if(isEmpty()){
            throw new IllegalArgumentException("队列为空，找不到元素！");
        }
        E ret=data[front];
        data[front]=null;
        front=(front+1) % data.length;
        size--;

        return ret;
    }



}
