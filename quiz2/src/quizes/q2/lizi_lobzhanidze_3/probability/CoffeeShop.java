package quizes.q2.lizi_lobzhanidze_3.probability;

public class CoffeeShop {





        public static void main(String[] args) {
            int pricePerCoffee = 250;
            int numCoffeeSold = 100;
            int totalCostOfBeans = 15000;
            int tax = 7200; // 72 lari in tetri
            int water = 90;
            int gas = 351;
            int electricity = 15900; // 159 lari in tetri
            int parking = 3000; // 30 lari in tetri

            int otherExpenses = tax + water + gas + electricity + parking;

            double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
            System.out.println("Profit in Laris: " + profit);
        }
        public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
            int totalIncome = pricePerCoffee * numCoffeeSold;
            int totalCost = totalCostOfBeans + otherExpenses;
            int profitInTetri = totalIncome - totalCost;
            double profitInLaris = profitInTetri / 100.0; // Converting to Laris

            return profitInLaris;
        }
    }