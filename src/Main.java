import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        WordProcessor word1 = new WordProcessor();
        WordProcessor word2 = new WordProcessor();
        SimilarityCalculator similarityCalculator = new SimilarityCalculator();

        word1.readFile("src/file1.txt");
        word2.readFile("src/file2.txt");

        Set<String> distinctWords1 = word1.getDistinctWords();
        Set<String> distinctWords2 = word2.getDistinctWords();

        double similarity = similarityCalculator.calculateSimilarity(distinctWords1, distinctWords2);

        System.out.println("Jaccard Similarity Coefficient: " + similarity);
    }
}