import java.util.Arrays;

import static java.math.BigInteger.ONE;

public class Main {
    public static void main(String[] args) {

        int [] arr={1,2,3,5,6,7};
        int[] array={1,2,3,5,6};
        int count=0;

        if(arr.length<array.length){
            for (int i=0;i<array.length;i++){
                count=0;
                for (int j=0;j<arr.length;j++){
                    if((array[i]^arr[j])==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println(array[i]);
                }
            }
        }
        else {
            for (int i=0;i<arr.length;i++){
                count=0;
                for (int j=0;j<array.length;j++){
                    if((arr[i]^array[j])==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
