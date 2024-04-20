package com.example.geektrust.service;

import com.example.geektrust.pojo.Train;
import com.example.geektrust.service.impl.TrainArrivalServiceImpl;
import com.example.geektrust.service.impl.TrainDepartureServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface TrainService {

    final Train trainA = new Train("TRAIN_A", 1);

    final Train trainB = new Train("TRAIN_B", 1);

    final Train trainAB = new Train("TRAIN_AB", 2);

    final List<String> stationsTrainA = new ArrayList<>(Arrays.asList("CHN", "SLM", "BLR", "KRN"));

    final List<String> stationsTrainB = new ArrayList<>(Arrays.asList("TVC", "SRR", "MAQ", "MAO", "PNE"));

    final List<String> stationsTrainAB = new ArrayList<>(Arrays.asList("GHY", "NJP", "PTA", "NDL", "AGA", "BPL", "ITJ", "NGP"));


    public void getArrivalAndDeparture(String path);
}
