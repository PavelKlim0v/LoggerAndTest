package by.tms.loggerandtest.entity;

import java.util.Date;

public class Operation {

    private final double num1;
    private final double num2;
    private final double result;
    private final String operand;
    private final User user;
    private final Date date;

    public Operation(double num1, double num2, double result, String operand, User user, Date date) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operand = operand;
        this.user = user;
        this.date = date;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public String getOperand() {
        return operand;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "User = " + user.getName() +
                "(num1=" + num1 +
                ", operand='" + operand +
                ", num2=" + num2 +
                ", result=" + result +
                "'Date=" + date + ')';
    }

}
