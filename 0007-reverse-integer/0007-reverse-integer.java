class Solution {
    public int reverse(int x) {
        
        
        int temp = x;
        long sum = 0;
        while(temp != 0)
        {
            int digit = temp%10;
            temp/=10;
            sum = sum * 10 + digit;

        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE)
            return 0;
        return (int) sum;
    }
}