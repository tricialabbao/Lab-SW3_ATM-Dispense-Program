public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        
        int amount = 2870;
                if (amount % 10 != 0) {
            System.out.println("Amount should be a multiple of 10.");
            return;
        }

        atmDispenser.dispense(new Currency(amount));
    }
}