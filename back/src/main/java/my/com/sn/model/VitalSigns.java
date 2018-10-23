package my.com.sn.model;

import java.util.Date;

public class VitalSigns {
	
	private Integer systolic;
	private Integer diastolic;
	private Integer heartRate;
	private Date date;
	
	public VitalSigns() {
		super();
    }
	public VitalSigns(Integer systolic, Integer diastolic, Integer heartRate, Date date) {
		super();
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.heartRate = heartRate;
		this.date = date;
	}
	public Integer getSystolic() {
		return systolic;
	}
	public void setSystolic(Integer systolic) {
		this.systolic = systolic;
	}
	public Integer getDiastolic() {
		return diastolic;
	}
	public void setDiastolic(Integer diastolic) {
		this.diastolic = diastolic;
	}
	public Integer getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(Integer heartRate) {
		this.heartRate = heartRate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "VitalSigns [systolic=" + systolic + ", diastolic=" + diastolic + ", heartRate=" + heartRate + ", date="
				+ date + "]";
	}
	

}
