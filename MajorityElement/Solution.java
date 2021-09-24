public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {

         int size = A.size();
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0;i<size;i++){
                if(map.containsKey(A.get(i))){
                    int j = map.get(A.get(i));
                    map.put(A.get(i),++j);
                }
                else{
                    map.put(A.get(i),1);
                }
            }

            Iterator hmIterator = map.entrySet().iterator();
            int max=-1,maxindex=-1;
            while (hmIterator.hasNext()) {

                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                int value = (int)mapElement.getValue();
                if(value>max && value > size/2){
                    max = (int)mapElement.getValue();
                    maxindex = (int)mapElement.getKey();
                }
            }

            return maxindex;
        }
}
