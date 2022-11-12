package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {
    public static void main(String[] args) {
/*        User user = new User();

        user.setUserName("Wojtek");
        user.setEmail("Wojtek3@yahoo.com");
        user.setPassword("Szczerbate krasnale");

        UserDao userDao = new UserDao();
        userDao.create(user);*/
        UserDao userDao = new UserDao();
        User user2 = new User();
        user2 = userDao.read(3);
        System.out.println(user2.getUserName());


    }
}
