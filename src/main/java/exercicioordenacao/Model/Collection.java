
package exercicioordenacao.Model;

import java.util.ArrayList;
public class Collection {
    ArrayList<Double> lista;
    
    public Collection(){
        this.lista = new ArrayList<>();
    }
    public void inserirNum(Double num){
        this.lista.add(num);
    }
    public ArrayList<Double> getLista(){
        return lista;
    }
    
    @Override
    
    public String toString(){
        return "Collection [lista==" + lista +"]";
    }
}
