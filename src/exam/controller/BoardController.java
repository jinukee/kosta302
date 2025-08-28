package exam.controller;

public class BoardController {

	public void select() {
		System.out.println("로컬에서 작업함~");
	}

	public void insert() {
		System.out.println("서버에서 작업함~");
	}


	public void delete() {
		System.out.println("원격에서 삭제 추가~");
	}
	
	public void update() {
		System.out.println("로컬에서 update 입니다.~");
	}
}
