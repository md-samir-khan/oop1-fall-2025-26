package java;

public class MortgageCalculator {
    public static void main(string [] args){
        Scanner scanner = new Scanner(system.in);

        system.out.println("Enter the amount of loan: ");
        double principal = scanner.nextDouble();

        system.out.println("Interest rate (annual %): ");
        double rate = scanner.nextDouble();

        system.out.println("Year: ");
        int year = Scanner.nextInt();

        double monthlyRate = rate / 100 / 12;
        int n = year * 12;

        double mortgage = principal*monthlyRate*Math.pow((1+monthlyRate),n)/Math.pow((1+monthlyRate,n) - 1);
        double monthlyPayment = 
        
        system.out.printf("Total Mortgage: ",mortgage);
    }
}