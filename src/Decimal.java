import java.util.*;

class Solution
{
    public void decimal(int number,int base)
    {
        String result = " ";
        while(number>0)
        {
            result+=String.valueOf(number%base);
            number/=base;
        }
        String reverseresult=" ";
        for(int i=result.length()-1;i>0 ;i--)
        {
            char ch=result.charAt(i);
            reverseresult+=ch;
        }
        System.out.println(reverseresult);
    }
}

class Decimal
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int base = scanner.nextInt();
        Solution solution =new Solution();
        solution.decimal(number,base);
    }
}
