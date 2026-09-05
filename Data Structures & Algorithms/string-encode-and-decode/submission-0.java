class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for (String str : strs) {
            encoded_string += str;
            encoded_string += "\n";
        }

        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        String tmpStr = "";
        for (char c : str.toCharArray()) {
            if (c == '\n') {
                decoded_strs.add(tmpStr);
                tmpStr = "";
            }
            else {
                tmpStr += c;
            }
        }
        return decoded_strs;
    }
}
