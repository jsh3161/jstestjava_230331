import java.util.Scanner;

public class WonCalculator {

	final double CHANGE_RATE = 1309.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이는 무엇입니까?");
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		System.out.println("입력하신 이름은 "+age +"입니다");
		
		if(age >=20)
			System.out.println("당신은 성인이시군요!");
		else
			System.out.println("당신은 미성년이시군요!");
		
		System.out.println("당신의 나이는 "+ age +"살 입니다.");
		
		scanner.close();

	}


}
