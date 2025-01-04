package Module2;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    private String id;
    private String name;
    private double salary;
    private List<Account> managedAccounts;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managedAccounts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void addAccount(Account account) {
        managedAccounts.add(account);
    }



}
