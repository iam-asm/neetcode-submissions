class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for (Character c : s.toCharArray()) {
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }
        for (Character c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        if (smap.size() == tmap.size()) {
            for (Map.Entry<Character,Integer> entry : smap.entrySet()) {
                Character ch = entry.getKey();
                if (!entry.getValue().equals(tmap.get(ch))) return false;
            }
            for (Map.Entry<Character,Integer> entry : tmap.entrySet()) {
                Character ch = entry.getKey();
                if (!entry.getValue().equals(smap.get(ch))) return false;
            }
            return true;
        }
        return false;
    }
}
