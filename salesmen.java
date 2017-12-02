public class salesmen
{
    public static void main(String[] args) 
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter in salesmen.");
        int salesmen = stdin.nextInt();
       
       int[] sales = new int[salesmen];

        for (int b = 0; b < salesmen; b++) 
        {
            System.out.print("Enter the sales for salesmen # " + (b + 1) + ":");
            sales[b] = stdin.nextInt();
        }

        for (int b = 0; b < salesmen; b++) 
        {
            System.out.print((b + 1) + " " + sales[b] + " ");
        }

        System.out.println(" ");

        int temp = 0;
        for (int i = 0; i < sales.length; i++) 
        {
            if (temp < sales[i]) 
            {
                temp = sales[i];
                System.out.println((i + 1) + " " + temp);
            }
        }
    }
}
