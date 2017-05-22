public class Main {
	
	public static void main(String[] args) {
		// tyyp - elud - tugevus - kaitse
		
		Character orc = new Character("orc", 1300, 160, 40);		
		System.out.println("kui elf ryndab orci, siis voitjaks jaab: ");
		System.out.println(orc.rynnatakse("elf",1000, 90, 30));

		
		Character inimene = new Character("inimene", 500, 70, 70);
		System.out.println("kui elf ryndab inimest, siis voitjaks jaab: ");
		System.out.println(inimene.rynnatakse("elf",1000, 90, 30));

		
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/turva-1.jar