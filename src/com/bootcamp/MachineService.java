package com.bootcamp;



import java.util.HashMap;
import java.util.Map;

public class MachineService {

    private Map<String, Machine> machines;
    private final MachineDao machineDao = new MachineDao();


    public MachineService(){
        machines = machineDao.getMachineMap();
    }

    public void add(Machine machine){
        machines.put(machine.getId(), machine);
    }

    public Machine getMachineByID(String id){
        return machines.get(id);
    }

}
