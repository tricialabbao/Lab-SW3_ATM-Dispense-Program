public class Peso50Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        int amount = cur.getAmount();
        if (amount >= 50) {
            int num = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing " + num + " 50 peso bill");
            if (remainder != 0) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            this.nextChain.dispense(cur);
        }
    }
}