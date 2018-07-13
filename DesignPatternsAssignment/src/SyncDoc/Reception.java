package SyncDoc;

import java.util.ArrayList;
import java.util.List;

public class Reception {

    private List<Doctor> doctorList=new ArrayList<Doctor>(11);

    public Reception(){

        doctorList.add(new Doctor1());
        doctorList.add(new Doctor2());
        doctorList.add(new Doctor3());
        doctorList.add(new Doctor4());
        doctorList.add(new Doctor5());
        doctorList.add(new Doctor6());
        doctorList.add(new Doctor7());
        doctorList.add(new Doctor8());
        doctorList.add(new Doctor9());
        doctorList.add(new Doctor10());


    }

    void getDoctorAppointment(int docID){
        try {
            doctorList.get(docID-1).getAppointment();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Only Doctors from 1-10 Available");
        }
    }
}
