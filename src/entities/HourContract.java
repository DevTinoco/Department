package entities;

import java.util.Date;

public class HourContract {
     
	  private Date date;
	  private Double valuePerHour;
	  private Integer hours;
	  
	
	  public HourContract() {
		  
	  }


	public HourContract(Date date, Double valuePerHour, Integer hours) {
	
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Double getValuePerhour() {
		return valuePerHour;
	}


	public void setValuePerhour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	//OPERACAO QUE VAI FALAR A QUANTIDA DE HORAS NO CONTRATO:
	//A PROPRIA CLASSE CONTRATO TEM QUE SABER QUANTAS HORAS TRABALHADA. 
	
	public double totalValue() {
		return valuePerHour * hours;
	}
	
	
}
