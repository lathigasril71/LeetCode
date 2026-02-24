class Solution {
    public int addDigits(int num) {
        int s = 0;
        do
        {
            s = sum(num);
            num = s;
        }while(s >= 10);
         return s;   
    }
    int sum(int num)
    {
        int s=0;
        while(num!=0)
        {   
            s = s + (num%10);
            num = num /10;
        }
        return s;
    }    
}