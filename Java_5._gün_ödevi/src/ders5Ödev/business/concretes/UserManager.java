package ders5Ödev.business.concretes;

import ders5Ödev.business.abstracts.UserCheckService;
import ders5Ödev.business.abstracts.UserService;
import ders5Ödev.dataAccess.abstracts.UserDao;
import ders5Ödev.entities.concretes.User;

public class UserManager implements UserService {
    private UserDao userDao;
    private UserCheckService userCheckService;

    public UserManager(UserDao userDao,UserCheckService userCheckService){
        this.userDao = userDao;
        this.userCheckService = userCheckService;
    }

    @Override
    public void register(User user) {
        if (userCheckService.isValidUser(user,userDao)){
            System.out.println("Kayıt Başarılı bir şekilde gerçekleşmiştir");
            return;
        }
        System.out.println("Kayıt Başarısız.");
    }

    @Override
    public void login(String email, String password) {
        if (userCheckService.isCorrectLoginInput(email,password,userDao)){
            System.out.println("Giriş Yapılıyor...");
            return;
        }
        System.out.println("Giriş Başarısız");
    }

    @Override
    public void update(User user) {
        if (userCheckService.isValidUser(user,userDao)){
            userDao.updateUser(user);
            System.out.println("Güncellenme gerçekleşti");
            return;
        }
        System.out.println("Güncellenme Başarısız");
    }

    @Override
    public void delete(User user) {
        userDao.deleteUser(user);
        System.out.println("Kullsnıcı Başarılı bir Şekilde silindi");
    }
}
