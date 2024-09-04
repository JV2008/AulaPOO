package ProgramacaoOO;

public class ObjAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao car1= new Aviao();
		Aviao car2= new Aviao();
		Aviao car3= new Aviao();
		Aviao car4= new Aviao();

		//Avião1
		//DECLARANDO OS ATRIBUTOS PARA O AVIÃO 1
		car1.setModelo("Avião de transporte");
		car1.setQuilometragem("200.000.000 km");
		car1.setCapacidade(600);
		car1.setMotores(4);
		//DECLARANDO OS MÉTODOS PARA O AVIÃO 1
		car1.setDireção("até 45°graus");
		car1.setVelocidademax("1000 km/h");
		car1.setTamanho("Grande");
		car1.setVoar("Liga");
		//Avião2
		//DECLARANDO OS ATRIBUTOS PARA O AVIÃO 2
		car2.setModelo("Avião de carga");
		car2.setQuilometragem("10.000.000km rodados.");
		car2.setCapacidade(15);
		car2.setMotores(0);
		//DECLARANDO OS MÉTODOS PARA O AVIÃO 2
		car2.setDireção("vai pra frente");
		car2.setVelocidademax("80km/h");
		car2.setTamanho("1.2 f4");
		car2.setVoar("Liga");
		//Avião3
		//DECLARANDO OS ATRIBUTOS PARA O AVIÃO 3
		car3.setModelo("Avião bélico");
		car3.setQuilometragem("200km");
		car3.setCapacidade(45);
		car3.setMotores(6);
		//DECLARANDO OS MÉTODOS PARA O AVIÃO 3
		car3.setDireção("todas");
		car3.setVelocidademax("não foi possivel medir");
		car3.setTamanho("não tivemos acesso");
		car3.setVoar("liga");

		//Avião4
		//DECLARANDO OS ATRIBUTOS PARA O AVIÃO 4
		car4.setModelo("Helicóptero");
		car4.setQuilometragem("0km");
		car4.setCapacidade(6);
		car4.setMotores(3);
		//DECLARANDO OS MÉTODOS PARA O AVIÃO 4
		car4.setDireção("até 360 graus");
		car4.setVelocidademax("145 km/h");
		car4.setTamanho("motor V8 de 5,0 litros");
		car4.setVoar("liga");

		System.out.println("----Avião1----");
		//Atributos1
		System.out.println(car1.getModelo());
		System.out.println(car1.getQuilometragem());
		System.out.println(car1.getCapacidade());
		System.out.println(car1.getMotores());
		//método1
		System.out.println(car1.getDireção());
		System.out.println(car1.getVelocidademax());
		System.out.println(car1.getTamanho());
		System.out.println(car1.getVoar());
		System.out.println("----Avião2----");
		//Atributos2
		System.out.println(car2.getModelo());
		System.out.println(car2.getQuilometragem());
		System.out.println(car2.getCapacidade());
		System.out.println(car2.getMotores());
		//método2
		System.out.println(car2.getDireção());
		System.out.println(car2.getVelocidademax());
		System.out.println(car2.getTamanho());
		System.out.println(car2.getVoar());
		System.out.println("----Avião3----");
		//Atributos3
		System.out.println(car3.getModelo());
		System.out.println(car3.getQuilometragem());
		System.out.println(car3.getCapacidade());
		System.out.println(car3.getMotores());
		//método3
		System.out.println(car3.getDireção());
		System.out.println(car3.getVelocidademax());
		System.out.println(car3.getTamanho());
		System.out.println(car3.getVoar());
		System.out.println("----Avião4----");
		//Atributos4
		System.out.println(car4.getModelo());
		System.out.println(car4.getQuilometragem());
		System.out.println(car4.getTamanho());
		System.out.println(car4.getMotores());
		//método4
		System.out.println(car4.getDireção());
		System.out.println(car4.getVelocidademax());
		System.out.println(car4.getTamanho());
		System.out.println(car4.getVoar());
	

	}

}
