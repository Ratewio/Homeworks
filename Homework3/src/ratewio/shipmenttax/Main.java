package ratewio.shipmenttax;

import ratewio.shipmenttax.utils.TaxCalculator;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inter cost (RUB): ");
        int cost = sc.nextInt();
        System.out.print("Inter weight (KG): ");
        int weight = sc.nextInt();
        System.out.print("Tax amount: " + TaxCalculator.getTaxes(cost, weight) + " RUB");
    }
}
