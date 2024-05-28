package teamproject.travel.model;

public class Traveler {
	private National natianal; //국가 클래스에서 가져온 나라 변수 선언
	private String name; //여행객 이름 변수 순언
	private int age; //여행객 나이 변수 선언
	private String gender;// 여행객 성별 선언
	
	
	public Traveler() { //여행자 기본생성자 
		this.natianal = new National();
	}
	
	public Traveler(String name) { //나이 입력받는 여행자 생성자 선언
		this.name = name;
		this.natianal = new National();
	}

	public National getNatianal() {
		return natianal;
	}

	public void setNatianal(National natianal) {
		this.natianal = natianal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
}
