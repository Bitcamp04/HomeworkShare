package homework04.homework04;

import java.util.Scanner;

import chap99_homework.homework04.Employee;

public class UseOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {new Employee(), new Employee(), new Employee(), ... 100개} <- empArr이 의미하는거
		// {newRegularEmployee(), newRegularEmployee(), new newRegularEmployee
		Employee[] empArr = new Employee[100];
		
		Scanner sc = new Scanner(System.in);
		
		int eno;
		String name;
		int pay;
		int bonus;
		int hireYear;
		int workDay;
		int index = 0;
		
		/*
		 * *** 메뉴 선택 ***
		 * 1. 정규직 저장
		 * 2. 이미직 저장
		 * 3. 계약직 저장
		 * 4. 전체 사원 정보 출력
		 * 5. 월급 계산 출력
		 * 6. 프로그램 종료
		 * 
		 * 1번 선택시
		 * 사번을 입력하세요.
		 * 1
		 * 이름을 입력하세요.
		 * 홍길동
		 * 급여를 입력하세요.
		 * 3000
		 * 보너스를 입력하세요.
		 * 300
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 2번선택 시 
		 * 사번을 입력하세요.
		 * 1
		 * 이름을 입력하세요.
		 * 임꺽정
		 * 급여를 입력하세요.
		 * 20
		 * 근무일수를 입력하세요.
		 * 20
		 * 입력한 내용을 empArr에 저장
		 * 
		 * 4번 선택 시
		 * empArr에 저장되어 있는 모든 사원의 정보출력
		 * showEmployeeInfo() 메소드 사용
		 * 
		 * 5번 선택 시
		 * 검색할 사원의 사번을 입력하세요.
		 * 1
		 * 입력한 사번에 해당하는 사원의 정보 출력(showEmployeeInfo() 메소드 사용)
		 * 
		 * 6번 선택 시
		 * 프로그램 종료
		 * 
		 * 다른 번호가 입력되면
		 * 잘못 입력하셨습니다. 출력하고 다시 입력할 수 있도록 메뉴 표출
		 */
		
		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 사원 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			
			System.out.print("메뉴를 선택하세요: ");
			int menuSelect = sc.nextInt();	       
			sc.nextLine();
			
		
			
	          
		}
		
        switch (menuSelect) {
        case 1:
        	System.out.println("사번을 입력하세요.");
        	eno = sc.nextInt();
        	sc.nextLine();     
        	
        	System.out.println("이름을 입력하세요.");
        	name = sc.nextLine();
        	
        	System.out.println("급여를 입력하세요.");
        	pay = sc.nextInt();
        	
        	System.out.println("보너스를 입력하세요.");
        	bonus = sc.nextInt();
        	
            Employee emp = new RegularEmployee(eno, name, pay, 1, bonus)
            empArr[index++] = emp;
            // empArr[index++] = new RegularEmployee(eno, name, pay, 1, bonus) 도 가능
        	break;
        case 2:
        	break;
        case 3:
        	break;
        case 4:
        	break;
        case 5:
        	break;
        case 6:
        	break;
        
        
        
        case 1:
            System.out.println("사번을 입력하세요.");
            eno = sc.nextInt();
            sc.nextLine();
            System.out.println("이름을 입력하세요.");
            name = sc.nextLine();
            System.out.println("급여를 입력하세요.");
            pay = sc.nextInt();
            System.out.println("보너스를 입력하세요.");
            bonus = sc.nextInt();

            empArr[eno] = new Employee(eno, name, pay, bonus);
            System.out.println("입력한 내용을 empArr에 저장");
            break;
        case 2: 
        	System.out.println("사번을 입력하세요.");
            eno = sc.nextInt();
            sc.nextLine();
            System.out.println("이름을 입력하세요.");
            name = sc.nextLine();
            System.out.println("급여를 입력하세요.");
            pay = sc.nextInt();
            System.out.println("보너스를 입력하세요.");
            bonus = sc.nextInt();
            empArr[index++] = new ContractEmployee(eno, name, pay, 1, hireyear)
            break;
        case 2: 
        	System.out.println("사번을 입력하세요.");
            eno = sc.nextInt();
            sc.nextLine();
            System.out.println("이름을 입력하세요.");
            name = sc.nextLine();
            System.out.println("급여를 입력하세요.");
            pay = sc.nextInt();
            System.out.println("보너스를 입력하세요.");
            bonus = sc.nextInt();
            empArr[index++] = new TempEmployee(eno, name, pay, 1, hireyear)
            break;
        case 4:
        	for(int i = 0; i < empArr.length; i++) {
        		empArr[i].showEmployeeInfo();
        			empArr[i].showEmployeeInfo();
        		System.out.println("------------------");
        case 5:
        	System.out.println("검색할 사원의 사번을 입력하세요.");
        	eno = sc.nextInt();
        	
        	for(int i = 0; i < index; i++) {
        		if(empArr[i].getEno() == eno) {
        			empArr[i].showEmployeeInfo();
        			System.out.println("------------------");	
        		}
        	}
        	break;
        case 6:
        	System.out.println("프로그램을 종료합니다.");
        	sc.close();
        	System.exit(0);
        	}

        
	}
	
	public static Employee generateEmployee(Scanner sc, int menuSelect) {
		System.out.println("사번을 입력하세요.");
    	int eno = sc.nextInt();
    	sc.nextLine();     
    	
    	System.out.println("이름을 입력하세요.");
    	String name = sc.nextLine();
    	
    	System.out.println("급여를 입력하세요.");
    	int pay = sc.nextInt();
    	
    	System.out.println("보너스를 입력하세요.");
    	int bonus = sc.nextInt();
	} else if(menuSelect == 2) {
		System.out.println("근무년수를 입력하세요.");
		int hireYear = sc.nextInt();
		
		return new TempEmployee(eno, name, pay, menuSelect, hireYear);
	} else {
		System.out.println("근무일수를 입력하세요.");
		int workDay = sc.nextInt()
		}
	}

}
    

