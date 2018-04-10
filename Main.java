public class Main {
    public static void main(String[] args) {
	FolhaPagamento fp = new FolhaPagamento(3,2014);

	Colaborador cl01 = new Colaborador(100, "Manoel Claudino", "Av 13 de Maio 2081", "88671020", "Benfica", "60020-060", "124543556-89", 4500.00);
	Colaborador cl02 = new Colaborador(200, "Carmelina da Silva", "Avenida dos Expedicionarios 1200", "3035-1280", "Aeroporto", "60530-020", "301789435-54", 2500.00);
	Colaborador cl03 = new Colaborador(300, "Gurmelina Castro Saraiva", "Av Joao Pessoa", "3235-1089","Damas", "60330-090", "350245632-76", 3000.00);

	MovimentoFolha mf01 = new MovimentoFolha(cl01, "Salario", 4500.00, 'P');
	MovimentoFolha mf02 = new MovimentoFolha(cl01, "Plano Saude", 1000.00, 'P');
	MovimentoFolha mf03 = new MovimentoFolha(cl01, "Pensão", 600.00, 'D');
	MovimentoFolha mf04 = new MovimentoFolha(cl02, "Salario", 2500.00, 'P');
	MovimentoFolha mf05 = new MovimentoFolha(cl02, "Gratificação", 1000.00, 'P');
	MovimentoFolha mf06 = new MovimentoFolha(cl02, "Faltas", 600, 'D');
	MovimentoFolha mf07 = new MovimentoFolha(cl03, "Salario", 4500.00, 'P');
	MovimentoFolha mf08 = new MovimentoFolha(cl03, "Plano Saude", 1000.00, 'P');
	MovimentoFolha mf09 = new MovimentoFolha(cl03, "Pensão", 600, 'D');

	fp.inserirOcorrencias(mf01);
	fp.inserirOcorrencias(mf02);
	fp.inserirOcorrencias(mf03);
	fp.inserirOcorrencias(mf04);
	fp.inserirOcorrencias(mf05);
	fp.inserirOcorrencias(mf06);
	fp.inserirOcorrencias(mf07);
	fp.inserirOcorrencias(mf08);
	fp.inserirOcorrencias(mf09);

	System.out.println(fp.calcularFolha());
	}
}