package vsu.cs.javalang.service;

import org.springframework.stereotype.Service;
import vsu.cs.javalang.mapper.FillingMachineMapper;
import vsu.cs.javalang.repository.FillingMachineRepository;

@Service
public class FillingMachineService {
    private final FillingMachineMapper fillingMachineMapper;
    private final FillingMachineRepository fillingMachineRepository;

    public FillingMachineService(FillingMachineMapper fillingMachineMapper, FillingMachineRepository fillingMachineRepository) {
        this.fillingMachineMapper = fillingMachineMapper;
        this.fillingMachineRepository = fillingMachineRepository;
    }


}
