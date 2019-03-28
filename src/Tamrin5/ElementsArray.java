package Tamrin5;

public class ElementsArray {
    public static void main(String[] args) {
        MetalElements metalElement = new MetalElements("Fe", 26, 55.845);
        NonMetal nonMetalElement = new NonMetal("Se", 34, 78.96);

        MetalElements metalElement1 = new MetalElements("Au",79,196.967);
        NonMetal nonMetalElement1 = new NonMetal("P",15,30.974);
        Elements[] elements = {metalElement,nonMetalElement,nonMetalElement1,metalElement1};
        for (Elements e : elements)
            e.describeElement();
    }
}
