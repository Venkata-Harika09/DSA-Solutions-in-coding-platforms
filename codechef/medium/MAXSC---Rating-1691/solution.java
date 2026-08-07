import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            HashMap<Long, ArrayList<Long>> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                long band = sc.nextLong();
                long length = sc.nextLong();

                map.putIfAbsent(band, new ArrayList<>());
                map.get(band).add(length);
            }

            ArrayList<Long> firstSongs = new ArrayList<>();
            long ans = 0;
            int bands = map.size();

            for (ArrayList<Long> list : map.values()) {
                Collections.sort(list);

                firstSongs.add(list.get(0));

                for (int i = 1; i < list.size(); i++) {
                    ans += list.get(i) * bands;
                }
            }

            Collections.sort(firstSongs);

            int multiplier = 1;

            for (long len : firstSongs) {
                ans += len * multiplier;
                multiplier++;
            }

            System.out.println(ans);
        }

        sc.close();

	}
}
