
public class Demo07Switch {
	
	public static void main (String[] args) {
		
		int weeks=10;
		
		switch (weeks) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
		
		case 3:
			System.out.println("Wednesday");
			break;
		
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("The date is incorrect");
			break; //最后一个break语句可以省略，但建议不要省略。
			
			

		
		} 
		
	}

}
