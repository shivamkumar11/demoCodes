public class GiveEvenNo {
    public static void main(String[] args) {
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i == 10) {
                    System.out.println("All even no between 10 to 100");
                }
                System.out.print(i + " ");
            } else {
                // System.out.print(i+ " ");
            }
        }

    }
}
