package ru.netology;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    @FunctionalInterface
    public interface WordSortedFunction {
        List<Object> listSort(String[] resultList);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение для словаря(каждое слово через пробел) и нажмите ENTER:");
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        WordSortedFunction function = list -> Arrays.stream(list).distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        function.listSort(array).forEach(System.out::println);
        /* В данном коде отличительной чертой функционального стиля является использование
        WordSortedFunction, как функционального интерфейса...
                */
    }
}
