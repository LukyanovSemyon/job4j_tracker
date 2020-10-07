package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
                users.put(user, list);
            }
        }
    }

    public User findByPassport(String passport) {
        User user1 = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                user1 = user;
                break;
            }
        }
        return user1;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account acc : list) {
                if (acc.getRequisite().equals(requisite)) {
                    account = acc;
                    break;
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = true;
        Account account1 = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, destRequisite);
        if (account1 == null || account2 == null || account1.getBalance() < amount) {
            rsl = false;
        } else {
            account1.setBalance(account1.getBalance() - amount);
            account2.setBalance(account2.getBalance() + amount);
        }
        return rsl;
    }
}
