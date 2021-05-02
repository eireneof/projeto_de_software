package itens;

public class TimeCard {
  private double in;
  private double out;
  private double workedHours;
  private String date;

  public TimeCard(double in, double out, String date) {
      this.setIn(in);
      this.setOut(out);
      this.setDate(date);
      this.setWorkedHours(out - in);
  }

public double getIn() {
	return in;
}

public void setIn(double in) {
	this.in = in;
}

public double getOut() {
	return out;
}

public void setOut(double out) {
	this.out = out;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public double getWorkedHours() {
	return workedHours;
}

public void setWorkedHours(double workedHours) {
	this.workedHours = workedHours;
}
  
}
