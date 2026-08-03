import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static class Interval
    {
        int start, end;

        Interval(int start, int end)
        {
            this.start = start;
            this.end = end;
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Interval[] arr = new Interval[n];

        for(int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new Interval(a, b);
        }

        Arrays.sort(arr, (x, y) -> x.end - y.end);

        int count = 0;
        int lastPoint = -1;

        for(int i = 0; i < n; i++)
        {
            if(lastPoint < arr[i].start)
            {
                count++;
                lastPoint = arr[i].end;
            }
        }

        System.out.println(count);
    }
}