
package exercicioordenacao.Model;

import java.util.ArrayList;

public class Bubble implements Ordenacao {
    private ArrayList<Double> list;
    
    
     @Override
    public long ordenaTipo(Collection lista, boolean decrescente) {
        this.list = lista.getLista();
        boolean s = false;
        Double temp;
        long tempoInicial = System.currentTimeMillis();
        
    	if(decrescente) {
    		while (!s) {
                s = true;
                for (int i = 0; i < this.list.size() - 1; i++) {
                    if (this.list.get(i) < this.list.get(i+1)) {
                        temp = this.list.get(i);
                        this.list.set(i, this.list.get(i + 1));
                        this.list.set(i + 1, temp);
                        s = false;
                    }
                }
    		}
    	}else {
    		while (!s) {
                s = true;
                for (int i = 0; i < this.list.size() - 1; i++) {
                    if (this.list.get(i).compareTo(this.list.get(i + 1)) > 0) {
                        temp = this.list.get(i);
                        this.list.set(i, this.list.get(i + 1));
                        this.list.set(i + 1, temp);
                        s = false;
                    }
                }
    		}
    	}
    	
    	long tempoPercorrido = System.currentTimeMillis() - tempoInicial;
    	return tempoPercorrido;
    }
    
	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "BUBBLESORT";
	}
}
    
    
    

