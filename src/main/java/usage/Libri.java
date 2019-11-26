package usage;

public class Libri {
    private Long isbn;
    private String autore;
    private int price;
    private String title;
    private String gender;
    private String isAvailable;

    /*constructor*/
    public Libri(Long isbn, String autore, int price, String title, String gender, String isAvailable) {
        this.isbn = isbn;
        this.autore = autore;
        this.price = price;
        this.title = title;
        this.gender = gender;
        this.isAvailable = isAvailable;
    }

    public Libri(){/*default constructor*/}


    public boolean isEmpty(String value){
        return value.equals("");
    }

    @Override
    public String toString(){
        return autore + " " + title + " "
                + gender + " " + price + " "
                + " " + isbn + "\t" + isAvailable;
    }

    public String getAutore() {
        return autore;
    }


    public String getTitle() {
        return title;
    }




}