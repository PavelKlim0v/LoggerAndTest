package by.tms.loggerandtest.storage;

import by.tms.loggerandtest.entity.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class OperationStorage {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private final List<Operation> operations = new ArrayList<>();

    public void save(Operation operation) {
        if (operation != null) {
            logger.debug("method is executed save in OperationStorage");
            operations.add(operation);
        }
        logger.debug("Error. Check your operation. Ypu can'nt save");
    }

    public List<Operation> getAll() {
        logger.debug("method is executed getAll in OperationStorage");
        return new ArrayList<>(operations);
    }

}
