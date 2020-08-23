public class Util {
    public void printArray(int [] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void printMatrix(int [][] arr){
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
