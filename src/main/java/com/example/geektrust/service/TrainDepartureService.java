package com.example.geektrust.service;

import com.example.geektrust.pojo.Train;

import java.util.List;

public interface TrainDepartureService {
    public void findBogieOrderOfMergedTrain(Train trainA, Train trainB, Train trainAB, List<String> trainStations);
}
