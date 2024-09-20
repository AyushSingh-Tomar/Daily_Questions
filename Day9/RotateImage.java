import java.util.*;
public class RotateImage {
    public void rotate (int[][] matrix){
//
           for(int i=0;i<matrix.length;i++)
           {
            for(int j=0;j<=i;j++)
            {
                int temp =matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j]=temp;
            }
           }
           for(int i=0;i<matrix.length;i++)
           {
            int x=0,y=matrix[i].length-1;
            while(x<y)
            {
              int temp =matrix[i][x];
              matrix[i][x]=matrix[i][y];
              matrix[i][y]=temp;
              x++;y--;

            }
           }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr));
    }
}
