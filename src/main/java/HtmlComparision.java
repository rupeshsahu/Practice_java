
import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

public class HtmlComparision {
    public static void main(String[] args) {
        String file1Path = "C:\\file1.html";
        String file2Path = "C:\\file2.html";

        try {
            String file1Content = readFile(file1Path);
            String file2Content = readFile(file2Path);

            if (file1Content.equals(file2Content)) {
                System.out.println("The HTML files are identical.");
            } else {
                System.out.println("The HTML files are different.");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line);
            }
        }

        return contentBuilder.toString();
    }
}
