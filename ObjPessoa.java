package ProgramacaoOO;

public class ObjPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1= new Pessoa();
		Pessoa pessoa2= new Pessoa();
		
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereço("New york");
		pessoa1.setProfissao("Ator");
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(36);
		pessoa2.setEndereço("Miami");
		pessoa2.setProfissao("Jogador de futebol");
	
		System.out.println("----Pessoa1----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereço());
		System.out.println(pessoa1.getEndereço());
		System.out.println("----Pessoa2----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereço());
		System.out.println(pessoa2.getEndereço());
	}

}
