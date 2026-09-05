class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for (String str : strs) {
            encoded_string.append(str.length());
            encoded_string.append('#');
            encoded_string.append(str);
        }

        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int beginingIndex = str.indexOf('#', i);
            int sLength = Integer.parseInt(str.substring(i, beginingIndex));
            decoded_strs.add(str.substring(beginingIndex + 1, beginingIndex + sLength + 1));
            i = beginingIndex + sLength + 1;
        }
        return decoded_strs;
    }
}
