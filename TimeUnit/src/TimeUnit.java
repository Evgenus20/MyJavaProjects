public enum TimeUnit {

    HOUR("hour"), WEEK("week"), YEAR("year");

    private String name;

    TimeUnit(String name) {
        this.name = name;
    }


    static TimeUnit fromString(String str) {
        TimeUnit.values();
        for (int i = 0; i < TimeUnit.values().length; i++) {
            if (TimeUnit.values()[i].name().equalsIgnoreCase(str)) {
                return TimeUnit.values()[i];
            }
        }
        return null;
    }
}