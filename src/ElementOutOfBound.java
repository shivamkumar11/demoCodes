public class ElementOutOfBound {
    public static void main() {
        try {
            // It will run this method
            checkElementError();
        } catch (ArrayIndexOutOfBoundsException e) {
            // this will print error if it found while catch
            System.out.println(STR."Error found: \{e.toString()}");

        }
    }

    // this method check initializing an array and accessing its value
    private static void checkElementError() {
        int[] data = new int[]{2, 3, 56, 6, 3, 2, 3, 78, 66};
        for (int i = 0; true; i++) {
            System.out.println(data[i + 9]);
        }
    }
}
