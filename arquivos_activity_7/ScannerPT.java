import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class ScannerPT {
    public static List<String> tokenize(String texto) {
        String regexp = "(?<WORD>[A-Za-zÀ-ÖØ-öø-ÿ]+)|(?<NUM>\\d+)|(?<PONT>[.,;:!?])";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(texto);

        List<String> tokens = new ArrayList<>();
        while (matcher.find()) {
            if (matcher.group("WORD") != null) {
                tokens.add(matcher.group("WORD"));
            } else if (matcher.group("NUM") != null) {
                tokens.add(matcher.group("NUM"));
            } else if (matcher.group("PONT") != null) {
                tokens.add(matcher.group("PONT"));
            }
        }
        return tokens;
    }

    public static void main(String[] args) {
        try {
            String texto = Files.readString(Paths.get("C:\\Users\\enzod\\Documents\\PROJETOS-GITHUB\\Activity-Compilers\\arquivos_activity_7\\livro.txt"));
            List<String> tokens = tokenize(texto);
            System.out.println(tokens.subList(0, 500)); // mostra primeiros 50 tokens
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
