package ua.ucu.edu.strategy;

public class Gift implements MailCode{
    private static final String TEMPLATE = "Dear %s, Christmas is coming! "+
            "We have a special offer for you! " +
            "You can get a gift! " +
            "Please, visit our website: %s";

    @Override
    public String generate(Client client) {
        return String.format(TEMPLATE, client.getName(), "https://www.ucu.edu.ua");
    }
}
