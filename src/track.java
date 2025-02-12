import java.time.LocalDate;
import java.util.Scanner;


public class track {
    //this class lets a user to track their incomes and outcomes in the dates when they record their incomes and outcomes
    //first the program reads the inputs of the user's incomes, outcomes
    //it puts it in the table and displays the data
    //it returns the difference between income and outcome
    //if the income is more than outcome, the program recommends the user to save it for goals
    //if the outcome is more than income, the program recommends the user spend money wisely or the resources of earning more money

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

        Scanner scanner = new Scanner(System.in);

        void greetAndAsk()
        {
            System.out.println("Welcome to you finance journey!");
            System.out.println("What would you like to record today?");
            System.out.println("Income           Outcome");
            String InOrOut = scanner.nextLine();
            switch (InOrOut)
            {
                case "":

            }
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