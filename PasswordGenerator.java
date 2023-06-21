import java.util.Random;

public class PasswordGenerator {
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-+=<>?";

    public static void main(String[] args) {
        int length = 10; // Length of the password
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {
        String characters = LOWER_CASE + UPPER_CASE + NUMBERS + SPECIAL_CHARACTERS;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}

