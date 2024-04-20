package com.example.geektrust.service.impl;

import com.example.geektrust.pojo.Train;
import com.example.geektrust.service.TrainDepartureService;

import java.util.ArrayList;
import java.util.List;

public class TrainDepartureServiceImpl implements TrainDepartureService {
    @Override
    public void findBogieOrderOfMergedTrain(Train trainA, Train trainB, Train trainAB, List<String> trainStations) {
        List<String> stationsTrainAB = getTrainStations(trainA, trainB, trainStations);
        if (stationsTrainAB.isEmpty()) {
            System.out.println("JOURNEY_ENDED");
            return;
        }
        trainAB.setStationNames(stationsTrainAB);
        trainAB.ly("DEPARTURE ");
        for (int i = 0; i < trainAB.getStationNames().size(); i++) {
            System.out.print(trainAB.getStationNames().get(i) + " ");
        }
    }

    private List<String> getTrainStations(Train trainA, Train trainB, List<String> trainStations) {
        List<String> stationsTrainAB = new ArrayList<>();
        for (String curStationName : trainStations) {
            for (int j = 0; j < trainA.getStationNames().size(); j++) {
                if (curStationName.equals(trainA.getStationNames().get(j))) {
                    stationsTrainAB.add(curStationName);
                }
            }
            for (int j = 0; j < trainB.getStationNames().size(); j++) {
                if (curStationName.equals(trainB.getStationNames().get(j))) {
                    stationsTrainAB.add(curStationName);
                }
            }
        }
        return stationsTrainAB;
    }
}
