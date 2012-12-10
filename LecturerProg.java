public class LecturerProg{
	
	public static void main(String[] args){
		LecturerProg prog = new LecturerProg();
		prog.launch();
	}
	
	public void launch(){
		Lecturer lecturer = new Lecturer("John Smith");
		System.out.println("Lecturer's name is " + lecturer.getName());
		lecturer.doResearch("Algorithms");
		lecturer.teach("Deterministic Finite Automaton");
	}
}
