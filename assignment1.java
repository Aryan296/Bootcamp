package com.company;
import java.util.*;
class GradeCalculator
{
    public static void main(String[] args)
    {
        System.out.println("#Using if-else:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int grade = scan.nextInt();
        char ans;
        if(grade>=90&&grade<=100) ans='A';
        else if(grade>=80&&grade<=89) ans='B';
        else if(grade>=70&&grade<=79) ans='C';
        else if(grade>=60&&grade<=69) ans='D';
        else if(grade>=50&&grade<=59) ans='E';
        else ans='F';
        System.out.println("Grade: "+ans);
        System.out.println("#Using switch cases");
        System.out.print("Enter your test score: ");
        grade = scan.nextInt();
        switch(grade/10){
            case 10:
            case 9:
                ans='A';
                break;
            case 8:
                ans = 'B';
                break;
            case 7:
                ans = 'C';
                break;
            case 6:
                ans='D';
                break;
            case 5:
                ans = 'E';
                break;
            default:
                ans='F';
                break;
        }
        System.out.println("Grade: "+ans);
    }
}