package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionRepository {
    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Какая столица Франции?",
                new ArrayList<String>() {{
                    add("Берлин");
                    add("Мадрид");
                    add("Париж");
                    add("Рим");
                }},
                2
        ));

        questions.add(new Question(
                "Какая самая длинная река в мире?",
                new ArrayList<String>() {{
                    add("Нил");
                    add("Амазонка");
                    add("Янцзы");
                    add("Миссисипи");
                }},
                1
        ));

        questions.add(new Question(
                "Сколько хромомсом у человека?",
                new ArrayList<String>() {{
                    add("23");
                    add("46");
                    add("64");
                    add("32");
                }},
                1
        ));

        questions.add(new Question(
                "В каком году началась вторая мировая война?",
                new ArrayList<String>() {{
                    add("1939");
                    add("1941");
                    add("1945");
                    add("1914");
                }},
                0
        ));

        questions.add(new Question(
                "Кто открыл Америку?",
                new ArrayList<String>() {{
                    add("Фернан Магеллан");
                    add("Христофор Колумб");
                    add("Васко да Гама");
                    add("Джеймс Кук");
                }},
                1
        ));

        questions.add(new Question(
                "Какой художник написал 'Мону Лизу'?",
                new ArrayList<String>() {{
                    add("Пабло Пикассо");
                    add("Винсет Ван Гог");
                    add("Леонардо да Винчи");
                    add("Микеланджело");
                }},
                2
        ));

        questions.add(new Question(
                "Какой актер играл Тони Старка в 'Мстителях?'",
                new ArrayList<String>() {{
                    add("Крис Эванс");
                    add("Роберт Дауни-младший");
                    add("Крис Хемсворт");
                    add("Марк Руффало");
                }},
                1
        ));

        questions.add(new Question(
                "Какой компании принадлежит Android?",
                new ArrayList<String>() {{
                    add("Apple");
                    add("Microsoft");
                    add("Google");
                    add("Samsung");
                }},
                1
        ));

        questions.add(new Question(
                "Какой язык программирования используется в Android?",
                new ArrayList<String>() {{
                    add("Python");
                    add("Java");
                    add("C++");
                    add("JavaScript");
                }},
                1
        ));

        questions.add(new Question(
                "Сколько планет в Солнечной системе?",
                new ArrayList<String>() {{
                    add("7");
                    add("8");
                    add("9");
                    add("10");
                }},
                1
        ));

        return questions;
    }
}
