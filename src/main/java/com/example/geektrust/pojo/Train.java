package com.example.geektrust.pojo;

import java.util.List;

public class Train {
    private final String trainName;

    private final int numberOfEngines;

    private List<String> stationNames;

    public Train(String trainName, int numberOfEngines) {
        this.trainName = trainName;
        this.numberOfEngines = numberOfEngines;
    }

    public void lx(String trainState, List<String> trainStations) {
        this.ly(trainState);
        for (int i = 0; i < this.getStationNames().size(); i++) {
            String curStationName = this.getStationNames().get(i);
            boolean isPresent = false;
            for (String trainStation : trainStations) {
                if (curStationName.equals(trainStation)) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                System.out.print(curStationName + " ");
            }
        }
        System.out.println();
    }

    public void ly(String trainState) {
        System.out.print(trainState + trainName + " ");
        for (int noOfEngines = 0; noOfEngines < numberOfEngines; noOfEngines++) {
            System.out.print("ENGINE ");
        }
    }

    public List<String> getStationNames() {
        return stationNames;
    }

    public void setStationNames(List<String> stationNames) {
        this.stationNames = stationNames;
    }
}
