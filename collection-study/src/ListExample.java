public class ListExample {
    static Exception throwRuntimeExecptionMethod() throws RuntimeException{
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            throwRuntimeExecptionMethod();
        } catch (Exception e) {
            System.out.println("Exception 발생!");
            e.printStackTrace();
        }
    }
}
