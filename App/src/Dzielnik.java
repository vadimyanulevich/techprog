public class Dzielnik
//fefefefegegegege
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {

            int n=0;
            try
            {
                n = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException ex)
            {
                System.out.println(args[i] + "Nie jest liczba calkowita");
            }
            int b = div(n);
            System.out.println(args[i] + " " + b);
        }


    }
        public static int div ( int a)
        {
            if (a == 1)
            {
                return a;
            }
            else
                {
                int i = 2;
                while (a % i != 0) {
                    i++;
                }
                return a / i;
                }
        }
}