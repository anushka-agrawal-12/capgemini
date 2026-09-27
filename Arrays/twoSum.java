package Arrays;
import java.util.*;
public class twoSum {
    public static int[] 2sum(int[] arr,int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
                map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
