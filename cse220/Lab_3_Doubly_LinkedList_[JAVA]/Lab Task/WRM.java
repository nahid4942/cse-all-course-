// NO NEED THIS SUBMIT THIS CLASS
public class WRM {
    Patient dh;

    // The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id, name, age, bloodgroup, null, null);
        Patient last = dh.prev;
        last.next = newPatient;
        newPatient.prev = last;
        newPatient.next = dh;
        dh.prev = newPatient;
        System.out.println("Patient registration complete: " + id);
    }

    public void servePatient() {
        if (dh.next == dh) {
            System.out.println("no paitient to serve ");
            return;
        }
        Patient firstPaitient = dh.next;

        dh.next = firstPaitient.next;

        firstPaitient.next.prev = dh;

        System.out.println("serving paitent id :  " + dh.id);
    }

    public void showAllPatient() {
        if (dh.next == dh) {
            System.out.println("no paitient");
            return;

        }
        Patient temp = dh.next;

        while (temp != dh) {
            System.out.println("paitent id " + temp.id);
            System.out.println("paitent id " + temp.name);

            temp = temp.next;

        }

    }

    public Boolean canDoctorGoHome() {
        return dh.next == dh;

    }

    public void cancelAll() {
        dh.next = dh;
        dh.prev = dh;
        System.out.println("all appointment are canceled");

    }

    public void reverseTheLine() {
        if (dh.next == dh) {
            System.out.println("no patient");

        }
        Patient curr = dh.next;
        while (curr != dh) {

            Patient temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr=temp;

        }
        Patient temp2 = dh.next;
        dh.next=dh.prev;
        dh.prev=temp2;

    }

}
