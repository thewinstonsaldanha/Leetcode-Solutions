import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String answer= LocalDate.of(year,month,day).getDayOfWeek().toString();
        
        return answer.substring(0,1).toUpperCase()+ answer.substring(1).toLowerCase();
    }
}