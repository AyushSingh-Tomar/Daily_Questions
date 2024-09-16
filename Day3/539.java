package Day3;
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int arr[] =new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++)
        {
            String str[]=(timePoints.get(i)).split(":");
            int hour=Integer.parseInt(str[0]);
            int Minute=Integer.parseInt(str[1]);
            arr[i]=hour*60+Minute;
           
        }
        Arrays.sort(arr);
        int min= (24 * 60) - (arr[arr.length - 1] - arr[0]);//why not (24*60)?
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]<min)
            {
                min=arr[i]-arr[i-1];
            }
        }
        return min;
    }
}
