package com.company;
import java.util.*;
class assignment2{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        int max=0;
        int pos=0;
        System.out.println("Enter the value of array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            if(max<arr[i]){
                max = arr[i];
                pos=i;
            }
        }
        System.out.println("Maximum Number: "+max);
        System.out.println("Position of First Occurrence: "+pos);
    }
}