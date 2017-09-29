package bitcamp.java100;

public class Test14_2 {
    public static void main(String[] args){
        
        class Book {
            String title, name, company;
            int page;
            double price;
        }
        //Book b1;
        //b1 = new Book();
        Book b1 = new Book();
        
        b1.title = "해리포터";
        b1.name = "조앤K롤링";
        b1.company = "문학수첩";
        b1.page = 95;
        b1.price = 3.15;


        System.out.printf("%s %s %s %d %.2f\n",b1.title, b1.name, b1.company, b1.page, b1.price);
        





        
   
    }    
}