package chapter10;

public class Customer {
    int id = 10;
    String name;
    Account acct;

    {
        name = "匿名客户";
    }

    public Customer() {
        acct = new Account();
    }

    static class Account {

    }
}
