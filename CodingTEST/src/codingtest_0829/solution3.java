package codingtest_0829;
//실패@
public class solution3 {
static long price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int[][] products = { { 10, 3, 2 }, { 15, 2, 5 } };
		long max = 0;
		price=0;
		for (int i = 0; i < products.length; i++) {
			price=combi(0, i, 0, products, n);
			System.out.println("price"+price);
			max=(price>max)?price:max;
		}

		System.out.println(max);

	}

	private static long combi(int date, int product, int total_price, int[][] products, int n) {
		System.out.println("n="+date);
		if (date == n) {
			price=total_price;
			System.out.println(total_price);
			return price;
		}

		for (int i = 0; i < products.length; i++) {

			int product_price = 0;
			// 행사상품 아닌거
			for (int j = 0; j < products.length; j++) {
				int sell = 0;
				if (i == j) {
					if (products[i][2] * 2 > products[i][0]) {
						sell = products[i][0];
						products[i][0] = 0;
					} else {
						sell = products[i][2] * 2;
						products[i][0] -= sell;
					}
				} else {
					if (products[i][2] > products[i][0]) {
						sell = products[i][0];
						products[i][0] = 0;
					} else {
						sell = products[i][2];
						products[i][0] -= sell;
					}
				}
				product_price += (sell * products[i][1]);
			}
			combi(date + 1, i, total_price + product_price, products, n);
		}
		return price;

	}

}
