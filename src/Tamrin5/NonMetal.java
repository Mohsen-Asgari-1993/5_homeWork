package Tamrin5;

public class NonMetal extends Elements {

    public NonMetal(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(super.getSymbol()+" is a nonmetal element with "+super.getAtomicNumber()+" atomic number and ");
        System.out.println(super.getAtomicWeight()+" atomic weight");
        System.out.println("A nonmetal is simply an element that does not display the properties of a metal.");
        System.out.println("it is not defined by what it is, but by what it is not.");
        System.out.println("it doesn't look metallic, can't be made into a wire, pounded into shape or bent,");
        System.out.println("doesn't conduct heat or electricity well, and doesn't have a high melting or boiling point.\n");
    }
}
