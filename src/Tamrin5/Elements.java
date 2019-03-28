package Tamrin5;

public abstract class Elements {
    protected String symbol;
    protected int atomicNumber;
    protected double atomicWeight;

    public Elements(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;

    }
}
