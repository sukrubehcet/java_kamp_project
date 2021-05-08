package ders5Ödev.dataAccess.abstracts;

import ders5Ödev.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    User getById(int id);
    User getByEmail(String email);
    List<User> getAll();

}
