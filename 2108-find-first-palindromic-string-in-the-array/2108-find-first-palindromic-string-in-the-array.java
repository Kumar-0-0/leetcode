class Solution {
    public String firstPalindrome(String[] words) {
        String org,rev ="";
       for(int i=0;i<words.length;i++ ){
         rev="";
         org = words[i];
         for(int j = org.length()-1;j>=0;j--){
           rev = rev+org.charAt(j);
           }
           if(org.equals(rev)){
             return words[i];
             }
       }
       return "";
    }
}