package week4;

public class Ex72 {
    public static void main(String[] args) {

        Account mattAccount = new Account("Matt's account",1000.00);
        Account myAccount = new Account("My account ",0);

        System.out.println(mattAccount);
        System.out.println(myAccount);

        mattAccount.withdrawal(100);
        System.out.println(mattAccount);

        myAccount.deposit(100);
        System.out.println(myAccount);

        Account a = new Account("A", 1000);
        Account b = new Account("B", 1);
        Account c = new Account("C", 0);



        transfere(a, b, 50 );
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        transfere(b, c, 25 );

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void transfere(Account from, Account to, double amount ) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}