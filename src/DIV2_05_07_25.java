import java.util.Scanner;
import java.util.*;
import java.io.*;


public class DIV2_05_07_25 {

    public static long nextPowerOfTwo(long n) {
        if (n <= 0) return 1;
        n--;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        n |= n >> 32;
        return n + 1;
    }
    public static void q2(Scanner sc){
        long n , l , r , k ;
        n = sc.nextLong();
        l = sc.nextLong();
        r = sc.nextLong();
        k= sc.nextLong();
        if(n == 1){
            System.out.println(l);
        }
        else if(n == 2 ){
            System.out.println(-1);
        }
         else {
            if(n%2 == 0) {
                long nextPower = nextPowerOfTwo(l+1);
                if(nextPower <=r){
                    if(k < n-1){
                        System.out.println(l);
                    }else{
                        System.out.println(nextPower);
                    }
                } else {
                    System.out.println(-1);
                }

            } else{
                System.out.println(l);
            }
        }
    }
//    public static void q1(Scanner sc){
//
//        int a , b , x , y;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        if(a > b) {
//            if(a > b+1 || a%2==0)
//                 System.out.println(-1);
//            else
//                System.out.println(y);
//        }
//        if(a == b){
//            System.out.println(0);
//        }
//        int totalCost = 0;
//        if(a < b) {
//            while (a != b) {
//                if (a % 2 == 0) {
//                    totalCost += Math.min(x, y);
//                } else {
//                    totalCost += x;
//                }
//                a++;
//            }
//            System.out.println(totalCost);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            q2(sc);
            t--;
        }
    }
}

/*

9
1 4 4 1
3 1 3 3
4 6 9 2
4 6 9 3
4 6 7 4
2 5 5 1
2 3 6 2
999999999999999999 1000000000000000000 1000000000000000000 999999999999999999
1000000000000000000 1 999999999999999999 1000000000000000000

4
1
6
8
-1
-1
-1
1000000000000000000
2

 */