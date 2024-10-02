class Solution {
    public void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void fn(int arr[],int i,List<List<Integer>> ans)
    {
        if(i==arr.length-1)
        {
             List<Integer> cur=new ArrayList<>(arr.length);
             for(int a:arr){
                cur.add(a);
             }
             ans.add(cur);
                return;
        }
        for(int j=i;j<arr.length;j++){
            swap(arr,i,j);
            fn(arr,i+1,ans);
            swap(arr,i,j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        fn(nums,0,ans);
        return ans;
    }
}
