package ADT_101.Tutorail5;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<CovidVaccine> vaccineList = new LinkedList<>();
        String[] vaccineType = {"Phizer", "Moderna","AstraZeneca","Johnson&Johnson"};
        Random random = new Random();
        for(int i =1;i <= 10;i++) {
            String ID="ID"+i;
            String firstName="FirstName"+i;
            String lastName="LastName"+i;
        

        LinkedList<String> previousVaccines = new LinkedList<>();
        previousVaccines.add(vaccineType[random.nextInt(vaccineType.length)]);
        previousVaccines.add(vaccineType[random.nextInt(vaccineType.length)]);

        CovidVaccine cv=new CovidVaccine(ID, firstName, lastName,previousVaccines);
        vaccineList.add(cv);
        }

        for(CovidVaccine vaccine: vaccineList){
            System.out.println(vaccine);
        }
    }
    
    
}
