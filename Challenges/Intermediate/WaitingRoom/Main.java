import java.util.Arrays;

import java.util.*;

public class Main {
    // https://www.codewars.com/kata/542f0c36d002f8cd8a0005e5/java
    public static void main(String[] args) {
        lastPatientChairNumber(13);
    }


    public static void lastPatientChairNumber(int numPatients) {
        Integer[] patientsArr = new Integer[numPatients];
        Integer[] chairsArr = new Integer[numPatients];
        Arrays.fill(chairsArr, 0);
        Arrays.setAll(patientsArr, i -> i + 1);
        List<Integer> patientsList = Arrays.asList(patientsArr);
        List<Integer> chairsList = Arrays.asList(chairsArr);

        condition1(patientsList, 2, 5);

        System.out.println(chairsList);

    } 


    public static void condition1(List patientsList, int patient1, int patient2) {
        // find a index as far from other index as possible
        
    }

    public static void getDistanceFromExit() {

    }

}
