import java.util.*;
public class task_02 {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.println("Welcome to STUDENT GRADE CALCULATOR..");
        System.out.println("Enter the marks of PHYSICS :");
        int a=pk.nextInt();
        System.out.println("Enter the marks of MATHS :");
        int b=pk.nextInt();
        System.out.println("Enter the marks of CHEMISTRY :");
        int c=pk.nextInt();
        System.out.println("Enter the marks of ENGLISH :");
        int d= pk.nextInt();
        System.out.println("Enter the marks of BIOLOGY");
        int e=pk.nextInt();
        int f=(a+b+c+d+e);
        float per=((float) f/500)*100;
        if(per>=95){
            System.out.println("YOUR total marks is "+f+" average percentage is "+per+"% and grade is A");
        }else if(per>=90 && per<95){
            System.out.println("YOUR total marks is "+f+" average percentage is "+per+"% and grade is B");
        }else if(per>=85 && per<90){
            System.out.println("YOUR total marks is "+f+" average percentage is "+per+"% and grade is C");
        }else if(per<35 || a<35 || b<35 || c<35 || d<35 || e<35){
            System.out.println("YOU are Fail..");
        }
        else{
            System.out.println("YOUR total marks is "+f+" average percentage is "+per+"% and grade is D");
        }
    }
}
