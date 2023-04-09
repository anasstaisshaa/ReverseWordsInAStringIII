class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            StringBuilder reverseStr = new StringBuilder();
            while(i < s.length()&& s.charAt(i) != ' ' ){
                reverseStr.append(s.charAt(i));
                i++;
            }
            reverseStr.reverse();
            ans.append(reverseStr);
            ans.append(" ");
            reverseStr.setLength(0);
        }
        ans.deleteCharAt(ans.length() -1 );
        return ans.toString();
    }
}
