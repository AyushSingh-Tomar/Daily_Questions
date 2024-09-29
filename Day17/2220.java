class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=0;
        String c=Integer.toBinaryString((start^goal));
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='1')
            {
                ans++;
            }
        }
    return ans;
    }
}
