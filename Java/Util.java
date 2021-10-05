import java.util.ArrayList;
import java.util.Map;

public class Util {
    public void printArray(int [] arr){
        System.out.println("######### print array ############");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("######### end of print array ############");

    }
    public void printMatrix(int [][] arr){
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public void printArrayList(ArrayList list){
        System.out.println("######### print arraylist ############");
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        System.out.println("######### END of print arraylist ############");
    }

    public void printMap(Map map){
        System.out.println("######### print Map ############");
        map.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });
        System.out.println();
        System.out.println("######### END of print map ############");
    }

}
