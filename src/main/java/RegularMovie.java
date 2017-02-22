import java.math.BigDecimal;

public class RegularMovie extends Movie {
	public RegularMovie(String title) {
		super(title, "2.00");
	}

	@Override
	public String getPriceCode() {
		return "Regular";
	}

	// movie's late fee method
	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("2.00");
		if (days > 2) {
			BigDecimal extraDays = new BigDecimal(days - 2);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
		}
		return amount;
	}
}