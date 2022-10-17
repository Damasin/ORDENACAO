
package exercicioordenacao.Presenter;

import exercicioordenacao.Model.Collection;
import exercicioordenacao.Model.ReadArquivo;
import exercicioordenacao.Service.MetodoOrdenaService;
import exercicioordenacao.View.View;

public class OrdenaPresenter {
    String tipo;
    boolean decrescente;
    Collection arrayArqLido;
    View view;
    long tempexec;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDecrescente() {
        return decrescente;
    }

    public void setDecrescente(boolean decrescente) {
        this.decrescente = decrescente;
    }

    public Collection getArrayArqLido() {
        return arrayArqLido;
    }

    public void setArrayArqLido(Collection arrayArqLido) {
        this.arrayArqLido = arrayArqLido;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public long getTempexec() {
        return tempexec;
    }

    public void setTempexec(long tempexec) {
        this.tempexec = tempexec;
    }
    
    
    public OrdenaPresenter(View view){
        this.setView(view);
    }
    
     public boolean isOrdenar() {
    	if(!this.view.getLstSemOrdem().getText().equals("")) {
    		//System.out.println(this.view.getRbtnDecrescente().isSelected());
    		//System.out.println(this.view.getCmbModelo().getSelectedItem());
    		this.setDecrescente(this.view.getRbtnDecrescente().isSelected());
    		this.setTipo((String) this.view.getCmbMetodo().getSelectedItem());
    		return true;
    	}else {
    		return false;
    	}
    }
    public void Ordena() {
    	if(isOrdenar()) {
    		MetodoOrdenaService ord = new MetodoOrdenaService();
    		this.setTempexec(ord.ordena(this.getArrayArqLido(), this.getTipo(), this.getDecrescente()));
    		this.getView().getLstOrdenados().setText("");
    		
    		exibirListaOrdenada();
    		exibirTempoExecucao();
    	}
    }

    private boolean getDecrescente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void lerArquivo(String caminhoArquivo) {
    	
    	
    	ReadArquivo l = new ReadArquivo(this);
    	Collection lista = new Collection();
    	lista = l.lerArquivo(caminhoArquivo, this.getView());
    
    	this.getView().getLstSemOrdem().setText("");
	    this.setArrayArqLido(lista);
	    this.exibirListaDesordenada();
    }
    
    public void exibirListaDesordenada() {
    	for(Double lista : this.getArrayArqLido().getLista()) {
    		this.getView().getLstSemOrdem().append(String.valueOf(lista)+"\n");
    	}
    }
    
    public void exibirListaOrdenada() {
    	for(Double lista : this.getArrayArqLido().getLista()) {
    		this.getView().getLstOrdenados().append(String.valueOf(lista)+"\n");
    	}
    }
    
    public void exibirTempoExecucao() {
    	this.getView().getLblTempo().setText("");
    	this.getView().getLblTempo().setText(Long.toString(this.getTempexec()) + " ms");
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
