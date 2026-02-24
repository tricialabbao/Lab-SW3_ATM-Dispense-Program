public class Peso200Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        int amount = cur.getAmount();
        if (amount >= 200) {
            int num = amount / 200;
            int remainder = amount % 200;
            System.out.println("Dispensing " + num + " 200 peso bill");
            if (remainder != 0) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            // Pass the request to the next handler
            this.nextChain.dispense(cur);
        }
    }
}