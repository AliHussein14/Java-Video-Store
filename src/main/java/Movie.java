import java.math.BigDecimal;
// abstract method
public abstract class Movie {
    String title;
    String priceCode;
    public Movie(String title, String priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    public String getTitle() {
        return title;
    }
    public abstract String getPriceCode();
    public abstract BigDecimal calculateFees(int days);
}