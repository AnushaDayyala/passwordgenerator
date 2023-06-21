import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;

    public Question(String questionText, List<String> options) {
        this.questionText = questionText;
        this.options = options;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }
}

class Survey {
    private List<Question> questions;

    public Survey() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void conductSurvey() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());

            int optionNumber = 1;
            for (String option : question.getOptions()) {
                System.out.println(optionNumber + ". " + option);
                optionNumber++;
            }

            System.out.print("Enter your choice (1-" + (question.getOptions().size()) + "): ");
            int choice = scanner.nextInt();

            // Perform necessary operations with the choice
            // For example, store the response in a database or calculate statistics

            System.out.println();
        }

        System.out.println("Survey completed!");
    }
}

public class OnlineSurveySystem {
    public static void main(String[] args) {
        // Create a survey
        Survey survey = new Survey();

        // Add questions to the survey
        Question q1 = new Question("What is your favorite programming language?",
                List.of("Java", "Python", "C++", "JavaScript"));
        survey.addQuestion(q1);

        Question q2 = new Question("What is your preferred operating system?",
                List.of("Windows", "MacOS", "Linux", "Other"));
        survey.addQuestion(q2);

        // Conduct the survey
        survey.conductSurvey();
    }
}
