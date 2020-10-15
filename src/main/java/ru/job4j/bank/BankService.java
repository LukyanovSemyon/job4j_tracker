package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
                users.put(user.get(), list);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> user = users.keySet().stream()
                .filter(a -> a.getPassport().equals(passport))
                .findFirst();
        return user;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> account = Optional.empty();
        if (user.isPresent()) {
            account = users.get(user.get()).stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = true;
        Optional<Account> account1 = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> account2 = findByRequisite(destPassport, destRequisite);
        if (account1.isEmpty() || account2.isEmpty() || account1.get().getBalance() < amount) {
            rsl = false;
        } else {
            account1.get().setBalance(account1.get().getBalance() - amount);
            account2.get().setBalance(account2.get().getBalance() + amount);
        }
        return rsl;
    }
}
