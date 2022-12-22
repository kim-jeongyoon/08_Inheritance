package edu.kh.inheritance.model.vo;

public class Student extends Person{
	
	//Person 클래스 내용을 확장한다 
	// == Student 클래스에 Person클래스 내용(속성,기능) 이 추가됨

	
	//필드 
	/*private String name; //  이름
	private int age; // 나이
	private String nationality; // 국적 */
	
	private int grade;  // 학년
	private int classRoom;	//반
	//생성자
	//기본생성자
	public Student() {
		//Student() 객체 생성시
		//내부에 상속받은 Person객체를 생성하기 위한
		//Person생성자 호출 코드가 필요하다!!
		super(); // 내가 상속받고 있는 부모를 받아온다. 반드시 최상단에 있어야함
				//부모생성자를 호출하는 코드
		
		//super() 생성자 미작성시, 컴파일러가 컴파일 단계에서 자동으로 추가해줌!
		
		
	}
	//매개변수 생성자
	public Student(String name, int age, String nationality, int grade, int classRoom) {
	
		/*
		this.name = name;
		this.age = age;
		this.nationality = nationality;*/
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
		
		// super() 생성자
		// 1. 자식 내 부모객체 생성
		// 2. 부모객체 생성 시 초기화 

		
	
	}
	/*
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoon(int classRoon) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() { 
		return super.toString() + "/" + grade + "/" + classRoom;
		
	}
	//메소드

}
