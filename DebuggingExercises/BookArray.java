public class BookArray
{
    public static void main(String[] args)
    {
        Book book[] = new Book[10];
        int x;
        book[0] = new Fiction("qwert");
        book[1] = new NonFiction("tyuiop");
        book[2] = new Fiction("asdfg");
        book[3] = new NonFiction("ghjkl");
        book[4] = new Fiction("zxcvb");
        book[5] = new NonFiction("bnm");
        book[6] = new Fiction("mnbv");
        book[7] = new Fiction("vcxz");
        book[8] = new Fiction("lkjhgfdsa");
        book[9] = new Fiction("poiuytrewq");
        for(x = 0; x < book.length; ++x)
            System.out.println("Book: " +
                    book[x].getTitle() + " costs $" +
                    book[x].getPrice());
    }
}