class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            int size = str.length();
            sb.append("#");
            sb.append(size);
            sb.append(",");
            sb.append(str);
        }
        System.out.println("sb : " + sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> results = new LinkedList<String>();
        
        int index = 0;
        while (index < str.length()) {
            
            int sizeDigits = 0;
            int size = 0;
            if (str.charAt(index) == '#') {
                index++;
                while (str.charAt(index + sizeDigits) != ',') {
                    sizeDigits++;
                }
                System.out.println("index : " + index);
                System.out.println("sizeDig: " + sizeDigits);
                System.out.println("current char: " + str.charAt(index));
                size = Integer.parseInt(str.substring(index, index + sizeDigits));
                index += 1 + sizeDigits;
            }
            String result = str.substring(index, index + size);
            results.add(result);
            index += size;
        }
        return results;
    }
}
