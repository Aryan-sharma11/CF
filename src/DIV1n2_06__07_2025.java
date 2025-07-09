import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class DIV1n2_06__07_2025 {

    public static void q1(Scanner sc){

        int n ;
        n = sc.nextInt();
        int [] arr = new int [n];
        int [] arr2 = new int [n];

        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++ ){
            if(arr[i] != arr2[i]){
                ans.add(arr[i]);
            }
        }
        if(ans.isEmpty()){
            System.out.println("No");
        } else{
            System.out.println("Yes");
            System.out.println(ans.size());
            for(int i : ans){
                System.out.print(i +" ");
            }
            System.out.println();
        }

    }
    public static void q2(Scanner sc){

        int n = sc.nextInt();
        int arr [] = new int [n];
        int []presum = new int [n];
        int min = Integer.MAX_VALUE;
        int minSum = 0;
        for(int i = 0 ; i < n ; i++ ){
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
                if(i>0){
                    presum[i] = presum[i-1]+min;
                } else {
                    presum[i] = min;
                }
        }
        minSum = presum[n-1];
        min = Integer.MAX_VALUE;
        int totalSum = presum[0];
        int found = 0;
        for(int i = 0 ; i < n-1 ; i++ ){
            int sum1  = arr[i+1] + arr[i];
            min = Math.min(arr[i],min);
            if(i == 0 && sum1 < minSum){
                System.out.println(sum1);
                found = 1;
                break;
            } else if (i>0) {
                int new_min = Math.min(min , sum1);
                if( presum[i-1]+new_min < minSum){
                    System.out.println(presum[i-1]+new_min);
                    found = 1;
                    break;
                }
            }
        }
        if(found == 0){
            System.out.println(minSum);
        }

    }
    public static void q3(Scanner sc){


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            q2(sc);
            t--;
        }
    }
}
