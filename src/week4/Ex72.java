public class Ex72 {
    public static void main(String[] args) {
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        System.out.println(mattAccount);
        System.out.println(myAccount);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        mattAccount.withdrawal(100.0);
        System.out.println(mattAccount);
        transfer(a, b, 50);

        myAccount.deposit(100.0);
        System.out.println(myAccount);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        transfer(b, c, 25);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void transfer(Account from, Account to, double amount){
        from.withdrawal(amount);
        to.deposit(amount);
    }
}