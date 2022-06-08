class PalindromeNums {
    public boolean isPalindrome(int x)
    {
        int z = x;
       int y = 0;
       while(x > 0)
       {
           y = (y*10)+(x%10);
           x = x/10;
       }
        if(y == z)
        {
            return true;
        }else{
            return false;
        }
    }
}