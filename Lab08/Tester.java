public class Tester{
  public static void main(String args[]){
    Patient P = new Patient("Karim", "O+", 30);
    P.RegisterPatient(Math.random());
    P.ServePatient();
    P.CancelAll();
    P.CanDoctorGoHome();
    P.ShowAllPatient();
  }
}