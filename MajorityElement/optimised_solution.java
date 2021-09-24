import java.util.Arrays;


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        Collections.sort(A);
        
        return A.get(A.size() / 2);
    }
}
