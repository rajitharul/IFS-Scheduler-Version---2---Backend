package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="virtual_machine")
public class VirtualMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long virtualMachineId;

    @Column(name="product")
    private String product;


    @Column(name="name")
    private String name;

    @Column(name="version")
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="region")
    private String region;

    @Column(name="status")
    private String status;

    public VirtualMachine() {
    }

    public VirtualMachine(String product, String version, String region, String status) {
        super();
        this.product = product;
        this.version = version;
        this.region = region;
        this.status = status;
    }

    public long getVirtualMachineId() {
        return virtualMachineId;
    }

    public void setVirtualMachineId(long virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @ManyToMany(mappedBy = "virtualMachines" , fetch = FetchType.LAZY , cascade = {CascadeType.MERGE})
       //@JsonIgnoreProperties("virtualMachines")
    private List<TrainingSession> trainingSessions;




    public List<TrainingSession> getTrainingSessions() {
        return trainingSessions;
    }

    public void setTrainingSessions(List<TrainingSession> trainingSessions) {
        this.trainingSessions = trainingSessions;
    }


    //adding a convenience method


    public void add(TrainingSession tempSession) {

        if(trainingSessions ==null) {

            trainingSessions = new ArrayList<TrainingSession>();

        }

        trainingSessions.add(tempSession);


    }






}
