package DataStructure.Search;



/*
�ڳɼ��в�ѯ������100�ĵ�һ������
T(n)=O(n)
S(n)=O(1)
 */
public class TestSearch1 {
    public static void main(String[] args) {
        //������������
        int[] scoreArr = {10,14,51,53,12,64,52};
        //����Ҫ���ҵķ���
        int score = 12;
        //��ɲ���
        TestSearch1 test=new TestSearch1();
        test.search(scoreArr,score);
    }

    public int search(int [] scoreArr,int score) {

        int index = -1;
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] == score) {
                index = i;
            }
        }
        //������
        if (index == -1) {
            System.out.println("Ҫ���ҵ���������");
        } else {
            System.out.println(score + "��������" + index);
        }
       return index;
    }
}