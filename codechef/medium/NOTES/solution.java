import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();
            int count = 0;

            count += n / 100;
            n = n % 100;

            count += n / 50;
            n = n % 50;

            count += n / 10;
            n = n % 10;

            count += n / 5;
            n = n % 5;

            count += n / 2;
            n = n % 2;

            count += n;

            System.out.println(count);
        }
    }
}