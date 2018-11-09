package question3;

/**
 *
 */
public class CreditCard {
    private int evenSum;
    private int oddSum;
    private int sum;
    private String ccNumber;
    private String company;

    /**
     *
     * @return
     */
    public boolean isDivisibleBy10() {
        //System.out.println(getSum() + " is divisible by 10: " + (getSum() % 10 == 0)); // Testing purposes
        return (getSum() % 10 == 0);
    }

    /**
     *
     * @return
     */
    public boolean isValid() {
        boolean flag = false;
        if (validateLength()) {
            if (validateCompany())
                if (validateNumber())
                    flag = true;
        } else {
            flag = false;
        }

        return flag;
    }

    /**
     *
     * @return
     */
    public boolean validateCompany() {
        int companyNumber = Integer.parseInt(String.valueOf(getCcNumber().charAt(0)));
        if (companyNumber == 3)
            companyNumber = Integer.parseInt(getCcNumber().substring(0,2));
        boolean flag;
        switch(companyNumber) {
            case 4:
                flag = true;
                company = "Visa";
                break;
            case 5:
                flag = true;
                company = "Mastercard";
                break;
            case 6:
                flag = true;
                company = "Discover";
                break;
            case 37:
                flag = true;
                company = "American Express";
                break;
            default:
                flag = false;
                break;
        }
        return flag;
    }

    /**
     *
     * @return
     */
    public boolean validateLength() {
        //System.out.println("Length of Credit Card number: " + (getCcNumber().length() - 1)); // Testing purposes
        return (getCcNumber().length() >= 13 && getCcNumber().length() <= 16);
    }

    /**
     *
     * @return
     */
    public boolean validateNumber() {
        String[] intStrings = getCcNumber().split("");
        int[] intArr = new int[intStrings.length];
        for (int i = 0; i < intArr.length; i++)
            intArr[i] = Integer.parseInt(intStrings[i]);

        for (int i = intArr.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                if (intArr[i] * 2 > 9) {
                    int total = intArr[i] * 2;
                    while (total > 0) {
                        evenSum += total % 10;
                        total /= 10;
                    }
                } else {
                    evenSum += intArr[i] * 2;
                }
            } else
                oddSum += intArr[i];
        }
        //System.out.println("evenSum: " + evenSum); // Testing purposes
        //System.out.println("oddSum: " + oddSum); // Testing purposes

        return validateSums();
    }

    /**
     *
     * @return
     */
    public boolean validateSums() {
        sum = getEvenSum() + getOddSum();
        return isDivisibleBy10();
    }

    /**
     *
     * @param num
     */
    public CreditCard(String num) {
        this.ccNumber = num;
        this.evenSum = 0;
        this.oddSum = 0;
        this.sum = 0;
    }

    /**
     *
     * @return
     */
    public int getEvenSum() {
        return evenSum;
    }

    /**
     *
     * @return
     */
    public int getOddSum() {
        return oddSum;
    }

    /**
     *
     * @return
     */
    public int getSum() {
        return sum;
    }

    /**
     *
     * @return
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     *
     * @return
     */
    public String getCompany() {
        return company;
    }
}
