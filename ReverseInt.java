class ReverseInt {
    public int reverse(int x) 
    {
        long o = x;
        boolean neg = false;
        if(o<0)
        {
            o = o*-1;
            neg = true;
        }
        long y = 0;
        while(o>0)
        {
            y = (y*10)+(o%10);
            o = o/10;
        }
        if(y < Integer.MIN_VALUE || y > Integer.MAX_VALUE)
        {
         return 0;
        }
        if(neg == false)
        {
            int ans = (int)y;
            return ans;
        }
        else
        {
            int ans = (int)y * -1;
           return ans;
        }
        
    }
}
/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

 

Constraints:

    -231 <= x <= 231 - 1

*/