package DataStructure.Search;
/*
折半查找，二分查找
前提：顺序结构，按照关键字有序
 */
public class TestSearch2 {
    public static void main(String[] args) {
        //给定分数数组
        int[] scoreArr = {10,14,51,53,12,64,52};
        //给定要查找的分数
        int score = 12;
        //完成查找
        TestSearch2 test=new TestSearch2();
        test.binarysearch(scoreArr,score);
    }
    /*
        不使用递归
     */
    public int binarysearch(int[] scoreArr,int score){
        //进行二分查找
        int index=-1;
        //指定low和high
        int low=0;
        int high= scoreArr.length-1;

        //折半查找
       while (low<high){
           //求得mid
           int mid=(high+low)/2;
           //判断是否等于
           if(score==scoreArr[mid]){
               return mid;
           }else if(score<scoreArr[mid]){
                high=mid-1;
           }else {
               low=mid+1;
           }
    }
        //输出结果
        return -1;

    }
}
