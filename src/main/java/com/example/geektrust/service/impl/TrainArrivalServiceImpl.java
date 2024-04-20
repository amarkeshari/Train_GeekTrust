package com.example.geektrust.service.impl;

import com.example.geektrust.pojo.Train;
import com.example.geektrust.service.TrainArrivalService;

import java.util.List;

public class TrainArrivalServiceImpl implements TrainArrivalService {

    @Override
    public void findBogieOrderOfTrain(Train train, List<String> trainStations) {
        train.lx("ARRIVAL ", trainStations);
    }
}
