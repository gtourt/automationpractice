package enums;

/**
 * Enum which lists the tab names of the products.
 */
public enum TabNames {
    TSHIRTS("T-SHIRTS"),
    DRESSES("DRESSES"),
    WOMEN("WOMEN");

    private String tabName;

    TabNames(String tabName) {
        this.tabName = tabName;
    }

    public String getValue() {
        return this.tabName;
    }
}