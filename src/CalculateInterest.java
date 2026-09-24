public class CalculateInterest{
    public static void main(String[] args) {
        System.out.println(CoumpoundInterest(1000, 5, 0.05));
    }
public static double CoumpoundInterest(double principal, int loanTerm, double interestRate) {
    double balance = principal;
    for (int i = 0; i < loanTerm; i++) {
        balance = balance + (balance * interestRate);
    }
    return balance - principal;
    }
}


