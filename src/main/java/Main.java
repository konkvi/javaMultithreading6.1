import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String message = "Ebi de tai wo tsuru";
        Function<String, List<String>> dictionary = word -> Arrays.stream(word.split(" ")).
                map((w) -> w.toLowerCase()).
                distinct().
                sorted().
                collect(Collectors.toList());
        dictionary.apply(message).forEach(System.out::println);

        // Признаки функционального программирования:
        // - Детерминированная функция с использованием функциональных интерфейсов и лямбда-выражения
        // - Монады Stream API для цепочки вычислений над сообщением
    }
}
