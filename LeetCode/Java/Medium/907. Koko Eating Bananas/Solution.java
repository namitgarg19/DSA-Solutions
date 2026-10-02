class Solution {
    public boolean ispossible(int[] arr, int k, int h){
        long hours=0;

        for(int a : arr){
        hours+=(a+k-1)/k;
    }
    return hours<=h;
}
    public int minEatingSpeed(int[] piles, int h) {
        int min=1, max=piles[0];
         for(int a : piles){
            max=Math.max(max,a);
        }
        int answer = max;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(ispossible(piles, mid, h)){
                answer=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return answer;
    }
}