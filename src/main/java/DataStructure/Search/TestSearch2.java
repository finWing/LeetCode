package DataStructure.Search;
/*
�۰���ң����ֲ���
ǰ�᣺˳��ṹ�����չؼ�������
 */
public class TestSearch2 {
    public static void main(String[] args) {
        //������������
        int[] scoreArr = {10,14,51,53,12,64,52};
        //����Ҫ���ҵķ���
        int score = 12;
        //��ɲ���
        TestSearch2 test=new TestSearch2();
        test.binarysearch(scoreArr,score);
    }
    /*
        ��ʹ�õݹ�
     */
    public int binarysearch(int[] scoreArr,int score){
        //���ж��ֲ���
        int index=-1;
        //ָ��low��high
        int low=0;
        int high= scoreArr.length-1;

        //�۰����
       while (low<high){
           //���mid
           int mid=(high+low)/2;
           //�ж��Ƿ����
           if(score==scoreArr[mid]){
               return mid;
           }else if(score<scoreArr[mid]){
                high=mid-1;
           }else {
               low=mid+1;
           }
    }
        //������
        return -1;

    }
}
