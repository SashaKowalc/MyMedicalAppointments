package model;

public class Nurse extends User {

    //Attribute
    private String speciality;

    //Constructors
    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Rol: Enfermera");
        System.out.println("Hospital: Cruz Negra");
        System.out.println("Hospital: Pediatria");
    }

    //Getters and setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
