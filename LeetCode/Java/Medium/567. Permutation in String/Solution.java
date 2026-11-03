class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1_arr = new int[26];
        int[] s2_arr = new int[26];
        int l=0;
        boolean bool = false;
        for(char ch: s1.toCharArray()){
            s1_arr[ch-'a']++;
        }
        for(int r=0;r<s2.length();r++){
            char chr=s2.charAt(r);
            s2_arr[chr-'a']++;

            if(r-l+1==s1.length()){
                if(Arrays.equals(s1_arr,s2_arr)){
                    bool=true;
                    break;
                }
                char chl = s2.charAt(l);
                s2_arr[chl-'a']--;
                l++;
            }
        }
        return bool;
    }
}