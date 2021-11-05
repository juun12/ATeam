
public class ExVariable_Control3 {
	public static void main(String[] args) {
		/*for(int i=-2;i > -10 ;i--) {
			for(int j=-1;j > -10;j--) {
				System.out.print(i+" X "+ j+" = "+i*j+"\t");
			}
			System.out.println();
			
		}*/
		
		int i = 1;
		
		while(i<9) {
			int j=1;	//잉? 다시 1 해버리면 2단만 계속반복돼야하는거아님?
			i++;
			while(j<9) {
				j++;
				System.out.print(i+" X "+ j+" = "+i*j+"\t");
				
			}
			System.out.println("ㅁㅁ");
		}
		
	}
}
