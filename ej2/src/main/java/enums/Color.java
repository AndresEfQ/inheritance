package enums;

public enum Color {
    WHITE("White"), BLACK("Black"), RED("Red"), BLUE("Blue"), GREY("Grey");

    private final String pretty;
    Color (String pretty) {
        this.pretty = pretty;
    }

    public String getPretty() {
        return pretty;
    }
}
