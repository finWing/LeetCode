package DataStructures.Array;

import java.util.Arrays;

public class ArrayPractice {
    public int[] data;
    public int size;   //������data�������ж��ٸ���Ч��Ԫ�أ���length����capacity��ͬ

    //����capacity����data�����length
    //���캯�����������������capacity
    public ArrayPractice(int capacity){
        this.data=new int[capacity];
        this.size=0;
    }


    //��ȡ�����е�Ԫ�ظ���
    public int getSize(){
        return size;
    }

    //��ȡ���������
    public int getCapacity(){
        return data.length;
    }

     public void addLast(int e){
        add(size,e);
     }

     //�ڵ�index��λ�ò����µ�Ԫ��e
     public void add(int index,int e){
        if(size==data.length){ 
          throw new IllegalArgumentException("����������");
        }
        if(index<0 || index>data.length){
            throw new IllegalArgumentException("���鳬����");
        }
        for(int i=size-1;i>index;i--){
            data[i+1]=data[i];
        }
         data[index]=e;
        size++;
     }




    //��ȡindex����λ�õ�Ԫ��
    public int get(int index){
         if(index<0 || index>=size){
             throw new IllegalArgumentException("�������ˣ�");
         }
        return data[index];
    }

    //�޸�index����λ�õ�ֵ
    public void set(int index,int e){
        if(index<0 || index>size){
            throw new IllegalArgumentException("�������ˣ�");
        }
        data[index]=e;
    }

    //�����������Ƿ���Ԫ��e
    public boolean contains(int e){
           for(int i=0;i<data.length;i++) {
               if (data[i] == e) {
                   return true;
               }
           }
           return false;
    }

    //����������Ԫ��e���ڵ����������������Ԫ��e���򷵻�-1
      public int find(int e){
        for(int i=0;i<size;i++){
             if(data[i]==e)
             return i;
        }
        return -1;
      }

      //ɾ������������index���ڵ�Ԫ�أ�����ɾ����Ԫ��
    public int remove(int index) {
         if(index<0 || index>size){
             throw new IllegalArgumentException("����Խ�磬�޷�ɾ��!");
         }
         for(int i=0;i<size;i++){
              data[i-1]=data[i];
         }
         size--;
         return data[index];
    }

    public int removeFirst(){
        return remove(0);
    }

    public int removeLast(){
        return remove(size-1);
    }

    //��������ɾ��Ԫ��e
    public void removeElement(int e){
        int index=find(e);
        for(int i=0;i<size;i++){
                data[i]=data[i+1];
        }
        size--;
    }


    @Override
    public String toString() {
        return "ArrayPractice{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
         //��Ŷ
        ArrayPractice arrayPractice=new ArrayPractice(20);
        for(int i=0;i<10;i++){
            arrayPractice.addLast(i);
        }
        System.out.println(arrayPractice);

        arrayPractice.add(4,20);
        System.out.println(arrayPractice);

        arrayPractice.remove(2);
    }


}
