import java.util.*;
class Solution {
    public int minimumCardPickup(int[] cards) {
        int results=Integer.MAX_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                int l=map.get(cards[i]);
                results=Math.min(results,i-l+1);
            }
            map.put(cards[i],i);
        }
        return results == Integer.MAX_VALUE?-1:results;
    }
}