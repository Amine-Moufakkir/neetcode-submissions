class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for (char x : s.toCharArray()) {
            if (s_map.containsKey(x))
                s_map.put(x, s_map.get(x) + 1);
            else
                s_map.put(x, 1);
        }

        for (char y : t.toCharArray()) {
            if (t_map.containsKey(y))
                t_map.put(y, t_map.get(y) + 1);
            else
                t_map.put(y, 1);
        }

        if (s_map.equals(t_map))
            return true;
        return false;
    }
}
