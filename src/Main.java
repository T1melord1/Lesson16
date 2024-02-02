public class Main {
    public static void main(String[] args) {
        String info = "Молоко: 256, масло: 321, печенье: 54, Шоколад: 32";

        System.out.println(info.replaceAll("\\w","*"));
        // \\s - ПРОБЕЛЫ
        // \\d - ЦИФРЫ
        // \\w - БУКВЫ(АНГЛЙИСКИЕ) И ЦИФРЫ
        // \\S - ВСЁ КРОМЕ ПРОБЕЛЬНЫХ СИМВОЛОВ
        // \\D - ВСЁ КРОМЕ ЦИФР
        // \\W - ВСЁ КРОМЕ АНГЛИЙСИКХ БУКВ И ЦИФР

    }
}
