
package exercicioordenacao.Model;

import java.util.ArrayList;

public class Selection implements Ordenacao{
    private ArrayList<Double> list;
    
    @Override
    public long ordenaTipo(Collection lista, boolean decrescente) {
    	list = lista.getLista();
    	long tempoInicial = System.currentTimeMillis();
    	
    	if(decrescente) {
    		for(int i=0;i<this.list.size();i++) {
                
                Double max= this.list.get(i);
                int max_index = i;
                
                for(int j=i+1;j<this.list.size();j++) {
                    if(this.list.get(j)>max) {
                    	max=this.list.get(j);
                        max_index=j;

                    }
                }
                if(i!=max_index) {
                   exchange(i,max_index);
                }
            }
    	}else {
    		for(int i=0;i<this.list.size();i++) {
                
                Double min= this.list.get(i);
                int min_index = i;
                
                for(int j=i+1;j<this.list.size();j++) {
                    if(this.list.get(j)<min) {
                        min=this.list.get(j);
                        min_index=j;

                    }
                }
                if(i!=min_index) {
                   exchange(i,min_index);
                }
            }
    	}
    	long tempoPercorrido = System.currentTimeMillis() - tempoInicial;
    	return tempoPercorrido;
    }
    
    public void exchange(int current_elem,int new_min) {
        Double temp= this.list.get(current_elem);
        this.list.set(current_elem, this.list.get(new_min));
        this.list.set(new_min, temp);
    }

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "SELECTIONSORT";
	}
    
    
}
