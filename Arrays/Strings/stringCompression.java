package Arrays.Strings;

public class stringCompression {
    public static int compress(char[] arr){
        int i=0;
        int write =0;
        while(i<arr.length){
            int j=i+1;
            int count=0;
            while(j<arr.length && arr[i]==arr[j]){
                j++;
            }
            count=j-i;
            //write character
            arr[write]=arr[i];
            write++;
            //if count>1then only write it next to its character->ex. a2b3c
            if(count > 1){
            String num = String.valueOf(count);
            for(int k = 0; k < num.length(); k++){
                arr[write] = num.charAt(k);
                write++;
                }
            }
            i=j;
        }
        return write;
    }
}
