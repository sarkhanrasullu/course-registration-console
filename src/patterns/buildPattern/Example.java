package patterns.buildPattern;

public class Example {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder(1434L)
                .withOwner("Saadat")
                .openingBalance(200)
                .atBranch("ggva")
                .atRate(2.5)
                .build();


    }
}
