public class Season {
    public static String getSeasons(Seasons season) {
        switch (season){
            case WINTER:
                return "Зима";
            case AUTUMN:
                return "Осень";
            case SPRING:
                return "Весна";
            case SUMMER:
                return "Лето";
            default:
                throw new IllegalArgumentException("Неизвестный сезон: " + season);
        }
    }
}
