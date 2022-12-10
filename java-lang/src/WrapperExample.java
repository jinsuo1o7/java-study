public class WrapperExample {
    public static void main(String[] args) {
        Integer i1 = new Integer("4");
        Integer i2 = 4;
        System.out.println(i1.equals(i2)); // true
        System.out.println(i1.compareTo(i2)); // 0
        System.out.println(i1.toString()); // "4"
        System.out.println(i1.toString()); // "4"

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.SIZE); // 32(4bytes)
        System.out.println(Integer.BYTES); // 4
        System.out.println(Integer.TYPE); // int

        String dogo = "dogo";
        Object b = "dogo";
        System.out.println(dogo.equals(b));
    }
}
