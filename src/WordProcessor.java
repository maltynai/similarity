import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WordProcessor {
    private Set<String> distinctWords = new HashSet<>();

    public void readFile(String filePath) throws IOException {
        distinctWords = Files.lines(Path.of(filePath))
                .flatMap(line -> Set.of(line.split("\\s+")).stream())
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
    }

    public Set<String> getDistinctWords() {
        return distinctWords;
    }
}
