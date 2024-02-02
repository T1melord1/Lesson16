public class Main {
    public static void main(String[] args) {
        String info = "Молоко: 256, масло: 321, печенье: 54";

        int price1 = Integer.parseInt(info.substring(info.indexOf(" "), info.indexOf(",")).trim());
        String temp = info.substring(info.indexOf(","), info.lastIndexOf(",")).trim();
        int price2 = Integer.parseInt(temp.substring(temp.lastIndexOf(":") + 1).trim());
        int price3 = Integer.parseInt(info.substring(info.lastIndexOf(" ")).trim());

        System.out.println(price1+price2+price3);
    }
}
