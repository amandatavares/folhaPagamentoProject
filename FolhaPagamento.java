import java.util.ArrayList;

public class FolhaPagamento
{
    private int mes;
    private int ano;    
    private ArrayList<MovimentoFolha> movimentos;

    public FolhaPagamento(int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        movimentos = new ArrayList();
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getMes(){
        return mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }
    public String calcularFolha() {
        double proventos = 0.0;
        double descontos = 0.0;
        double receber = 0.0;
        for (int i=0; i < movimentos.size(); i++) {
            if (movimentos.get(i).getTipoMovimento() == 'P') {
                proventos += movimentos.get(i).getValor();           
            }
            else if (movimentos.get(i).getTipoMovimento() == 'D') {
                descontos += movimentos.get(i).getValor();
            }        
        }
        receber = proventos - descontos;         
        return "Total de proventos = " + proventos + "\nTotal de descontos = " + descontos + "\nValor a receber = " + receber;   
    }
    public void inserirOcorrencias(MovimentoFolha movimento) {
        movimentos.add(movimento);
    }
}
