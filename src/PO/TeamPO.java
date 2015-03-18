package PO;
import java.io.Serializable;


public class TeamPO implements Serializable{
	/**
	 * 球队基本信息
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;            //球队全名
	private String abbreviation;        //缩写
	private String location;            //所在地
	private String division;            //赛区
	private String partition;           //分区
	private String homeCourt;           //主场
	private String time;                //建立时间
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPartition() {
		return partition;
	}
	public void setPartition(String partition) {
		this.partition = partition;
	}
	public String getHomeCourt() {
		return homeCourt;
	}
	public void setHomeCourt(String homeCourt) {
		this.homeCourt = homeCourt;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
