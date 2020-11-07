public class Book {

  private String name;
  private Author[] authors;
	private double price;
	private int qty = 0;

  public Book(String name, Author[] authors, Double price, int quantity){
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName(){
    return this.name;
  }

  public String getAuthor(){
    String authorData = "";
    for(Author author : this.authors){
      authorData += author;
    }
    return authorData;
  }

  public Double getPrice(){
    return this.price;
  }

  public void setPrice(Double price){
    this.price = price;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public int setQuantity(){
    return this.quantity;
  }

  public String getAuthorsData(){
    String authorData = "";
    for(Author author : this.authors){
      authorData += author;
    }
    return authorData;
  }

  public String toString(){
    
    String authorData = "";
    for(Author author : this.authors){
      authorData += author;
    }

    return (this.name + ", " + this.price + ", " + this.quantity + ", " + authorData);

  }

}