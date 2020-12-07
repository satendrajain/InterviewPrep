package com.prog.vipul.prog;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MissingNumberArray 
{
    public static void main( String[] args )
    {
    	//int[] arr = {1,2,3,4,5,6,7,8,10};
        //int size = 10;
        
		/*
		 * int totalSum = size*(size+1)/2; int sum = 0; sum = Arrays.stream(arr).sum();
		 * 
		 * System.out.println(totalSum-sum);
		 */
    
    	 Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         
        while(t-- > 0)
        {
            int n = 0, res = 0;
            n = sc.nextInt();
            
            int x;
            for(int i = 1; i < n; i++)
            {
                x = sc.nextInt();
                res = res^x;
                res = res^i;
                
            }
           System.out.println(res^n);
            
        }
        
    }
    
}
