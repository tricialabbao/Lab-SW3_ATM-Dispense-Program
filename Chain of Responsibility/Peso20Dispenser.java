public class Peso20Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        int amount = cur.getAmount();
        if (amount >= 20) {
            int num = amount / 20;
            int remainder = amount % 20;
            System.out.println("Dispensing " + num + " 20 peso bill");
            if (remainder != 0) {
                System.out.println("Unable to dispense the remaining " + remainder + " pesos.");
            }
        } else {
            System.out.println("Unable to dispense the remaining " + amount + " pesos.");
        }
    }
}