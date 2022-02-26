package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String separate = " ";
        String ideaPlusIdea = "But I am a newbie.";
        idea = idea + separate + ideaPlusIdea;
        int year = 2022;
        idea = idea + separate + year;
        System.out.println(idea);

    }
}
