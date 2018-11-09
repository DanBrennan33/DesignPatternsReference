package question3;

public class CreditCardExec {
    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard("4388576018402626"); // Not Valid
        CreditCard cc2 = new CreditCard("5105105105105100"); // MasterCard
        CreditCard cc3 = new CreditCard("4012888888881881"); // Visa
        CreditCard cc4 = new CreditCard("6011111111111117"); // Discover

        /*System.out.println(cc1.validateLength());
        System.out.println(cc1.validateCompany());
        System.out.println(cc1.getCompany());
        System.out.println(cc1.validateNumber());

        System.out.println();
        System.out.println();

        System.out.println(cc2.validateLength());
        System.out.println(cc2.validateCompany());
        System.out.println(cc2.getCompany());
        System.out.println(cc2.validateNumber());

        System.out.println();
        System.out.println();

        System.out.println(cc3.validateLength());
        System.out.println(cc3.validateCompany());
        System.out.println(cc3.getCompany());
        System.out.println(cc3.validateNumber());

        System.out.println();
        System.out.println();

        System.out.println(cc4.validateLength());
        System.out.println(cc4.validateCompany());
        System.out.println(cc4.getCompany());
        System.out.println(cc4.validateNumber());

        System.out.println();
        System.out.println();*/

        if (cc1.isValid())
            System.out.println(cc1.getCcNumber() + " is a valid Credit Card number and provided by " + cc1.getCompany());
        else
            System.out.println(cc1.getCcNumber() + " is not a valid Credit Card number.");

        System.out.println();
        System.out.println();

        if (cc2.isValid())
            System.out.println(cc2.getCcNumber() + " is a valid Credit Card number and provided by " + cc2.getCompany());
        else
            System.out.println(cc2.getCcNumber() + " is not a valid Credit Card number.");

        System.out.println();
        System.out.println();

        if (cc3.isValid())
            System.out.println(cc3.getCcNumber() + " is a valid Credit Card number and provided by " + cc3.getCompany());
        else
            System.out.println(cc3.getCcNumber() + " is not a valid Credit Card number.");

        System.out.println();
        System.out.println();

        if (cc4.isValid())
            System.out.println(cc4.getCcNumber() + " is a valid Credit Card number and provided by " + cc4.getCompany());
        else
            System.out.println(cc4.getCcNumber() + " is not a valid Credit Card number.");

    }
}
