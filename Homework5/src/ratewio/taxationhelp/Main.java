package ratewio.taxationhelp;

import ratewio.taxationhelp.util.Taxation;

import java.util.Scanner;

class Main{
    static void main(String[] args) {
        int     earnings = 0,
                spendings = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(
                    "\n" +
                    "Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения\n" +
                    "end. Завершить программу"
            );

            String input = sc.nextLine();
            if ("end".equals(input))
                break;

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1: {
                    System.out.print("Введите сумму дохода: ");
                    earnings += Integer.parseInt(sc.nextLine());
                    break;
                }
                case 2: {
                    System.out.print("Введите сумму расхода: ");
                    spendings += Integer.parseInt(sc.nextLine());
                    break;
                }
                case 3: {
                    int     tax_earnings = Taxation.getTaxForEarnings(earnings),
                            tax_profit = Taxation.getTaxForProfit(earnings, spendings);

                    if (tax_earnings == tax_profit)
                        message("любую систему налогообложения", tax_earnings, tax_profit);
                    else if (tax_earnings < tax_profit)
                        message("УСН доходы", tax_earnings, tax_profit);
                    else
                        message("УСН доходы минус расходы", tax_profit, tax_earnings);

                    break;
                }
            }
        }
        System.out.println("Программа завершена!");
    }
    public static void message(String recommend, int chosen, int another){
        System.out.println(
                "\n" +
                "Мы советуем вам " + recommend + "\n" +
                "Ваш налог составит: " + chosen + "р\n" +
                "Налог на другой системе: " + another + "р\n" +
                "Экономия: " + (another - chosen) + "р (" + diffPercent(another, chosen) + "%)\n");
    }
    public static int diffPercent(int max, int min){
        return min == 0 ? 100 : (max - min) * 100 / max;
    }
}