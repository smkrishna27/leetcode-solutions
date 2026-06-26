class Solution {
    public String reverseVowels(String s) {
     if(s==null|| s.isEmpty()){
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left<right){
            while(left<right && !isVowel(chars[left])) left++;
        
            while(left<right && !isVowel(chars[right])){ right--;}
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;

        }
        return String.valueOf(chars);

    }
    public static boolean isVowel(char c) {
        if(c=='a' || c =='e' || c=='i' || c=='o'|| c=='u' || c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
        return false;
    }
}