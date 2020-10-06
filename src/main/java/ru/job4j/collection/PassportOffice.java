package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (citizens.size() == 0) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        for (String key : citizens.keySet()) {
            if (!citizen.getPassport().contains(key)) {
                citizens.put(citizen.getPassport(), citizen);
                rsl = true;
                break;
            }
        }
        return rsl;
    }

        public Citizen get(String passport) {
            Citizen value = null;
            for (String key : citizens.keySet()) {
                if (key.contains(passport)) {
                    value = citizens.get(key);
                }
            }
            return value;
        }
}
