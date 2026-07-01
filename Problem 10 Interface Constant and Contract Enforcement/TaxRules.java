public interface TaxRules {
    double TAX_RATE = 0.15;

    double calculateTax(double itemValue);
}