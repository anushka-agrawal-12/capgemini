package Arrays.Hashmaps;

import java.util.HashSet;

public class longestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] arr){
        
        int maxLength=0;
        HashSet<Integer>set = new HashSet<>();
        for(int number:arr){
            set.add(number);
        }
        for(int num:set){
            int length=0;
            if(!set.contains(num-1)){
                length++;
                
                while(set.contains(num+1)){
                    length++;
                    num++;
                }
                maxLength=Math.max(length, maxLength);
            }
        }
        return maxLength;
    }
}
