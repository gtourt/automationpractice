package enums;

/**
 * Enum to list the payment methods available.
 */
public enum PaymentMethods {

    BANK_WIRE("BY BANK WIRE"),
    CHECK("BY CHECK");

    private String methodName;

    PaymentMethods(String methodName) {
        this.methodName = methodName;
    }

    public String getValue() {
        return this.methodName;
    }
}
