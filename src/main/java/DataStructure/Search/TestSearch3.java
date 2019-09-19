package DataStructure.Search;
/*
使用递归进行折半查找
 */
public class TestSearch3 {
    public static void main(String[] args) {
        //给定分数数组
        int[] scoreArr = {1,2,3,4,5,6,7,8,9,10};
        //给定要查找的分数
        int score = 7;
        //完成查找
        int index = binarySearch(scoreArr, score);
        //输出结果
        if(index==-1){
            System.out.println("不存在");
        }else{
            System.out.println(score+"的索引是"+index);
        }
}

    public static int binarySearch(int[] scoreArr, int score){
        int low=0;
        int high= scoreArr.length-1;
        return binarysearch(scoreArr,score,low,high);
    }



    public static int binarysearch(int[] scoreArr, int score,int low,int high) {

        //递归结束条件
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(score==scoreArr[mid]){
            return mid;
        }
        if(score<scoreArr[mid]){
            return binarysearch(scoreArr,score,low,mid-1);
        }
        else {
            return binarysearch(scoreArr,score,mid+1,high);
        }

    }

}