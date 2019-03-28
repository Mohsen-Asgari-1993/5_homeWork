package Tamrin5;

public class MetalElements extends Elements {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol,atomicNumber,atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(super.getSymbol()+" is a metal element with "+super.getAtomicNumber()+" atomic number and ");
        System.out.println(super.getAtomicWeight()+" atomic weight");
        System.out.println("Metals are shiny solids and room temperature(except mercury, which is a shiny liquid element), ");
        System.out.println("with characteristics high melting points and densities. many of the properties of metals, including a large  ");
        System.out.println("atomic radius, low ionization energy, and low electronegativity, are because the electrons ");
        System.out.println("in valence shell of meta atoms can be removed easily.\n");
    }
}
