package Arrays;

public class majorityElement {
    public static int majorityElement(int[] arr){
        int count=0;int candidate=0
        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
