//Сезоны года:
//Создайте Enum, представляющий времена года: WINTER, SPRING, SUMMER, AUTUMN.
// Затем реализуйте функцию, которая принимает значение этого
// Enum и возвращает соответствующее название сезона на русском языке.
//
//Требования:
//
//Определите Enum для сезонов.
//Реализуйте метод, который принимает сезон и возвращает строку с его названием.
public class Main {
    public static void main(String[] args) {
        System.out.println(Season.getSeasons(Seasons.AUTUMN));
        System.out.println(Season.getSeasons(Seasons.WINTER));
        System.out.println(Season.getSeasons(Seasons.SPRING));
        System.out.println(Season.getSeasons(Seasons.SUMMER));
    }
}
