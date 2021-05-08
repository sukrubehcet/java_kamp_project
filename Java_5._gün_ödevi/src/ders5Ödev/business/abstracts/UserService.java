package ders5Ödev.business.abstracts;

import ders5Ödev.entities.concretes.User;

public interface UserService {
    void register(User user);
    void login(String email,String password);
    void update(User user);
    void delete(User user);
}
