package enums;

public enum Type {
    OPEN("Open"), COVERED("Covered");

    private String prettyString;

    Type(String prettyString) {
        this.prettyString = prettyString;
    }

    public String getPrettyString() {
        return prettyString;
    }
}
