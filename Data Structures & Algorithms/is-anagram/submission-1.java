class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> srtS = new HashMap<>();
        HashMap<Character,Integer> srtT = new HashMap<>();
        for(char i : s.toCharArray()){
            srtS.computeIfPresent(i,(key,value)-> value + 1);
            srtS.putIfAbsent(i,1);
        }
        for(char i : t.toCharArray()){
            srtT.computeIfPresent(i,(key,value)-> value + 1);
            srtT.putIfAbsent(i,1);
        }
        return srtS.equals(srtT);
    }
}
