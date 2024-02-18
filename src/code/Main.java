/**
 * @author Prince Lesapo and Mbadaliga Arehone Brenden.
 */
public class Main {
    public static void main(String[] args)
    {
        // Student: Tiger Woods
        final Name tiger;
        final Date tigerDob; // date of birth
        final Student tigerStudent;
        boolean tigerGraduated = true;

        tiger = new Name("Tiger", "Woods");
        tigerDob = new Date(1975, 12, 30);
        tigerStudent = new Student(tiger, "A00123456", tigerDob, tigerGraduated);

        // Student: Bill Gates
        final Name bill;
        final Date billDob;
        final Student billStudent;
        boolean billGraduated = false;

        bill = new Name("Bill", "Gates");
        billDob = new Date(1955, 10, 28);
        billStudent = new Student(bill, "A00987654", billDob, billGraduated);

        // Printing details for Tiger Woods.
        System.out.println(tiger.getFullName() + " (" + tiger.getInitials() + ")" + " (st # " +
                tigerStudent.getStudentNumber() + ")" + " was born on " + tigerDob.getYyMmDd() +
                ". The student has graduated.");

        // Printing details for Bill Gates.
        System.out.println(bill.getFullName() + " (" + bill.getInitials() + ")" + " (st # " +
                billStudent.getStudentNumber() + ")" + " was born on " + billDob.getYyMmDd() +
                ". The student has not graduated.");


    }
}
