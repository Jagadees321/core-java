package basicprograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pair implements Comparable<Pair> {
    int price, day;

    Pair(int price, int day) {
        this.price = price;
        this.day = day;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.price, other.price);
    }
}

public class StockMarket {

    public static int buyMaximumProducts(int[] price, int k) {
        int n = price.length;

        // Create a list of pairs containing stock price and day number
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(price[i], i + 1));
        }

        // Sort the list based on stock prices in ascending order
        Collections.sort(pairs);

        int totalStocks = 0;

        // Iterate through the sorted list and buy stocks
        for (Pair pair : pairs) {
            int availableMoney = pair.price * pair.day;
            //System.out.println(availableMoney);
            if (availableMoney <= k) {
                // Buy as much as possible on this day
                totalStocks += pair.day;
                k -= availableMoney;
                System.out.println(totalStocks);
            } else {
                // Buy remaining stocks with the remaining money
                totalStocks += k / pair.price;
                System.out.println(totalStocks);
                break;
            }
        }

        return totalStocks;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] price1 = {10, 7, 19};
        int k1 = 45;
        System.out.println(buyMaximumProducts(price1, k1)); // Output: 4

//        int[] price2 = {7, 10, 4};
//        int k2 = 100;
//        System.out.println(buyMaximumProducts(price2, k2)); // Output: 6
    }
}
