
package exercicioordenacao.Model;

import exercicioordenacao.Presenter.OrdenaPresenter;
import exercicioordenacao.View.View;
import java.io.FileNotFoundException;

import java.util.Scanner;
public class ReadArquivo {
    private Collection listaDouble;
    private OrdenaPresenter presenter;
    
    public ReadArquivo(OrdenaPresenter presenter){
        this.presenter= presenter;
    }
    public Collection lerArquivo(String caminhoArq, View view){
        this.listaDouble = new Collection();
        return listaDouble;
    }
}
