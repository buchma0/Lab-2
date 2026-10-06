public class InvestmentTracker {

    double principal;
    double interestRate;
    int years;

    public InvestmentTracker(double p, double r, int y) {

        principal = p;
        interestRate = r;
        years = y;

    }

    public double calculateTotal() {

        double total = principal * Math.pow(1 + interestRate, years);
        return total;

    }

    public static void main(String[] args) {

        InvestmentTracker tracker = new InvestmentTracker(1000.0, 0.05, 10);

        double total = tracker.calculateTotal();

        System.out.println("Principal $" + tracker.principal);
        System.out.println("Rate: " + (tracker.interestRate * 100) + "%");
        System.out.println("Years: " + tracker.years);
        System.out.printf("Total: $%.2f", total);

    }
}

