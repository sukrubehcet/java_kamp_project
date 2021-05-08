package ders5Ödev.dataAccess.concretes;

import ders5Ödev.dataAccess.abstracts.UserDao;
import ders5Ödev.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> userList = new ArrayList<User>();

    @Override
    public void addUser(User user) {
        System.out.println("Hibernate tarafından eklendi : "+user.getFirstName()+" "+user.getLastName());
        userList.add(user);
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("Hibernate tarafından silindi : "+user.getFirstName()+" "+user.getLastName());
        userList.remove(getById(user.getId()));
    }

    @Override
    public void updateUser(User user) {
        System.out.println("Hibernate tarafıdan güncellendi : "+user.getFirstName()+" "+user.getLastName());
        userList.remove(getById(user.getId()));
        userList.add(user);
    }

    @Override
    public User getById(int id) {
        List<User> userList = getAll();
        if (userList != null){
            for (User user : userList){
                if (user.getId()==id)
                    return user;
            }
        }
        return null;

    }

    @Override
    public User getByEmail(String email) {
        List<User> userList = getAll();
        if (userList != null){
            for (User user : userList){
                if (user.getEmail().equals(email))
                    return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return userList;
    }
}
