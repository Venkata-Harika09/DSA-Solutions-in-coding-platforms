# NOTES

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Denominations

Consider a currency system in which there are notes of six denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.

If the sum of Rs. N is input, write a program to compute smallest number of notes that will combine to give Rs. N.

###Input:

- First line will contain T, number of testcases.
- Each testcase contains of a single line of input, an integer N..

###Output:

For each testcase, Display the smallest number of notes that will combine to give N.

###Constraints

- 1 <= T <= 1000
- 1 <= N <= 10^6

###Sample Input: 3 1200 500 242

###Sample Output: 12 5 7

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T16:03:20.882Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/NOTES)