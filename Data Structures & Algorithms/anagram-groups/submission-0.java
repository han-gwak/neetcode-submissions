class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {    
        Map<String, List<String>> sortedMap = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            List<String> values = sortedMap.getOrDefault(key, new LinkedList<>());
            values.add(s);
            sortedMap.put(new String(ch), values);
        }

        Set<String> keys = sortedMap.keySet();
        List<List<String>> result = new LinkedList<>();
        for (String key : keys) {
            result.add(sortedMap.get(key));
        }

        return result;
    }

}
