import java.util.HashMap;

/**
 * Created by p on 2017/2/23.
 */
public class TwoSum {
    public void twosum(int[] array, int target){
        for(int i=0;i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
               if(array[i]+array[j]== target)
                   System.out.println("index0= "+i+", "+"index1= "+j+" ");
            }
        }
    }

    public void twosumbymap(int[] array,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])) {
                System.out.println("index0=" + map.get(array[i])  + "index1=" + i );
                break;
            }else {
                map.put(target - array[i], i);
            }
        }
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] a = {2,7,11,15};
//        twoSum.twosum(a,18);
        twoSum.twosumbymap(a,18);
    }
}
