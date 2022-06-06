package by.tms.loggerandtest.service;

import by.tms.loggerandtest.entity.User;
import by.tms.loggerandtest.storage.UserStorage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserService {

    private static final UserStorage userStorage = new UserStorage();
    private final Logger logger = LogManager.getLogger(this.getClass());

    public boolean add(User user) {
        logger.debug("method is executed addUser");
        if (userStorage.isExistsByLogin(user.getLogin())) {
            return false;
        }
        userStorage.save(user);
        return true;
    }

    public User findUserByLogin(String login) {
        logger.debug("method is executed findUserByLogin");
        return userStorage.findByLogin(login);
    }

}
