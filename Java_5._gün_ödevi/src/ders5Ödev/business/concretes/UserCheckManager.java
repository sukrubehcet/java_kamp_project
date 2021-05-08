package ders5Ödev.business.concretes;

import ders5Ödev.business.abstracts.UserCheckService;
import ders5Ödev.core.abstracts.AuthorService;
import ders5Ödev.core.abstracts.EmailService;
import ders5Ödev.dataAccess.abstracts.UserDao;
import ders5Ödev.entities.concretes.User;

import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {
    private AuthorService authorService;
    private EmailService emailService;

    public UserCheckManager(EmailService emailService){
        this.emailService = emailService;
    }

    public UserCheckManager(AuthorService authorService,EmailService emailService){
        this.authorService= authorService;
        this.emailService=emailService;
    }

    @Override
    public boolean isValidFirstName(String firstName) {
        if (firstName.length()>2)
            return true;
        System.out.println("İsminiz 2 Harften az olamaz");
        return false;
    }

    @Override
    public boolean isValidLastName(String lastName) {
        if (lastName.length()>2)
            return true;
        System.out.println("Soyadınız 2 harften az olamaz");
        return false;
    }

    @Override
    public boolean isValidPassword(String password) {
        if (password.length()>=6)
            return true;
        System.out.println("Parolanız en az 6 karakter olmalı");
        return false;
    }

    @Override
    public boolean isValidEmailFormat(String email) {
        String emailRegex="^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        if (email==null){
            System.out.println("Yanlış email formatı girdiniz");
            return false;
        }else if (!pattern.matcher(email).matches())
            System.out.println("Doğru email formatı girdiniz");
        return true;
    }

    @Override
    public boolean isUsedEmail(String email, UserDao userdao) {
        if (userdao.getByEmail(email)!=null){
            System.out.println("Kullanılmış email!");
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidUser(User user, UserDao userdao) {
        if (authorService!=null)
            return authorService.isValidUser();
        if (!isValidFirstName(user.getFirstName()))
            return false;
        if (!isValidLastName(user.getLastName()))
            return false;
        if (!isValidEmailFormat(user.getEmail()))
            return false;
        if (!isUsedEmail(user.getEmail(),userdao))
            return false;
        if (!isValidPassword(user.getPassword()))
            return false;
        emailService.sendVerificationEmail(user.getEmail());
        System.out.println("Doğrulandııı..");
        return true;
    }

    @Override
    public boolean isCorrectLoginInput(String email, String password, UserDao userdao) {
        if (authorService!=null)
            return authorService.isValidUser();
        User user = userdao.getByEmail(email);
        if (user == null){
            System.out.println("Yanlış Email adresi");
            return false;
        }else if (!user.getPassword().equals(password)){
            System.out.println("yanlış parola");
            return false;
        }
        return true;
    }
}
