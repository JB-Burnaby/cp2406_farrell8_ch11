public class UseBook
{
    public static void main(String[] args)
    {
        Fiction book1 = new Fiction("qwerty");
        NonFiction book2 = new NonFiction("uiop");

        System.out.println("Fiction book:" +
                book1.getTitle() + " costs $" +
                book1.getPrice());

        System.out.println("Non-Fiction book:" +
                book2.getTitle() + " costs $" +
                book2.getPrice());
    }
}