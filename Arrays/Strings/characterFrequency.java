package Arrays.Strings;

import java.util.HashMap;

public class characterFrequency {
    public static HashMap<Character,Integer> characterFrequency(String s){
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        return map;

    }
    public static void main(String[] args) {
        String s="anushka";
        System.out.println(characterFrequency(s));
    }
}
