public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
         int limit = A.size();
        for(int i=0;i<limit;i++){
            int weight=0;
            for(int j=i,part=0;part<limit;part++,j=(++j%limit)){
                weight=weight+A.get(j)-B.get(j);
                if(weight<0){
                    part=limit;
                }
                else if(part==(limit-1)){
                    return i;
                }
            }
        }
    return -1;
    }
}
