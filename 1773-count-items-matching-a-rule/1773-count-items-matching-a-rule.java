class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int checkCell = 0;
        int count =0;
        // if(ruleKey.equals("color")){
        //     checkCell =1;
        // }else if(ruleKey.equals("name")){
        //     checkCell =2;
        // }
        // else{
        //     checkCell = 0;
        // }
            switch(ruleKey){
                case"type":
                    checkCell = 0;
                    break;
                case"color":
                    checkCell = 1;
                    break;
                case"name":
                    checkCell = 2;
                    break;
            }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(checkCell).equals(ruleValue)){
                count ++;
            }
        }
        return count;
    }
}