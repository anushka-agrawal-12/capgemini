package Arrays.Strings;

import java.util.HashMap;

public class uniqueCharacter {
    public static char unique(String s){
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return '#';
    }
}
