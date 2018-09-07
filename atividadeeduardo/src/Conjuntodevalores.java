public class Conjuntodevalores {

    int[] valores; 
    double somatoria;

    public Conjuntodevalores(int i) {
        valores = new int[i];
    }

    public void cadastrar(int endereco, int valor) {
        valores[endereco] = valor;
    }

    public int maiorvalor() {
        for (int i = 0; i < 10; i++) {
            
        }
            
        
        return 0;
    }

    public int menorvalor() {
        for (int i = 0; i < 10; i++) {
            
        }
        return 0;
    }

    public double media() {
        for (int i = 0; i < valores.length; i++) {
               somatoria += valores[i]; 
               
        
        }
       
        
        
        return somatoria / valores.length; 
    }

}
