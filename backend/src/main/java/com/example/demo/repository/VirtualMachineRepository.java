package com.example.demo.repository;


import com.example.demo.model.Trainer;
import com.example.demo.model.VirtualMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VirtualMachineRepository extends JpaRepository<VirtualMachine,Long> {

    VirtualMachine findVirtualMachineByVirtualMachineId (long id);
    List<VirtualMachine> findVirtualMachineByTrainingSessions(long id);

    List<VirtualMachine> findVirtualMachineByStatusAndVersion(String status , String version);



}
