package org.example.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {


        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient());
        patients.add(new Patient());

        Map<String, Result> finalMap = new HashMap<>();

        //we want this final map using java stream without foreach, in key will patient.patientId-result.name
        // input is patients , output  finalMap


    }
}
