package ProgramacaoOO;

public class ObjAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal aml1= new Animal();
		Animal aml2= new Animal();
		Animal aml3= new Animal();
		Animal aml4= new Animal();
		Animal aml5= new Animal();
		Animal aml6= new Animal();
		Animal aml7= new Animal();
		Animal aml8= new Animal();

		//Animal1
		//DECLARANDO OS ATRIBUTOS PARA O Animal 1
		aml1.setNome("Vaca");
		aml1.setFamilia("Bovídeos");
		aml1.setIdade(8);
		aml1.setPeso(510);
		//DECLARANDO OS MÉTODOS PARA O Animal 1
		aml1.setAnda("Normalmente");
		aml1.setDorme("12 à 14 horas p/dia");
		aml1.setSom("mugir");
		aml1.setCome("Capim e pasto");
		//Avião2
		//DECLARANDO OS ATRIBUTOS PARA O Animal 2
		aml2.setNome("Bezerro");
		aml2.setFamilia("Bovídeos");
		aml2.setIdade(1);
		aml2.setPeso(160);
		//DECLARANDO OS MÉTODOS PARA O Animal 2
		aml2.setAnda("Pouco");
		aml2.setDorme("8 à 14 horas p/dia");
		aml2.setSom("mugir");
		aml2.setCome("leite materno");
		//Avião3
		//DECLARANDO OS ATRIBUTOS PARA O Animal 3
		aml3.setNome("Cabrito");
		aml3.setFamilia("Bovídeos ou Caprinos");
		aml3.setIdade(5);
		aml3.setPeso(35);
		//DECLARANDO OS MÉTODOS PARA O Animal 3
		aml3.setAnda("Bastante");
		aml3.setDorme("5 horas p/dia");
		aml3.setSom("balir");
		aml3.setCome("leite materno");

		//Avião4
		//DECLARANDO OS ATRIBUTOS PARA O Animal 4
		aml4.setNome("Cachorro filhote");
		aml4.setFamilia("Canino");
		aml4.setIdade(1);
		aml4.setPeso(12);
		//DECLARANDO OS MÉTODOS PARA O Animal 4
		aml4.setAnda("Muito");
		aml4.setDorme("8 à 14 horas p/dia");
		aml4.setSom("Latido");
		aml4.setCome("leite materno");

		//Avião5
		//DECLARANDO OS ATRIBUTOS PARA O Animal 5
		aml5.setNome("Coelho");
		aml5.setFamilia("Leporidae");
		aml5.setIdade(6);
		aml5.setPeso(2);
		//DECLARANDO OS MÉTODOS PARA O Animal 5
		aml5.setAnda("pulando");
		aml5.setDorme("8,4 horas p/dia");
		aml5.setSom("chiar ou guinchar");
		aml5.setCome("cenoura");

		//Avião6
		//DECLARANDO OS ATRIBUTOS PARA O Animal 6
		aml6.setNome("Láparos");
		aml6.setFamilia("Leporidae");
		aml6.setIdade(1);
		aml6.setPeso(1);
		//DECLARANDO OS MÉTODOS PARA O AVIÃO 6
		aml6.setAnda("pulando");
		aml6.setDorme("12 h p/dia");
		aml6.setSom("chiar ou guinchar");
		aml6.setCome("leite materno");

		//Avião7
		//DECLARANDO OS ATRIBUTOS PARA O AVIÃO 7
		aml7.setNome("Pintinho");
		aml7.setFamilia("fasianídeos");
		aml7.setIdade(1);
		aml7.setPeso(06);
		//DECLARANDO OS MÉTODOS PARA O AVIÃO 7
		aml7.setAnda("pouco");
		aml7.setDorme("entre 6 e 8 h p/dia");
		aml7.setSom("cacarejo");
		aml7.setCome("milho e ração");

		//Avião8
		//DECLARANDO OS ATRIBUTOS PARA O AVIÃO 8
		aml8.setNome("Galinha");
		aml8.setFamilia("fasianídeos");
		aml8.setIdade(4);
		aml8.setPeso(2);
		//DECLARANDO OS MÉTODOS PARA O AVIÃO 8
		aml8.setAnda("pouco");
		aml8.setDorme("entre 6 e 8 h p/dia");
		aml8.setSom("cacarejo");
		aml8.setCome("milho e ração");
		
		
		System.out.println("----Animal 1----");
		//Atributos1
		System.out.println(aml1.getNome());
		System.out.println(aml1.getFamilia());
		System.out.println(aml1.getIdade());
		System.out.println(aml1.getPeso());
		//método1
		System.out.println(aml1.getAnda());
		System.out.println(aml1.getDorme());
		System.out.println(aml1.getSom());
		System.out.println(aml1.getCome());
		System.out.println("----Animal 2----");
		//Atributos2
		System.out.println(aml2.getNome());
		System.out.println(aml2.getFamilia());
		System.out.println(aml2.getIdade());
		System.out.println(aml2.getPeso());
		//método2
		System.out.println(aml2.getAnda());
		System.out.println(aml2.getDorme());
		System.out.println(aml2.getSom());
		System.out.println(aml2.getCome());
		System.out.println("----Animal 3----");
		//Atributos3
		System.out.println(aml3.getNome());
		System.out.println(aml3.getFamilia());
		System.out.println(aml3.getIdade());
		System.out.println(aml3.getPeso());
		//método3
		System.out.println(aml3.getAnda());
		System.out.println(aml3.getDorme());
		System.out.println(aml3.getSom());
		System.out.println(aml3.getCome());
		System.out.println("----Animal 4----");
		//Atributos4
		System.out.println(aml4.getNome());
		System.out.println(aml4.getFamilia());
		System.out.println(aml4.getIdade());
		System.out.println(aml4.getPeso());
		//método4
		System.out.println(aml4.getAnda());
		System.out.println(aml4.getDorme());
		System.out.println(aml4.getSom());
		System.out.println(aml4.getCome());

		System.out.println("----Animal 5----");
		//Atributos5
		System.out.println(aml5.getNome());
		System.out.println(aml5.getFamilia());
		System.out.println(aml5.getIdade());
		System.out.println(aml5.getPeso());
		//método5
		System.out.println(aml5.getAnda());
		System.out.println(aml5.getDorme());
		System.out.println(aml5.getSom());
		System.out.println(aml5.getCome());
		System.out.println("----Animal 6----");
		//Atributos6
		System.out.println(aml6.getNome());
		System.out.println(aml6.getFamilia());
		System.out.println(aml6.getIdade());
		System.out.println(aml6.getPeso());
		//método6
		System.out.println(aml6.getAnda());
		System.out.println(aml6.getDorme());
		System.out.println(aml6.getSom());
		System.out.println(aml6.getCome());
		System.out.println("----Animal 7----");
		//Atributos7
		System.out.println(aml7.getNome());
		System.out.println(aml7.getFamilia());
		System.out.println(aml7.getIdade());
		System.out.println(aml7.getPeso());
		//método7
		System.out.println(aml7.getAnda());
		System.out.println(aml7.getDorme());
		System.out.println(aml7.getSom());
		System.out.println(aml7.getCome());
		System.out.println("----Animal 8----");
		//Atributos8
		System.out.println(aml8.getNome());
		System.out.println(aml8.getFamilia());
		System.out.println(aml8.getIdade());
		System.out.println(aml8.getPeso());
		//método8
		System.out.println(aml8.getAnda());
		System.out.println(aml8.getDorme());
		System.out.println(aml8.getSom());
		System.out.println(aml8.getCome());

	}

}