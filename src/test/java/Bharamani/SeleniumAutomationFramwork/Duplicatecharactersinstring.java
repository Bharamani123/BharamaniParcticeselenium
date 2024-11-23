package Bharamani.SeleniumAutomationFramwork;

public class Duplicatecharactersinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String name="bharammni";
	        int length= name.length();
	        char [] ch= name.toCharArray();
	        
	        for(int i=0;i<length;i++){
	            
	            for (int j=1+i;j<length;j++){
	                
	                if(ch[i]==ch[j]){
	                    System.out.println("Duplicate characters are:" +ch[j]);
	                    break;
	                }
	                
	                
	                
	            }
	        }
		

	}

}
