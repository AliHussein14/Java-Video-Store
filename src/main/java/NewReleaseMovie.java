import java.math.BigDecimal;

public class NewReleaseMovie extends Movie {
	public NewReleaseMovie(String title) {
		super(title, "3.00");
	}

	@Override
	public String getPriceCode() {
		return "NewRelease";
	}

	// movie's late fee method
	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("3.00");
		BigDecimal rentalDays = new BigDecimal(days);
		amount = new BigDecimal("3.00").multiply(rentalDays);
		return amount;
	}
}