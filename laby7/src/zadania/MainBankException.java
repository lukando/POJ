package zadania;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you want to create an account?");
        boolean doCreateAccount = getYesNoAnswer();
        if (!doCreateAccount) {
            endProgram();
        }

        Account account = createNewAccount();

        System.out.println("Do you want to withdraw money?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if (!shouldWithdrawMoney) {
            endProgram();
        }

        int amount = 0;
        while (true) {
            System.out.println("How much do you want to withdraw?");
            try {
                amount = getAmount();
                account.withdraw(amount);
                break; // sukces
            } catch (NumberFormatException e) {
                System.out.println("Błąd: wpisz liczbę całkowitą.");
            } catch (InsufficientFundsException e) {
                System.out.println("Błąd: " + e.getMessage());
            }
        }

        System.out.printf("Thank you for using our service. Your current balance is %.2f $%n", account.getBalance());
    }

    private static Account createNewAccount() {
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        int initialAmount = 0;
        while (true) {
            System.out.println("How much do you want to put down to your account?");
            try {
                initialAmount = getAmount();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Błąd: wpisz liczbę całkowitą.");
            }
        }

        return new Account(name, initialAmount);
    }

    private static int getAmount() throws NumberFormatException {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void endProgram() {
        System.out.println("Thank you for using our service!");
        System.exit(0);
    }

    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if (userAnswer.toLowerCase().contains("y")) {
            return true;
        } else if (userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Please enter 'yes' or 'no'.");
            return getYesNoAnswer();
        }
    }
}