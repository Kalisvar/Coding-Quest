class Solution {
    public int dayOfYear(String date) {
        int[] daysInMonth ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateS= date.split("-");
        int yr = Integer.parseInt(dateS[0]);
        int da = Integer.parseInt(dateS[1]);
        int day = Integer.parseInt(dateS[2]);

        if(yr % 4 == 0 && yr % 100!=0 || yr%400==0){
            daysInMonth[1]=29;
        }
        for(int i=0;i<da-1;i++){
            day += daysInMonth[i];
        }
         return day;
    }
}