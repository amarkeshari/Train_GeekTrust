package com.example.geektrust;

import com.example.geektrust.service.TrainService;
import com.example.geektrust.service.impl.TrainServiceImpl;

public class Main {
    public static void main(String[] args)  {
        TrainService trainService =new TrainServiceImpl();
        trainService.getArrivalAndDeparture(args[0]);
	}
}
