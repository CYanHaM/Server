package PO;
import java.io.Serializable;


public class PlayerPO implements Serializable{
	
	/**
	 * 球员基本信息
	 */
	private static final long serialVersionUID = 1L;
	private String name;            //姓名
	private String uniformNum;      //球衣号码
	private String position;        //位置
	private String height;          //身高（英尺-英寸）
	private double weight;          //体重（磅）
	private String birth;           //生日（月 日，年）
	private int age;                //年龄
	private double exp;             //球龄
	private String school;          //毕业学校
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniformNum() {
		return uniformNum;
	}
	public void setUniformNum(String uniformNum) {
		this.uniformNum = uniformNum;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}
