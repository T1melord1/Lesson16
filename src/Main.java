public class Main {
    public static final String VALID_REGEX = " ";
    public static void main(String[] args) {
        String info = "Молоко: 256, масло: 321; печенье: 54, Шоколад: 32";

       info = info.replaceAll("\\D+", " ").trim();
        String[] split = info.split("\\s");
        int sum = 0;
        for(String e: split){

            sum += Integer.parseInt(e);
        }
        System.out.println(sum);
    }
}
