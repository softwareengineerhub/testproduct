package ua.itea.app.model;

import java.util.Objects;

public class Question {
    private int id;
    private String question;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String correct;
    private int author_id;

    public Question(){

    }

    public Question(int id, String question, String a1, String a2, String a3, String a4, String correct, int author_id) {
        this.id = id;
        this.question = question;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.correct = correct;
        this.author_id = author_id;
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

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }


    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", a1='" + a1 + '\'' +
                ", a2='" + a2 + '\'' +
                ", a3='" + a3 + '\'' +
                ", a4='" + a4 + '\'' +
                ", correct='" + correct + '\'' +
                ", author_id=" + author_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question1 = (Question) o;
        return getId() == question1.getId() &&
                getAuthor_id() == question1.getAuthor_id() &&
                Objects.equals(getQuestion(), question1.getQuestion()) &&
                Objects.equals(getA1(), question1.getA1()) &&
                Objects.equals(getA2(), question1.getA2()) &&
                Objects.equals(getA3(), question1.getA3()) &&
                Objects.equals(getA4(), question1.getA4()) &&
                Objects.equals(getCorrect(), question1.getCorrect());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuestion(), getA1(), getA2(), getA3(), getA4(), getCorrect(), getAuthor_id());
    }
}
