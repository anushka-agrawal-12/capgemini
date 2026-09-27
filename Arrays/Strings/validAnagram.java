package Arrays.Strings;

import java.util.HashMap;

public class validAnagram {
    public static boolean isValid(String s,String t){
        HashMap<Character,Integer>m = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int j=0;j<t.length();j++){
            if(!m.containsKey(t.charAt(j))){
                return false;
            }
            m.put(t.charAt(j), m.getOrDefault(t.charAt(j), 0)-1);            
        }
        for(char ch:m.keySet()){
            if(m.get(ch)!=0){
                return false;
            }
        }
        return true;
        
    }
}
