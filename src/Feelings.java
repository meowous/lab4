public enum Feelings {
    NORMAL("нормальность"),
    GREED("жадность"),
    DESPAIR("отчаяние");

    private final String feel;

    Feelings(String feel) {
        this.feel = feel;
    }

    public String getFeel(){
        return feel;
    }

}
