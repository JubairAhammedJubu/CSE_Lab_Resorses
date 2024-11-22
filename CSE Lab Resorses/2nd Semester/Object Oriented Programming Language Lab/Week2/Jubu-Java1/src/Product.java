public class Product {

        protected int id;
        protected String title;
        protected int price;
    
        public Product(int id, String title, int price) {
            this.id = id;
            this.title = title;
            this.price = price;
        }
    
        public String get_id_title_price() {
            return (
                "ID: " 
                       + String.valueOf(this.id) +
                       " Title: " 
                       + this.title +
                       " Price: " 
                       + String.valueOf(this.price)
            );
        }
    }
    
    class Book extends Product {
        int isbn;
        String publisher;
    
        public Book(int id, String title, int price, int isbn, String publisher) {
            super(id, title, price);
            this.isbn = isbn;
            this.publisher = publisher;
        }
    
        public String printDetail() {
            return get_id_title_price() + " \nISBN: " + this.isbn + " Publisher: " + this.publisher;
        }
    }
    
    class CD extends Product {
        protected String brand;
        protected int duration;
        protected String genre;
    
        public CD(int id, String title, int price, String brand, int duration , String genre) {
            super(id, title, price);
            this.brand = brand;
            this.duration = duration;
            this.genre = genre;
        }
    
        public String printDetail() {
            return get_id_title_price() + 
                " \nBrand: " 
                + this.brand + 
                " Number of Tracks: " 
                + this.duration +" minutes" +
                " Genre: " 
                + this.genre;
        }
       
    
}
