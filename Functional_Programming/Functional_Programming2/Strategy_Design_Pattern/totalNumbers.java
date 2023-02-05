public static int totalNumbers(List<Integer> numbers, Predicate<Integer> selector) {
    return numbers.stream()
    .filter(selector)
    .reduce(0, Integer::sum);
}
OR
public static int totalNumbers(List<Integer> numbers, Predicate<Integer> selector){
    return numbers.stream()
    .filter(selector)
    .mapToInt(no -> no) 
    .sum();
}