import java.util.ArrayList;
import java.util.Arrays;

public class QuestionService {
    public static void Display()
    {
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<String> que = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < 10; i++) {
            Question q = new Question(que,0,0,"Hola");
            questions.add(q);   
        }
        for (Object q : questions) {
            System.out.println(q);
        }
    }
}
