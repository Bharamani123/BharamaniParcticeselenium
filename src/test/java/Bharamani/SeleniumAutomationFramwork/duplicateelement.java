package Bharamani.SeleniumAutomationFramwork;

public class duplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[]= {"java","javascript","ruby","c","java","ruby"};
		
		
		for(int i=0;i<name.length;i++) {
			for(int j=1+i;j<name.length;j++) {
				
				if(name[i].equals(name[j]))
				{
					System.out.println("duplicate : " +name[i]);
				}
			}
		}

	}

}
