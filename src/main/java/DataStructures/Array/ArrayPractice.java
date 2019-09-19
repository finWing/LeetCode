package DataStructures.Array;

import java.util.Arrays;

public class ArrayPractice {
    public int[] data;
    public int size;   //描述在data数组总有多少个有效的元素，和length或者capacity不同

    //容量capacity就是data数组的length
    //构造函数，传入数组的容量capacity
    public ArrayPractice(int capacity){
        this.data=new int[capacity];
        this.size=0;
    }


    //获取数组中的元素个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

     public void addLast(int e){
        add(size,e);
     }

     //在第index的位置插入新的元素e
     public void add(int index,int e){
        if(size==data.length){ 
          throw new IllegalArgumentException("数组已满！");
        }
        if(index<0 || index>data.length){
            throw new IllegalArgumentException("数组超过！");
        }
        for(int i=size-1;i>index;i--){
            data[i+1]=data[i];
        }
         data[index]=e;
        size++;
     }




    //获取index索引位置的元素
    public int get(int index){
         if(index<0 || index>=size){
             throw new IllegalArgumentException("数组满了！");
         }
        return data[index];
    }

    //修改index索引位置的值
    public void set(int index,int e){
        if(index<0 || index>size){
            throw new IllegalArgumentException("数组满了！");
        }
        data[index]=e;
    }

    //查找数组中是否有元素e
    public boolean contains(int e){
           for(int i=0;i<data.length;i++) {
               if (data[i] == e) {
                   return true;
               }
           }
           return false;
    }

    //查找数组中元素e所在的索引，如果不存在元素e，则返回-1
      public int find(int e){
        for(int i=0;i<size;i++){
             if(data[i]==e)
             return i;
        }
        return -1;
      }

      //删除数组中索引index所在的元素，返回删除的元素
    public int remove(int index) {
         if(index<0 || index>size){
             throw new IllegalArgumentException("数组越界，无法删除!");
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

    //从数组中删除元素e
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
         //哇哦
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
