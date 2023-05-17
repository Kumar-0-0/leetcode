class Solution {
  public int strStr(String haystack, String needle) {
    final int A = haystack.length();
    final int B = needle.length();

    for (int i = 0; i < A - B + 1; ++i){
        if (haystack.substring(i, i + B).equals(needle)){
            return i;
        }
    
    }
    return -1;
  }
}