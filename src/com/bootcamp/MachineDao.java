package com.bootcamp;

import java.util.HashMap;
import java.util.Map;

public class MachineDao {

    public Map<String, Machine> getMachineMap(){
        Map<String, Machine> machines = new HashMap<String, Machine>();
        machines.put("001", new Machine("001"));
        machines.put("007", new Machine("007"));
        machines.put("R2D2",new Machine("R2D2"));
        machines.put(null, new Machine(null));
        return machines;
    }
}
