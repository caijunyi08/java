package algorithm;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        double[] arr = {2,1};
        new sort().Bubble(arr);
        //System.out.println(Arrays.toString(sort.Bubble(arr)));
        System.out.println(Arrays.toString(arr));
    }
    public double[] Bubble(double[] arr){
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j+1]<arr[j]) {
                    double tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    
}
