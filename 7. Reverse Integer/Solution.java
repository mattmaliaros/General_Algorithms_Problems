// I originally adopted a Integer -> String -> StringBuilder -> Integer strategy but all the conversion is unnecessary.
// Also, one of the cases didn't work because of a larger input length size.
// In this solution, we grab the furthest digit to the right, multiply our current result by 10 and add the digit we grabbed.

class Solution {
    public int reverse(int x)
{
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}
