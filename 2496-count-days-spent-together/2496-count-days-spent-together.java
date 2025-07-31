class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceS = toDays(arriveAlice);
        int aliceL = toDays(leaveAlice);
        int bobS = toDays(arriveBob);
        int bobL = toDays(leaveBob);

        int start = Math.max(aliceS,bobS); 
        int end = Math.min(aliceL,bobL);

        return Math.max(0,(end-start+1)); 
    }
    public static int toDays(String date){
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = date.split("-");
        int month = Integer.parseInt(day[0]);
        int days = Integer.parseInt(day[1]);
        for(int i=0;i<month-1;i++){
            days += monthDays[i];
        }
        return days;
    }
}