public class UserDefineException {
    void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}

