import java.util.*;
import java.io.*;

public class DIV3_1_07_25 {

    public static void q5(Scanner sc){
        
    }

    public static void q4(Scanner sc){
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i)=='1'){
                cnt++;
            }
        }
        if(cnt<=k || n<2*k){
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
        /*
         * https://codeforces.com/contest/2123/problem/D
         * https://codeforces.com/blog/entry/144363
         */


    }

    public static void q3(Scanner sc){
        int n = sc.nextInt();
        int [] arr  = new int [n];
        int [] pre= new int [n];
        int []post = new int [n];
        int min = Integer.MAX_VALUE;
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            min = Math.min(arr[i],min);
            pre[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for(int i = n-1 ; i>0 ; i--){
            max = Math.max(arr[i],max);
            post[i] = max;
        }
        for(int i = 0 ; i<n ; i++){
            if( (pre[i]<=arr[i] && post[i]<=arr[i]) ||(pre[i]>=arr[i] && post[i]>=arr[i]) ){
                ans.append("1");
            }
            else {
                ans.append("0");
            }
        }
        System.out.println(ans);
        /*
            https://codeforces.com/contest/2123/problem/C
         */
    }

    public static void q2(Scanner sc){
        int n = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int [] arr  = new int [n+1];
        HashSet<Integer> h1 = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i = 1 ; i <= n ; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max , arr[i]);
        }
        if(arr[j] == max){
            System.out.println("Yes");
        }else if(k>1){
            System.out.println("Yes");
        } else if(k==1){
            System.out.println("No");
        }
        // https://codeforces.com/contest/2123/problem/B

    }

    public static void q1(Scanner sc){
        int n = sc.nextInt();
        if(n%4 == 0){
            System.out.println("Bob");
        }
        else {
            System.out.println("Alice");
        }
        // https://codeforces.com/contest/2123/problem/A
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){
            q1(sc);
            t--;
       }

    }
}
