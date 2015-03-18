package PO;
import java.io.Serializable;


public class TeamPO implements Serializable{
	/**
	 * 球队基本信息
	 */
	public static final long serialVersionUID = 1L;
	public String fullName;            //球队全名
	public String abbreviation;        //缩写
	public String location;            //所在地
	public String division;            //赛区
	public String partition;           //分区
	public String homeCourt;           //主场
	public String time;                //建立时间
	
	

}
