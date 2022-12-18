package ua.ucu.edu.builder;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private double height;
    private double weight;
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder().id(1).name("Ivan").email("ivan.varanytsia@ucu.edu.ua").age(18).height(183).weight(65).occupation("Student").build();
        System.out.println(user);;
    }
}
