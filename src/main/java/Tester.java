public class Tester {
    public static void main(String[] args) {

        LargestDivisibleSubset lds = new LargestDivisibleSubset();
        System.out.println(lds.largestDivisibleSubset(new int[]{1, 2, 3})); // 1, 2
        System.out.println(lds.largestDivisibleSubset(new int[]{1, 2, 4, 8})); // 1, 2, 4, 8
        System.out.println(lds.largestDivisibleSubset(new int[]{3, 17})); // 3
        System.out.println(lds.largestDivisibleSubset(new int[]{3, 4, 16, 8})); // 4, 8, 16
        System.out.println(lds.largestDivisibleSubset(new int[]{4, 8, 10, 240})); // 4,8,240
        System.out.println(lds.largestDivisibleSubset(new int[]{2, 3, 4, 9, 8})); // 2,4,8
    }
}
