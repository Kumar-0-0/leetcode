class Solution {
    static int binarySearch(int x)
    {
        int left = 1 , right = x / 2 , mid , ans = 0;
        long temp;
        while(left <= right)
        {
            mid = (left + (right - left) / 2);
            temp = (long)mid * (long)mid;
            //mid * mid can be large, so use long
            if(temp == x)
                return mid;
            if(temp < x)
            {
                ans = mid;
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return ans;
    }
    static int mySqrt(int x)
    {
        if(x <= 1)
            return x;
        return binarySearch(x);
    }
    
    public static void main(String args[])
    {
        int x = 7;
        System.out.println(mySqrt(x));
    }
}