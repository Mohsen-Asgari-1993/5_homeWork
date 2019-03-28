package Tamrin2;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        char ch='A';
        for (int i=0, j=1;i<=8;i+=2,j+=2){
            books[i]=new Fiction(""+ch);
            ch++;
            books[j]=new NonFiction(""+ch);
            ch++;
        }
        for (Book b:books)
            b.displayInformation();
    }
}
