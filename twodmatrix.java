import java.util.*;
public class twodmatrix {
    public static void key(int matrix[][],int key){
        int largest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<largest){
                    largest=matrix[i][j];
                    
                }
            }
        
        }
        System.out.println("largest element is "+largest);
        
    }
    
    
    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        key(matrix, 6);
    }

    
}