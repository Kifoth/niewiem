public class Main {
    public static void main(String[] args) {

//        User user = new User("milena", "user", "user@user.pl");
//
//        System.out.println("Nazwa uzytkownika: " + user.getLogin()
//                + "\nHaslo uzytkownika: "  + user.getPassword());
//
//        user.setEmail("milena@gmail.com");
//        user.setLogin("milena_b");
//        user.setPassword("milena");
//        System.out.println("Nowa nazwa uzytkownika: " + user.getLogin()
//                + "\nNowe haslo uzytkownika: "  + user.getPassword());

        admin adm = new admin("kasia", "kowalska", 123, "kk@wp.pl");
        // System.out.println(adm.getEmail() + adm.getImie() + adm.getNazwisko());
        System.out.println(adm.toString());



    }
}