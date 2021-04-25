package itens;

public class TimeCard {
  public double in;
  public double out;
  public double workedHours;
  public String date;

  public TimeCard(double in, double out, String date) {
      this.in = in;
      this.out = out;
      this.date = date;
      this. workedHours = out - in;
  }
  
}
