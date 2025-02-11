import java.time.LocalDate;

public class track {
   
        int incomeAmount;
        int oucomeAmount; 
        String incomeSource;
        String outcomeSource;
        LocalDate currentDate = LocalDate.now();
        //shows today's date:
        void showCurrentTime()
        {
            System.out.println("Date: " + currentDate);
        }
        
        void recordIncome ()
        {
            System.out.println("Your total income for today: " + incomeAmount);
        }

        void recordOutcome ()
        {
            System.out.println("Your total outcome for today: " + oucomeAmount);   
        }
}