package PO;
import java.io.Serializable;


public class PlayerPO implements Serializable{
	
	/**
	 * 球员基本信息
	 */
	public static final long serialVersionUID = 1L;
	public String name;            //姓名
	public int uniformNum;      //球衣号码
	public String position;        //位置
	public String height;          //身高（英尺-英寸）
	public double weight;          //体重（磅）
	public String birth;           //生日（月 日，年）
	public int age;                //年龄
	public double exp;             //球龄
	public String school;          //毕业学校
	
	
}
