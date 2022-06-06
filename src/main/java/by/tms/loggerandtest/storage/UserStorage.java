package by.tms.loggerandtest.storage;

import by.tms.loggerandtest.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private static final List<User> users = new ArrayList<>();

    public void save(User user) {
        if (user != null) {
            users.add(user);
            logger.debug("method is executed save in UserStorage");
        }
        logger.debug("Error. The user has not been saved. You caught Null");
    }

    public User findByLogin(String login) {
        logger.debug("method is executed findByLogin in UserStorage");
        for (User user : users) {
            if (user == null && user.getLogin() == null) {
                logger.debug("Error.Check user and password");
            } else if (user.getLogin().equals(login)) {
                return user;
            }
        }
        logger.debug("Check user and password");
        return null;
    }

    public boolean isExistsByLogin(String login) {
        logger.debug("method is executed isExistsByLogin in UserStorage");
        for (User user : users) {
            if (user == null && user.getLogin() == null) {
                logger.debug("Error.Check user and password");
            } else if (user.getLogin().equals(login)) {
                return true;
            }
        }
        logger.debug("Error. Check user and password");
        return false;
    }

}
