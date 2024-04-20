package com.example.geektrust.service.impl;

import com.example.geektrust.service.TrainArrivalService;
import com.example.geektrust.service.TrainDepartureService;
import com.example.geektrust.service.TrainService;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainServiceImpl implements TrainService {

    private final TrainArrivalService trainArrivalService;
    private final TrainDepartureService trainDepartureService;

    public TrainServiceImpl() {
        this.trainArrivalService= new TrainArrivalServiceImpl();
        this.trainDepartureService = new TrainDepartureServiceImpl();
    }

    public void getArrivalAndDeparture(String path) {
        this.readLineByLine(path);
        trainArrivalService.findBogieOrderOfTrain(trainA, stationsTrainA);
        trainArrivalService.findBogieOrderOfTrain(trainB, stationsTrainB);
        trainDepartureService.findBogieOrderOfMergedTrain(trainA, trainB, trainAB, stationsTrainAB);
    }

    private void readLineByLine(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));
            boolean isTrainA = true;
            while (scanner.hasNextLine()) {
                String curLine = scanner.nextLine();
                List<String> stationList = Arrays.asList(curLine.split("\\s+"));
                if (isTrainA) {
                    isTrainA = false;
                    trainA.setStationNames(stationList.subList(2, stationList.size()));
                } else {
                    trainB.setStationNames(stationList.subList(2, stationList.size()));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
