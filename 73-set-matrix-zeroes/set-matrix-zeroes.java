class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length;
        int n= arr[0].length;
        int z[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                z[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(z[i][j]==0){
                    for(int k=0;k<n;k++){
                        arr[i][k]=0;
                    }
                    for(int k=0;k<m;k++){
                        arr[k][j]=0;
                    }
                }
            }
        }    
    }
}