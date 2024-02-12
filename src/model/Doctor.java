package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    // Attributes
    private String speciality;

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Constructors
    public Doctor() {
    }

    public Doctor(String name, String email) {
        super(name, email);
    }

    //Getters and setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos

    public void addAvailableAppointments (String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
    }

    public static class AvailableAppointment {
       private int id;
       private Date date;
       private String time;
       SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
       public AvailableAppointment(String date, String time) {
           try {
               this.date = format.parse(date);
           } catch (ParseException e) {
               e.printStackTrace();
           }
           this.time = time;
       }

       public String getTime() {
           return time;
       }

       public Date getDate(String DATE) {
           return date;
       }

       public String getDate () {
           return format.format(date);
       }

       @Override
       public String toString() {
           return "Available Appointment: " +
                   "\nDate=" + date +
                   "\nTime='" + time;
       }
   }


}
