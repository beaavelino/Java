package exercicio1;

public class Animal {
	//Atributos
		private String name;
		private int age;
		private boolean emiteSom = false; 
		private boolean correr = false;
		
		//Construtor
		public Animal(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		//Métodos da Classe Animal
		public void emitirSom() {
			System.out.println("Emitindo som..");
		}
		public void correr(){
			System.out.println("Correndo..");
		}
		
		//Métodos Get e Sets
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Animal [name=" + name + ", age=" + age + ", emiteSom=" + emiteSom + ", correr=" + correr + "]";
		}

		
	}

