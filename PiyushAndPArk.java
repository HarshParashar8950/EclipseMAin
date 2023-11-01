package questions;
import java.util.*;
//public Class Piyu{
//
public class PiyushAndPArk {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt(); 
        int S = scanner.nextInt();

        char[][] park = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = scanner.next();
            park[i] = row.toCharArray();
        }

        String[] result = canEscapePark(N, M, K, S, park);

        System.out.println(result[0]);
        if (result[0].equals("Yes")) {
            System.out.println(result[1]);
        }

        scanner.close();
    }

    public static String[] canEscapePark(int N, int M, int K, int S, char[][] park) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char cell = park[i][j];
                if (cell == '.') {
                    S -= 2;  // Encounter an obstacle
                } else if (cell == '*') {
                    S += 5;  // Encounter a magic bean
                }
                if (j < M - 1) {
                    S--;  // Move to the next cell (1 strength per step)
                } else if (i < N - 1) {
                    S--;  // Jump to the start of the next row (1 strength per step)
                }
            }
        }

        if (S >= K) {
            return new String[]{"Yes", Integer.toString(S)};
        } else {
            return new String[]{"No"};
        }
    }
}
