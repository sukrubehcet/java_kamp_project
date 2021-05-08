package ders5Ödev.business.abstracts;

import ders5Ödev.dataAccess.abstracts.UserDao;
import ders5Ödev.entities.concretes.User;

public interface UserCheckService {
    boolean isValidFirstName(String firstName);
    boolean isValidLastName(String lastName);
    boolean isValidPassword(String password);
    boolean isValidEmailFormat(String email);
    boolean isUsedEmail(String email, UserDao userdao);
    boolean isValidUser(User user, UserDao userdao);
    boolean isCorrectLoginInput(String email,String password,UserDao userdao);

}
