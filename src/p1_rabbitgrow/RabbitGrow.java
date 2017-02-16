package p1_rabbitgrow;

/**
 * Created by yaya on 17-2-16.
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 解题思路：总是一对一对，可以看作单位1，手工写出前五天的情况，将会发现这是斐波那契数列，典型的递归问题。
 */
public class RabbitGrow {
    public static void main(String[] args){
        for(int i=1;i<10;i++){
            System.out.println(i+" : "+countRabbit(i)*2);
        }
    }
    public static int countRabbit(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return countRabbit(n-1)+countRabbit(n-2);
        }
    }
}
