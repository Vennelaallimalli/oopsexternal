import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Book{
	private String bname;
	private String bauthor;
	private int bcount;
	public Book(String bname,String bauthor,int bcount){
		this.bname=bname;
		this.bauthor=bauthor;
        this.bcount=bcount;

	}
	public String getBname(){
		return bname;
	}
	public int getBcount(){
		return bcount;
	}
	public void sell(Book b,int n){
		if(n<=bcount){
			bcount=bcount-n;
			System.out.println(n + "copies sold of book " + b.getBname() );
			System.out.println("remaing books are: " + bcount);
		}
		else{
			System.out.println("Out of stock");
		}
	}
	    @Override
    public String toString() {
        return bname + " by " + bauthor;
    }

}
class Customer{
	private String cname;
	private int cid;
	private String caddress;
	private List<Book> purchasedBooks;
	private int purchasedBooksCount;
	public Customer(int cid,String cname,String caddress){
		this.cid=cid;
		this.cname=cname;
		this.caddress=caddress;
		this.purchasedBooks=new ArrayList<>();
		this.purchasedBooksCount=purchasedBooksCount;

	}
	public String getCname(){
		return cname;
	}
	public int getCid(){
		return cid;
	}
	public void buy(Book b,int n){
		System.out.println(cname + " is buying book  " +b.getBname());
		for(int i=0;i<n;i++)
			purchasedBooks.add(b);
		// purchasedBooksCount=purchasedBooksCount++;
		b.sell(b,n);

	}
	public List<Book> getPurchasedBooks(){
		return purchasedBooks;
	}
	public int getPurchasedBooksCount(){
		return purchasedBooksCount;

	   
	}
	@Override
    public String toString() {
        return "Customer " + cid + ": " + cname + " from " + caddress;
    }
}
public class EBook{
	public static void main(String args[]){
		Book b1=new Book("hello","vennela",20);
        Book b2=new Book("world","shiva",10);
       Customer c1=new Customer(1,"gullu","xyz");
       Customer c2=new Customer(2,"megha","pqr");
       c1.buy(b1,5);
       c2.buy(b2,2);
       searchByCustomerName(c1);
       searchByCustomerName(c2);



	}
	private static void searchByCustomerName(Customer customer) {
        System.out.println("\nBooks purchased by " + customer + ":");
        List<Book> purchasedBooks = customer.getPurchasedBooks();
        int count =0;
        for (Book book : purchasedBooks) {
            System.out.println(book);
            count++;

        
        
       }
       System.out.println(count);
    }
}