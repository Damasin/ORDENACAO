
package exercicioordenacao.Service;

import exercicioordenacao.Model.Bubble;
import exercicioordenacao.Model.Collection;
import exercicioordenacao.Model.Ordenacao;
import exercicioordenacao.Model.Selection;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class MetodoOrdenaService {
    private ArrayList<Ordenacao> listaTipodeOrdena;
    
    public MetodoOrdenaService(){
        this.setListaTipodeOrdena(new ArrayList<>());
        this.getlistaTipodeOrdena().add(new Bubble());
        this.getlistaTipodeOrdena().add(new Selection());
    }
    
    public long ordena(Collection lista, String tipo, boolean decrescente){
        for(Ordenacao ordem: this.getlistaTipodeOrdena()){
            if(ordem.tipo().toUpperCase().equals(tipo.toUpperCase())){
                return ordem.ordenaTipo(lista, decrescente);
            }
        }
        return (long) 0.0;
    }
    public ArrayList<Ordenacao> getlistaTipodeOrdena(){
        return listaTipodeOrdena;
    }
    
    public void setListaTipodeOrdena(ArrayList<Ordenacao> listaTipodeOrdena){
        this.listaTipodeOrdena = listaTipodeOrdena;
    }
    
}
