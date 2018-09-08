package enums;

/**
 * Enum which lists the stage names of the process when a user
 * makes a purchase.
 */
public enum PurchaseStages {
    SUMMARY("SHOPPING-CART SUMMARY"),
    ADDRESSES("ADDRESSES"),
    SHIPPING("SHIPPING"),
    PAYMENT_METHOD("PLEASE CHOOSE YOUR PAYMENT METHOD"),
    ORDER_SUMMARY("ORDER SUMMARY"),
    ORDER_CONFIRMATION("ORDER CONFIRMATION");

    private String stageName;

    PurchaseStages(String stagename) {
        this.stageName = stagename;
    }

    public String getValue() {
        return this.stageName;
    }
}
