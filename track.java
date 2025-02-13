import java.time.LocalDate;
import java.util.Scanner;
import java.util.LinkedList;


public class track {
    //this class lets a user to track their incomes and outcomes in the dates when they record their incomes and outcomes
    //first the program reads the inputs of the user's incomes, outcomes
    //it puts it in the table and displays the data
    //it returns the difference between income and outcome
    //if the income is more than outcome, the program recommends the user to save it for goals
    //if the outcome is more than income, the program recommends the user spend money wisely or the resources of earning more money

        LinkedList<Integer> IncomesList = new LinkedList<Integer>();
        LinkedList<Integer> OutcomesList = new LinkedList<Integer>();
        LinkedList<String> IncomesResourceList = new LinkedList<String>();
        LinkedList<String> OutcomesResourceList = new LinkedList<String>();

        int incomeAmount;
        int outcomeAmount; 
        String incomeSource;
        String outcomeSource;
        int sumIncome;
        int sumOutcome;
        int benefit;
        LocalDate currentDate = LocalDate.now();
        //shows today's date:
        void showCurrentTime()
        {
            System.out.println("Date: " + currentDate);
        }
        //for user input:
        Scanner scanner = new Scanner(System.in);


        void inputsOfUser()
        {
            System.out.println("Welcome to your finance journey!");
            System.out.println("What would you like to record today?");
            while(true)
            {
            System.out.println("Income                      Outcome");
            String InOrOut = scanner.nextLine();


            switch (InOrOut)
            {
                case "Income":
                System.out.println("What is your income for today?");
                incomeAmount = scanner.nextInt();
                IncomesList.add(incomeAmount);
                scanner.nextLine();
                System.out.println("What is the source?");
                incomeSource = scanner.nextLine();
                IncomesResourceList.add(incomeSource);
                break;
                case "income":
                System.out.println("What is your income for today?");
                incomeAmount = scanner.nextInt();
                IncomesList.add(incomeAmount);
                scanner.nextLine();
                System.out.println("What is the source?");
                incomeSource = scanner.nextLine();
                IncomesResourceList.add(incomeSource);
                break;
                case "Outcome":
                System.out.println("What is your outcome for today?");
                outcomeAmount = scanner.nextInt();
                OutcomesList.add(outcomeAmount);
                scanner.nextLine();
                System.out.println("Where did you spend it?");
                outcomeSource = scanner.nextLine();
                OutcomesResourceList.add(outcomeSource);
                break;
                case "outcome":
                System.out.println("What is your outcome for today?");
                outcomeAmount = scanner.nextInt();
                OutcomesList.add(outcomeAmount);
                scanner.nextLine();
                System.out.println("Where did you spend it?");
                outcomeSource = scanner.nextLine();
                OutcomesResourceList.add(outcomeSource);
                break;
                default:
                System.out.println("What??");
                break;
            }
            //exit point:
            
            if (InOrOut.equalsIgnoreCase("exit")) 
            {

                System.out.println("Exiting the program. Goodbye!");

                //report about incomes:
                System.out.println("Your incomes for today:");
                for (int i = 0; i < IncomesList.size(); i++)
                {
                    System.out.println(IncomesList.get(i));
                }
                
                for (int i = 0; i < IncomesList.size(); i++)
                {
                    sumIncome += IncomesList.get(i);
                }
                System.out.println("The total income for today: " + sumIncome);

                System.out.println("________________________________________________________________________________________________________");

                System.out.println("Your outcomes for today:");
                for (int i = 0; i < OutcomesList.size(); i++)
                {
                    System.out.println(OutcomesList.get(i));
                }
                
                for (int i = 0; i < OutcomesList.size(); i++)
                {
                    sumOutcome += OutcomesList.get(i);
                }

                System.out.println("The total outcome for today: " + sumOutcome);

                System.out.println("________________________________________________________________________________________________________");

                benefit = sumIncome-sumOutcome;

                System.out.println("Your benefit for today: " + (benefit));
                if (benefit > 0)
                {
                    System.out.println("You are handling well with your budget, and keep improving it!");
                }
                else
                {
                    System.out.println("Please, try to improve next time");
                }
                break;  // Exits the loop

            }
            
        }
        }
}
