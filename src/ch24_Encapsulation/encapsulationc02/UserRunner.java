package ch24_Encapsulation.encapsulationc02;

public class UserRunner {

    public static void main(String[] args) {
        User user=new User("meryem","kara","12345",46);


        System.out.println("user.getAd() = " + user.getAd());
        System.out.println("user.setYas() = " + user.getYas());
        System.out.println("user.getSoyad() = " + user.getSoyad());
        System.out.println("user.getPassword() = " + user.getPassword());

        System.out.println("user = " + user);

       User user2=new User("rumeysa","tek","12345",-33);
        System.out.println("user2 = " + user2);


    }

}
