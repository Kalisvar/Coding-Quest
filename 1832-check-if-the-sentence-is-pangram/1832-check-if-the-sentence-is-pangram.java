class Solution {
    public boolean checkIfPangram(String sentence) {
        int startAscii = 97;
        int[] alphabetsoccur = new int[26];
        if(sentence.length() <=25){
            return false;
        }
        for(int i=0;i<sentence.length();i++){
            int ascii = sentence.charAt(i);
            alphabetsoccur[ascii-startAscii] = 1; 
        }

        for(int i=0;i<alphabetsoccur.length;i++){
            if(alphabetsoccur[i] == 0){
                return false;
            }
        }
        return true;
    }
}