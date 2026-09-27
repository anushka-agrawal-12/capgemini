package Arrays.Strings;

import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters {
    public static int longestSubstringWithoutRepeatingCharacters(String s){
        HashSet<Character>set = new HashSet<>();
        int left=0;int right=0;
        int length=0,maxLength=0;
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            length=right-left+1;
            maxLength = Math.max(length,maxLength);
            right++;
        }
        return maxLength;
    }
}
