class Colaborador {
	private int codigo;
	private String nome;
	private String endereco;
	private String telefone;
	private String bairro;
	private String cep;
	private String cpf;
	private double salarioAnual;

	public Colaborador( int codigo, String nome, String endereco, String telefone, String bairro, String cep, String cpf, double salarioAnual ) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.bairro = bairro;
		this.cep = cep;
		this.cpf = cpf;
		this.salarioAnual = salarioAnual;
	}
	public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
	public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro(){
        return bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCep(){
        return cep;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    public double getSalarioAnual(){
        return salarioAnual;
    }
}