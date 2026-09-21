class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int hashIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hashIndex));

            int wordstart = hashIndex + 1;
            int wordend = wordstart + length;
            result.add(str.substring(wordstart, wordend));

            i = wordend;
        }
        return result;
    }
}
