package ProgramacaoOO;

public class CarroObj {
	public static void main (String[] args) {
		//DECLARANDO OS OBJETOS
		Carro car1= new Carro();
		Carro car2= new Carro();
		Carro car3= new Carro();
		Carro car4= new Carro();

		//CARRO1
		//DECLARANDO OS ATRIBUTOS PARA O CARRO 1
		car1.setModelo("Mitsubish Lancer Evolution 2");
		car1.setQuilometragem("14.000km rodados");
		car1.setCor("Amarelo");
		car1.setPlaca("FRE-0987");
		//DECLARANDO OS MÉTODOS PARA O CARRO 1
		car1.setDireção("até 45°graus");
		car1.setVelocidademax("240 km/h");
		car1.setMotor("4G63 DOHC 2.0L turbo");
		car1.setSeta("Liga");
		//CARRO2
		//DECLARANDO OS ATRIBUTOS PARA O CARRO 2
		car2.setModelo("Fusca");
		car2.setQuilometragem("10.000.000km rodados.");
		car2.setCor("Azul");
		car2.setPlaca("null");
		//DECLARANDO OS MÉTODOS PARA O CARRO 2
		car2.setDireção("vai pra frente");
		car2.setVelocidademax("80km/h");
		car2.setMotor("1.2 f4");
		car2.setSeta("Liga");
		//CARRO3
		//DECLARANDO OS ATRIBUTOS PARA O CARRO 3
		car3.setModelo("Uno branco com escada");
		car3.setQuilometragem("indefinido");
		car3.setCor("branco");
		car3.setPlaca("zuknet");
		//DECLARANDO OS MÉTODOS PARA O CARRO 3
		car3.setDireção("todas");
		car3.setVelocidademax("não foi possivel medir");
		car3.setMotor("não tivemos acesso");
		car3.setSeta("liga");

		//CARRO4
		//DECLARANDO OS ATRIBUTOS PARA O CARRO 4
		car4.setModelo("koenigsegg agera");
		car4.setQuilometragem("0km");
		car4.setCor("branco");
		car4.setPlaca("gr3fre1d");
		//DECLARANDO OS MÉTODOS PARA O CARRO 4
		car4.setDireção("até 60 graus");
		car4.setVelocidademax("446,7 km/h");
		car4.setMotor("motor V8 de 5,0 litros");
		car4.setSeta("liga");

		System.out.println("----Carro1----");
		//Atributos1
		System.out.println(car1.getModelo());
		System.out.println(car1.getQuilometragem());
		System.out.println(car1.getCor());
		System.out.println(car1.getPlaca());
		//modelo1
		System.out.println(car1.getDireção());
		System.out.println(car1.getVelocidademax());
		System.out.println(car1.getMotor());
		System.out.println(car1.getSeta());
		System.out.println("----Carro2----");
		//Atributos2
		System.out.println(car2.getModelo());
		System.out.println(car2.getQuilometragem());
		System.out.println(car2.getCor());
		System.out.println(car2.getPlaca());
		//modelo2
		System.out.println(car2.getDireção());
		System.out.println(car2.getVelocidademax());
		System.out.println(car2.getMotor());
		System.out.println(car2.getSeta());
		System.out.println("----Carro3----");
		//Atributos3
		System.out.println(car3.getModelo());
		System.out.println(car3.getQuilometragem());
		System.out.println(car3.getCor());
		System.out.println(car3.getPlaca());
		//modelo3
		System.out.println(car3.getDireção());
		System.out.println(car3.getVelocidademax());
		System.out.println(car3.getMotor());
		System.out.println(car3.getSeta());
		System.out.println("----Carro4----");
		//Atributos4
		System.out.println(car4.getModelo());
		System.out.println(car4.getQuilometragem());
		System.out.println(car4.getCor());
		System.out.println(car4.getPlaca());
		//modelo4
		System.out.println(car4.getDireção());
		System.out.println(car4.getVelocidademax());
		System.out.println(car4.getMotor());
		System.out.println(car4.getSeta());
	}
}
