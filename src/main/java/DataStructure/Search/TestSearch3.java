package DataStructure.Search;
/*
ʹ�õݹ�����۰����
 */
public class TestSearch3 {
    public static void main(String[] args) {
        //������������
        int[] scoreArr = {1,2,3,4,5,6,7,8,9,10};
        //����Ҫ���ҵķ���
        int score = 7;
        //��ɲ���
        int index = binarySearch(scoreArr, score);
        //������
        if(index==-1){
            System.out.println("������");
        }else{
            System.out.println(score+"��������"+index);
        }
}

    public static int binarySearch(int[] scoreArr, int score){
        int low=0;
        int high= scoreArr.length-1;
        return binarysearch(scoreArr,score,low,high);
    }



    public static int binarysearch(int[] scoreArr, int score,int low,int high) {

        //�ݹ��������
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