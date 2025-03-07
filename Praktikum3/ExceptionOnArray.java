public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer [] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Clean up code....");
        }
    }
}
