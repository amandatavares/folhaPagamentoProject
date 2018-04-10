class MovimentoFolha {
	private String descricao;
	private double valor;
	private char tipoMovimento;	
	//private Colaborador colaborador;

	public MovimentoFolha(Colaborador colaborador, String descricao, double valor, char tipoMovimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.tipoMovimento = tipoMovimento;
	}

	// gets and sets
	public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setTipoMovimento(char tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }
    public char getTipoMovimento(){
        return tipoMovimento;
    }
}