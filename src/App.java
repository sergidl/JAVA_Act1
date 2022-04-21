public class App {
	public static void main(String[] args){

		Volum v1 = new Volum("v1", "titol", "autor", 98, 1);
		Revista r1 = new Revista("r1", "titol", 1999, 1);
		
		System.out.println("\nVolum: ");
		System.out.println(v1.visualtizar());

		System.out.println("\nRevista:");
		System.out.println(r1.visualtizar());
	}
}
