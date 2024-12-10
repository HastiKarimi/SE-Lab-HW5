public class AnotherProfiler {

    public static void main(String[] args) {
        maxSquare();
    }

    public static void maxSquare() {
        Long result = 0L;
        for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
            if (i * i < Integer.MAX_VALUE) {
                result = i;
            }
        }

        System.out.println(result);
    }

}
