package com.example.init.models;

import java.util.List;

public class Quiz {

    public int id;
    public String question;
    public Object description;
    public Answers answers;
    public String multiple_correct_answers;
    public CorrectAnswers correct_answers;
    public String correct_answer;
    public Object explanation;
    public Object tip;
    public List<Tag> tags;
    public String category;
    public String difficulty;

    public Quiz() {
    }

    public Quiz(int id, String question, Object description, Answers answers, String multiple_correct_answers,
            CorrectAnswers correct_answers, String correct_answer, Object explanation, Object tip, List<Tag> tags,
            String category, String difficulty) {
        this.id = id;
        this.question = question;
        this.description = description;
        this.answers = answers;
        this.multiple_correct_answers = multiple_correct_answers;
        this.correct_answers = correct_answers;
        this.correct_answer = correct_answer;
        this.explanation = explanation;
        this.tip = tip;
        this.tags = tags;
        this.category = category;
        this.difficulty = difficulty;
    }

    private static class Answers {
        public String answer_a;
        public String answer_b;
        public String answer_c;
        public String answer_d;
        public Object answer_e;
        public Object answer_f;
    }

    private static class CorrectAnswers {
        public String answer_a_correct;
        public String answer_b_correct;
        public String answer_c_correct;
        public String answer_d_correct;
        public String answer_e_correct;
        public String answer_f_correct;
    }

    private static class Tag {
        public String name;
    }

}