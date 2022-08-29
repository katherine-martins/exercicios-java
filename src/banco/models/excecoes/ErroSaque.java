package banco.models.excecoes;

public class ErroSaque extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ErroSaque(String mensagem) {
        super(mensagem);
    }
}
