package assignments;

public class Assignment12 {

	static int calculateMaxProfit(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i <= prices.length - 1; i++) {

			// check if todays is lower than the previous price
			if (prices[i] < minPrice) {
				minPrice = prices[i]; // update the minimum price

			} else {
				int profit = prices[i] - minPrice; // if todays price is higher than calculate profit then sell it
				if (profit > maxProfit) { // check if current day profit is greater than max profit
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] stockPrice1 = { 7, 1, 5, 3, 6, 4 };
		int[] stockPrice2 = { 7, 6, 4, 3, 1 };

		System.out.println("Max profit for stock price 1 is :" + calculateMaxProfit(stockPrice1));
		System.out.println("Max profit for stock price 2 is :" + calculateMaxProfit(stockPrice2));
	}

}
