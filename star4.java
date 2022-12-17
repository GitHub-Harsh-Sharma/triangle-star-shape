import java.io.*;
class Star4
{
 public static void main(String[] args)
  {
    int i,k,s,a=1,b=2;
    for(i=1; i<=3;i++)
    {
        for(s=1;s<=b;s++)
        {
            System.out.print(" ");
        }
        for(k=1;k<=a;k++)
        {
            System.out.print("*");
        }
        System.out.println("");
        a=a+2;
        b--;
    }    
 }
}