public class Main {
    public static void main(String[] args) {
        System.out.println(school(25, 30));
        System.out.println(school(29, 31));
        System.out.println(school(27, 34));
        System.out.println(school(28, 35));
        System.out.println(school(23, 37));
    }

    public static String school(int agePerson, int temperature) {
        if (agePerson >= 20 && agePerson <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        }
        if (agePerson < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (agePerson > 45 && temperature >= -10 && temperature <= 25) {
            return "Оставайтесь дома";
        } else {
            return "Оставайтесь дома!";
        }
    }

}