public abstract class PersonagemDragonBall {
          protected String nome;
          protected int idade;
          protected String sexo;
          protected int temporada;
          protected double ki;
          protected String poderEspecial;

            public PersonagemDragonBall(String nome,int idade,String sexo,int temporada,double ki,String poderEspecial){
                    this.nome=nome;
                    this.idade=idade;
                    this.sexo=sexo;
                    this.temporada=temporada;
                    this.ki=ki;
                    this.poderEspecial=poderEspecial;

                    

            }
            public abstract double calcularPoder();
}


public interface Transformavel {
        public void transformar(int nivel);
}



public class terraqueo extends PersonagemDragonBall {


    public terraqueo (String pais,String cidade){
        super(pais,cidade);
        this.pais=pais;
        this.cidade=cidade;


    }
    @Override
    public String toString(){
        return "Terraqueo País="+pais+"Cidade="+cidade;

    }
    @Override
    public void calcularPoder(){
            System.out.println("Sstatus de poder"+ki);


    }
}



public static class PersonagemFactory {

}
