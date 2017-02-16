package p2_primenumber;

/**
 * Created by yaya on 17-2-16.
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 */
public class PrimeNumber {
    public static void main(String[] args){
        int count=0;
        for(int i=101;i<=200;i++){
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(200);j++){
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("素数个数为："+count);
    }
}