import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long total=0;
    
     for(int i=0;i<arr.size();i++){
        total+=arr.get(i);//total sum of elements
     }
     
     int max=arr.get(0);//initial max element
     int min=arr.get(0);//initial min element
     
    for(int i=1;i<arr.size();i++){
        if(min>arr.get(i) ){
            min=arr.get(i);//if array elements are less than the minimum element then min=array element
        }
        if(max<arr.get(i)){//if array element is more than the max element then max=array element
            max=arr.get(i);   
        }
    }
     System.out.println((total-max)+" "+(total-min));
     
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
