public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Loan: ");
        double loan = scanner.nextDouble();
        System.out.print("Interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Monthly payment: ");
        double monthlyPayment = scanner.nextDouble();
        scanner.close();
        //boolean paymentflag = false; -- we dont need payment flag we already have rest

        double totalInterest = 0.0;
        int month = 1;
        double rest = loan;

        double interest = 0;
        double repayment = 0;

        // Create table columns
        System.out.println("Month\t Payment\t Interest\t Repayment\t Residual debt");

        //alt way of doing columns
        //System.out.printf("%5s%10s%10s%10s%15s%n", "Month", "Payment", "Interest", "Repayment",
        //                "Residual debt");
        //the s in the fstring is for space , percentage t would have been for tab space


        // create table rows in a loop iterating as long as there is debt to pay off
        while (rest>0){
            interest = rest * interestRate / 100.0 / 12;
            repayment = monthlyPayment - interest;
            if (repayment > rest) {
                // last repayment
                repayment = rest;
                monthlyPayment = repayment + interest;
            }
            rest  = rest - repayment;
            System.out.println(month+"\t\t "+(String.format("%.2f", monthlyPayment))+"\t\t "+(String.format("%.2f", interest))+"\t\t "+(String.format("%.2f", repayment))+"\t\t "+rest);
            totalInterest += interest;
            month += 1;
        }

        // Print total interest
        System.out.printf("Total interest: %.2f%n", totalInterest);
        //%.2f%n - means double to 2 decimal place and newline
    }
}