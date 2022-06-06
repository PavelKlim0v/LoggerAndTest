package by.tms.loggerandtest.service;

import by.tms.loggerandtest.entity.Operation;
import by.tms.loggerandtest.entity.User;
import by.tms.loggerandtest.storage.OperationStorage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Date;
import java.util.List;
import static by.tms.loggerandtest.constant.Constant.*;

public class CalculatorService {

    private static final OperationStorage operationStorage = new OperationStorage();
    private final Logger logger = LogManager.getLogger(this.getClass());

    public Double calculator(double a, double b, String operand, User user) {
        double result = 0.0;
        if (user != null) {
            logger.debug("method is executed calc");
            switch (operand) {
                case SUM:
                    result = a + b;
                    break;
                case MIN:
                    result = a - b;
                    break;
                case MULT:
                    result = a * b;
                    break;
                case DIV:
                    result = a / b;
                    break;
                default:
                    logger.debug("Check operand ");
                    break;
            }
            logger.debug("method is executed getOperation");
            operationStorage.save(new Operation(a, b, result, operand, user, new Date()));
        }
        logger.debug("Error. Check your user ore operand in method calc");
        return result;
    }

    public List<Operation> findAll() {
        logger.debug("method is executed findAll");
        return operationStorage.getAll();
    }

}
