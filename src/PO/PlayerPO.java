package PO;
import java.io.Serializable;


public class PlayerPO implements Serializable{
	
	/**
	 * ��Ա������Ϣ
	 */
	private static final long serialVersionUID = 1L;
	private String name;            //����
	private String uniformNum;      //���º���
	private String position;        //λ��
	private String height;          //��ߣ�Ӣ��-Ӣ�磩
	private double weight;          //���أ�����
	private String birth;           //���գ��� �գ��꣩
	private int age;                //����
	private double exp;             //����
	private String school;          //��ҵѧУ
	
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
