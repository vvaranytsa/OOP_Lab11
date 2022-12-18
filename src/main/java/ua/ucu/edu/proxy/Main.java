package ua.ucu.edu.proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProxyImage realImage = new ProxyImage("img.jpg");
        ProxyImage realImage1 = new ProxyImage("img1.jpg");
        System.out.println("Is Crimea Ukrainian? Answer T/F");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("false") || answer.equalsIgnoreCase("f")) {
            realImage.display();
        } else {
            realImage1.display();
        }

    }
}
