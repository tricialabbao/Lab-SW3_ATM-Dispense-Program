public class ATMDispenseChain implements DispenseChain {
    private DispenseChain firstChain;

    public ATMDispenseChain() {
        DispenseChain c1 = new Peso1000Dispenser();
        DispenseChain c2 = new Peso500Dispenser();
        DispenseChain c3 = new Peso200Dispenser();
        DispenseChain c4 = new Peso100Dispenser();
        DispenseChain c5 = new Peso50Dispenser();
        DispenseChain c6 = new Peso20Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
        
        this.firstChain = c1;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
    }

    @Override
    public void dispense(Currency currency) {
        firstChain.dispense(currency);
    }
}