class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String mapKey = String.valueOf(charArray);

            if (!anagramsMap.containsKey(mapKey)) {
                anagramsMap.put(mapKey, new ArrayList<>());
            }
            anagramsMap.get(mapKey).add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }
}
