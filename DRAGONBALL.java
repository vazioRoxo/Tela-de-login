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



public class Terraqueo extends PersonagemDragonBall {

}



public static class PersonagemFactory {

}
