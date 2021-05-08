package ders5Ödev;

import ders5Ödev.business.concretes.UserCheckManager;
import ders5Ödev.business.concretes.UserManager;
import ders5Ödev.core.concretes.EmailManager;
import ders5Ödev.dataAccess.concretes.HibernateUserDao;
import ders5Ödev.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setFirstName("Şükrü");
        user.setLastName("Behçet");
        user.setEmail("sukrubehcet@gmail.com");
        user.setPassword("111111");

        User user1 = new User();
        user1.setId(2);
        user1.setFirstName("Barbaros");
        user1.setLastName("Hayrettin");
        user1.setEmail("Barbaroshayrettin@gmail.com");
        user1.setPassword("222222");

        UserManager userManager = new UserManager(new HibernateUserDao(),new UserCheckManager(new EmailManager()));

        userManager.register(user);
        userManager.login(user.getEmail(),user.getPassword());
        System.out.println("*-----------------*");
        userManager.register(user1);
        userManager.login(user1.getEmail(),user1.getPassword());
    }
}
