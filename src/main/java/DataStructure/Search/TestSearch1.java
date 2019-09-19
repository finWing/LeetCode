package DataStructure.Search;



/*
在成绩中查询分数是100的第一个分数
T(n)=O(n)
S(n)=O(1)
 */
public class TestSearch1 {
    public static void main(String[] args) {
        //给定分数数组
        int[] scoreArr = {10,14,51,53,12,64,52};
        //给定要查找的分数
        int score = 12;
        //完成查找
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
        //输出结果
        if (index == -1) {
            System.out.println("要查找的数不存在");
        } else {
            System.out.println(score + "的索引是" + index);
        }
       return index;
    }
}