package com.example.geektrust.service;

import com.example.geektrust.pojo.Train;

import java.util.List;

public interface TrainArrivalService {
    public void findBogieOrderOfTrain(Train train, List<String> trainStations);
}
