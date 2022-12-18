package ua.ucu.edu.builder;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Client extends User {
    public static void main(String[] args) {
        Client client = Client.builder().email("vanya.varanytsa@gmail.com").build();
        System.out.println(client);
    }
}
