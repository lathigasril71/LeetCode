class Solution {
    public int romanToInt(String s) {
        int sum=0;
        char num[] = s.toCharArray();
        int i=0;
        while(i < num.length)
        {
            if(num[i]=='C')
            {
                if(i+1 < num.length && num[i+1] == 'M')
                {
                    sum = sum + 900;
                    i = i + 2;
                }
                else if(i+1 < num.length && num[i+1] == 'D')
                {
                    sum = sum + 400;
                    i = i + 2;
                }
                else
                {
                    sum = sum + 100;
                    i = i + 1;
                }
            }
            else if(num[i] == 'M')
            {
                sum = sum + 1000;
                i = i + 1;
            }
            else if(num[i] == 'D')
            {
                sum = sum + 500;
                i = i + 1;
            }
            else if(num[i] == 'X')
            {
                if(i+1 < num.length && num[i+1] == 'C')
                {
                    sum = sum + 90;
                    i = i + 2;
                }
                else if(i+1 < num.length && num[i+1] == 'L')
                {
                    sum = sum + 40;
                    i = i + 2;
                }
                else
                {
                    sum = sum + 10;
                    i = i + 1;
                }
            }
            else if(num[i] == 'L')
            {
                sum = sum + 50;
                i = i + 1;
            }
            else if (num[i] == 'V')
            {
                sum = sum + 5;
                i = i + 1;
            }
            else if(num[i] == 'I')
            {
                if(i+1 < num.length && num[i+1] == 'X')
                {
                    sum = sum + 9;
                    i = i + 2;
                }
                else if(i+1 < num.length && num[i+1] == 'V')
                {
                    sum = sum + 4;
                    i = i + 2;
                }
                else
                {
                    sum = sum + 1;
                    i = i + 1;
                }
            }

            
        }
        return sum;
    }
}