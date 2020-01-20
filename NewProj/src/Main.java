
public class Main {
     public static void main(String[] args)
     {
    	 Item[] obj1 = new Item[4];
    	 obj1[0] = new Book("Java Core", 999, 12, "Sierra", 500, "Basics of Java" );
         obj1[1] = new JournalPaper(001, "Research Paper", 75, "Akshat", 2019);
         obj1[2] = new Video(002, "Spider Man",50, 22, "Sam Raimi", "Action", 2012);
         obj1[3] = new CD(192, "OCP Java", 100, 200, "Cathy", "Education");
       
     for(int i = 0; i < obj1.length;i++ )
     {
    	 System.out.println("Title: " + obj1[i].getTitle()+ ", "+ "No. of Copies: " + obj1[i].getNumberOfCopies());
  

     }
}
}
