package first;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		//학생들 추가
		Student st1 = new Student("손오공", "1111","남","31");
		Student st2 = new Student("베지터", "2222","남","33");
		Student st3 = new Student("크리링", "3333","남","29");
		Student st4 = new Student("부르마", "4444","여","34");
		
		//학생 리스트를 ArrayList api를 사용하여 저장
		ArrayList<Student> list = new ArrayList<Student>();
		
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		System.out.println("============학생 명단============");
		
		//for each문으로 학생 정보 출력
		for(Student st : list) {
			
			System.out.println("이름 : " + st.getName() + " | 학번 : " + st.getNo() + " | 성별 : " + st.getGender() + " | 나이 : " + st.getAge() );
			
			
		}
		
		//입력받을 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//while문으로 반복 작업 가능하게 만듦
		while(true) {
			
			System.out.println("학생을 검색하시려면 y, 종료하시려면 n 버튼을 눌러주세요.");
			
			String answer = sc.next();
			//y 클릭시 if문 수행
			if(answer.equals("y")) {
				
				System.out.println("학생 이름을 검색해주세요. 정보가 출력됩니다.");
				
				//학생 정보가 없을시 사용할 boolean타입의 변수
				boolean flag = false;
				
				String name = sc.next();
				//학생 명단 수 만큼 루프 돌림
				for(Student st : list) {
					
					//루프를 돌리며 학생 명단과 검색받은 이름이 일치하는지 여부 확인
					if(st.getName().equals(name)) {
						
						//일치하는 정보 출력
						System.out.println("이름 : " + st.getName() + " | 학번 : " + st.getNo() + " | 성별 : " + st.getGender() + " | 나이 : " + st.getAge() );
						
						flag = true;
						
					}
					
						
						
					}
				//일치하지 않으면 flag의 상태 판단 후 출력(일치 여부가 없기 때문에 위에 flag = true를 실행 못함!)
				if(!flag) {
					
					System.out.println("해당하는 학생 정보가 없습니다.");
					
					
					
					
				}
				
				
				
				
				
				
				//n을 누르면 while문 탈출
			}else if(answer.equals("n")) {
				
				break;
			}
			
			
			
			
			
		}
		//닫아주자
		sc.close();
		//while문 탈출하고 시스템 종료
		System.out.println("시스템이 종료되었습니다.");
		
		
		
	}

}
