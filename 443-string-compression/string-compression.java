class Solution {
    public int compress(char[] chars) {
          int count=1;
        StringBuilder s= new StringBuilder(String.valueOf(chars[0]));

        for (int i = 1; i < chars.length; i++) {
            char previousChar = chars[i-1];
            char currentChar = chars[i];
            if (previousChar == currentChar) {
                count++;
            } else  {
                if(count>1){
                    s.append(count);
                    count=1;
                }
                s.append(currentChar);
            }


        }
        if(count>1){
            s.append(count);
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}