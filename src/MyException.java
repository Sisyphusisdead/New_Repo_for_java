public class MyException {
        public static void main(String[] args) {
            UserDefineException udf = new UserDefineException();
            try {
                udf.validate(19); // valid
                udf.validate(12); // invalid
            } catch (InvalidAgeException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
}
