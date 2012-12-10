public class EvenString extends String{
	
	public EvenString(String string){
		super(string);
	}
	
	public void printEven(){
		String result = "";
		for(int c=0;c<super.length();c++){
			if(c%2 == 0){
				result += super.substring(c,1);
			}
		}
		System.out.print(result);
	}
}
		
