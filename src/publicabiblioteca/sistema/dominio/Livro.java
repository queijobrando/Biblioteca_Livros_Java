package publicabiblioteca.sistema.dominio;

public class Livro {
    private String nomeLivro;
    private int anoLancamentoLivro;
    private String sinopseLivro;
    private String nomeAutor;
    private String sobreAutor;

    //construtor
    public Livro(String criarNovoLivro) {
        this.setNomeLivro(criarNovoLivro);
    }

    public String getNomeLivro(){
        return nomeLivro;
    }

    public String getSinopseLivro(){
        return sinopseLivro;
    }

    public int getAnoLancamentoLivro(){
        return anoLancamentoLivro;
    }

    public String getNomeAutor() {
        if (nomeAutor == null || nomeAutor.isEmpty()) {
            return "Desconhecido";
        } else {
            return nomeAutor;
        }
    }

    public String getSobreAutor() {
        return sobreAutor;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setAnoLancamentoLivro(int anoLancamentoLivro) {
        this.anoLancamentoLivro = anoLancamentoLivro;
    }

    public void setSinopseLivro(String sinopseLivro) {
        this.sinopseLivro = sinopseLivro;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setSobreAutor(String sobreAutor) {
        this.sobreAutor = sobreAutor;
    }
}


