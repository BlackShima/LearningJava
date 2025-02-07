package ADT_101.Tutorail5;

import java.util.LinkedList;

class CovidVaccine {
    private String ID;
    private String firstName;
    private String lastName;
    private LinkedList<String> previousVaccine;

    public CovidVaccine(String ID, String firstName, String lastName, LinkedList<String> previousVaccine) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.previousVaccine = previousVaccine;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getID() {
        return ID;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setPreviousVaccine(LinkedList<String> previousVaccine) {
        this.previousVaccine = previousVaccine;
    }
    
    public LinkedList<String> getPreviousVaccine() {
        return previousVaccine;
    }

    public void insertVaccine(String vaccine) {
        previousVaccine.add(vaccine);
    }
    
    public boolean deleteVaccine(String vaccine) {
       return previousVaccine.remove(vaccine);
    }

    public void deleteAllVaccine(){
        previousVaccine.clear();
    }

    public int getSize(){
        return previousVaccine.size();
    }
    public boolean isEmpty(){
        return previousVaccine.isEmpty();
    }

    public void traverseVaccine(){
        for(String vaccine : previousVaccine){
            System.out.println(vaccine);
        }
    }


    @Override
    public String toString() {
        return "ID: "+ getID() +"\nFirstName: "+ getFirstName() +"\nLastName: "+ getLastName()+"\nPreviousVaccine: "+ getPreviousVaccine();
    }
}
