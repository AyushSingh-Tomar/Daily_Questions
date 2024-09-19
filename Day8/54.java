class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<Integer>(); 
        if ( matrix.length == 1 ){ 
            for(int i=0;i<matrix[0].length;i++){
            list.add(matrix[0][i]);
            }
            return list;}


        int rn=matrix.length-1;
        int cn=matrix[0].length-1;
        int minC=0,minR=0,maxC=cn,maxR=rn;
        while(list.size() < matrix.length * matrix[0].length)
        {
            // upper wall (Right)-->
           for(int i=minC;i<=maxC && list.size() < matrix.length * matrix[0].length;i++)
           {
            list.add(matrix[minR][i]);

           }
           minR++;
           // rightwall down 
           for(int i=minR;i<=maxR && list.size() < matrix.length * matrix[0].length;i++)
           {
            list.add(matrix[i][maxC]);
           }
           maxC--;
           // lower wall left <---
           for(int i=maxC;i>=minC && list.size() < matrix.length * matrix[0].length;i--)
           {
            list.add(matrix[maxR][i]);
           }
           maxR--;
           // leftwall upper
            for(int i=maxR;i>=minR && list.size() < matrix.length * matrix[0].length;i--)
           {
            list.add(matrix[i][minC]);
           }
           minC++;
           
        } 
        System.out.println(Arrays.toString(matrix[1]));
        return list;
       
    }
}
