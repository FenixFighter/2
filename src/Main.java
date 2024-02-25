import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, EndOper = 0;
        String operation;
        byte Retry;

        do {
            System.out.print("Введите первое число num1 = ");
            num1 = in.nextFloat();
            System.out.print("Введите второе число num2 = ");
            num2 = in.nextFloat();
            System.out.print("/Введите операцию между ними (+ - * / % **)");
            operation = in.nextLine();
            operation = in.nextLine();
            switch (operation) {
                case "+":
                    EndOper = num1 + num2;
                    break;

                case "-":
                    EndOper = num1 - num2;
                    break;

                case "*":
                    EndOper = num1 * num2;
                    break;

                case "/":
                    EndOper = num1 / num2;
                    break;

                case "%":
                    EndOper = num1 % num2;
                    break;

                case "**":
                    EndOper = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Вы ввели что-то неправильно!");
            }
            System.out.println(EndOper);
            System.out.println("Вы хотите снова сделать операцию?\n\t1 - да\n\t2 - нет");
            Retry = in.nextByte();

        }while(Retry == 1);
    }
}