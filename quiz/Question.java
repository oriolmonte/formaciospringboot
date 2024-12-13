import java.util.List;

public class Question {
    private int id;
    private String question;
    private List<String> answers;
    private int correct;

    public Question(List<String> answers, int correct, int id, String question) {
        this.answers = answers;
        this.correct = correct;
        this.id = id;
        this.question = question;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public List<String> getAnswers() {
        return answers;
    }
    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
    public int getCorrect() {
        return correct;
    }
    public void setCorrect(int correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("id=").append(id);
        sb.append(", question=").append(question);
        sb.append(", answers=").append(answers);
        sb.append(", correct=").append(correct);
        sb.append('}');
        return sb.toString();
    }
}
