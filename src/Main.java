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

        double totalInterest = 0.0;
        int month = 1;
        double rest = loan;

        // Create table columns
        

        // create table rows in a loop iterating as long as there is debt to pay off
        

        // Print total interest
        System.out.printf("Total interest: %.2f%n", totalInterest);
    }
}