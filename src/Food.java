public enum Food {
    SOUP,
    CABBAGE_ROLLS,
    KISSEL;

    @Override
    public String toString() {
        if (this.equals(SOUP)) return "суп";
        else if (this.equals(CABBAGE_ROLLS)) return "голубцы";
        else if (this.equals(KISSEL)) return "кисель";

        else return null;
    }
}
