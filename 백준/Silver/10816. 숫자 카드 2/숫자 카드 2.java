import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize the buffered reader and writer for input and output
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // Read the first input value n
        int n = Integer.parseInt(reader.readLine());

        // Read the first array of integers inputN
        String[] inputN = reader.readLine().split(" ");
        // Read the second input value m
        int m = Integer.parseInt(reader.readLine());

        // Read the second array of integers inputM
        String[] inputM = reader.readLine().split(" ");

        // Create a map to store the count of each number in inputN
        Map<Integer, Integer> hashMap = new HashMap<>();

        // For each number in inputN, update its count in the map
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(inputN[i]);
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        // For each number in inputM, write the count from hashMap or 0 if not present
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(inputM[i]);
            writer.write(hashMap.getOrDefault(num, 0) + " ");
        }

        // Flush and close the writer
        writer.flush();
        writer.close();
    }
}