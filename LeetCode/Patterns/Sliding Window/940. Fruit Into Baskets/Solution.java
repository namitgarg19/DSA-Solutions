class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int l=0, max=0;
        for(int right=0;right<fruits.length;right++){
            int key = fruits[right];
            map.put(key, map.getOrDefault(key,0)+1);

            while(map.size()>2){
                int keyl = fruits[l];
                map.put(keyl, map.get(keyl)-1);
                if(map.get(keyl)==0){
                    map.remove(keyl);
                }
                l++;

            }
            max=Math.max(max, right-l+ 1);
        }
        return max;

    }
}