package PO;
import java.io.Serializable;


public class TeamPo implements Serializable{
	/**
	 * ��ӻ�����Ϣ
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;            //���ȫ��
	private String abbreviation;        //��д
	private String location;            //���ڵ�
	private String division;            //����
	private String partition;           //����
	private String homeCourt;           //����
	private String time;                //����ʱ��
	
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
