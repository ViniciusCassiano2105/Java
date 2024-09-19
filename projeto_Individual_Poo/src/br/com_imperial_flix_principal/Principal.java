package br.com_imperial_flix_principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import br.com.imperial_flix_cinema.Cinema;
import br.com.imperial_flix_filme.Filme;
import br.com.imperial_flix_io.LeitorArquivo;
import br.com.imperial_flix_io.Relatorio;
import br.com.imperial_flix_mensagem.Mensagem;

public class Principal {

    private static final Logger logger = setupLogger();  
    private static final String RELATORIO_FILE_FILMES = "temp/relatorio_filmes.txt";  
    private static final String RELATORIO_FILE_CINEMAS = "temp/relatorio_cinemas.txt";  
    
    public void menu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        exibirBoasVindas(scanner);

        while (continuar) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> exibirRelatorios(scanner);
                case 2 -> gerarRelatorios(scanner);  // Correção: Agora chama o método correto para cada tipo de relatório
                case 3 -> continuar = confirmarSaida(scanner);
                default -> logger.info(Mensagem.OPCAO_INVALIDA);
            }
        }
        scanner.close();
    }

    private void exibirBoasVindas(Scanner scanner) throws InterruptedException {
        logger.info(Mensagem.LOGO);
        Thread.sleep(2000);
        logger.info(Mensagem.BEM_VINDO);
        logger.info(Mensagem.PERGUNTA_NOME);
        String nome = scanner.next();
        logger.info(Mensagem.AGUARDE);
        Thread.sleep(2000);
        logger.info(String.format(Mensagem.OLA, nome));
    }

    private void exibirMenu() {
        logger.info(Mensagem.ESCOLHAEXIBIR);
        logger.info(Mensagem.ESCOLHAGERAR);
        logger.info(Mensagem.SAIR);
    }

    private void exibirRelatorios(Scanner scanner) throws InterruptedException {
        logger.info(Mensagem.ESCOLHAOPCAOEXIBIR);
        logger.info(Mensagem.EXIBIR_RELATORIO_FILMES);
        logger.info(Mensagem.EXIBIR_RELATORIO_CINEMA);
        int opcao = scanner.nextInt();

        if (opcao == 4) {
            logger.info(Mensagem.EXIBINDO_RELATORIO_FILMES);
            logger.info(Mensagem.AGUARDE);
            Thread.sleep(2000);
            exibirRelatorioFilme();
        } else if (opcao == 5) {
            logger.info(Mensagem.EXIBINDO_RELATORIO_CINEMA);
            logger.info(Mensagem.AGUARDE);
            Thread.sleep(2000);
            exibirRelatorioCinema();
        } else {
            logger.info(Mensagem.OPCAO_INVALIDA);
        }
    }

    private void gerarRelatorios(Scanner scanner) throws InterruptedException {
        logger.info(Mensagem.ESCOLHAOPCAOGERAR);
        logger.info(Mensagem.GERAR_RELATORIO_FILMES);
        logger.info(Mensagem.GERAR_RELATORIO_CINEMA);
        int opcao = scanner.nextInt();

        if (opcao == 4) {
            logger.info(Mensagem.GERANDO_RELATORIO_FILMES);
            logger.info(Mensagem.AGUARDE);
            Thread.sleep(2000);
            // Correção: Usando o método correto para gerar o relatório de filmes
            Relatorio.gerarRelatorioFilmes(LeitorArquivo.getMapCinemas(), LeitorArquivo.getMapFilmes(), RELATORIO_FILE_FILMES);
            exibirRelatorio(RELATORIO_FILE_FILMES);
        } else if (opcao == 5) {
            logger.info(Mensagem.GERANDO_RELATORIO_CINEMA);
            logger.info(Mensagem.AGUARDE);
            Thread.sleep(2000);
            // Correção: Usando o método correto para gerar o relatório de cinemas
            Relatorio.gerarRelatorioCinemas(LeitorArquivo.getMapCinemas(), RELATORIO_FILE_CINEMAS);
            exibirRelatorio(RELATORIO_FILE_CINEMAS);
        } else {
            logger.info(Mensagem.OPCAO_INVALIDA);
        }
    }

    private void exibirRelatorioFilme() {
        for (Filme filme : LeitorArquivo.getMapFilmes().values()) {
            Cinema cinemaAssociado = LeitorArquivo.getMapCinemas().get(filme.getIdCinema());

            if (cinemaAssociado != null) {
                logger.info(String.format("Filme: %s -> Gênero: %s -> Duração: %d minutos -> Exibido em: %s",
                        filme.getNome(), filme.getGenero(), filme.getDuracao(), cinemaAssociado.getNome()));
            } else {
                logger.info(String.format("Filme: %s -> Gênero: %s -> Duração: %d minutos -> Cinema não encontrado",
                        filme.getNome(), filme.getGenero(), filme.getDuracao()));
            }
        }
    }

    private void exibirRelatorioCinema() {
        for (Cinema cinema : LeitorArquivo.getMapCinemas().values()) {
            logger.info(cinema.toString());
        }
    }

    private void exibirRelatorio(String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);
        if (arquivo.exists()) {
            try (Scanner scanner = new Scanner(arquivo)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                logger.severe("Erro ao ler o arquivo: " + e.getMessage());
            }
        } else {
            logger.severe("O arquivo de relatório não foi encontrado.");
        }
    }

    private boolean confirmarSaida(Scanner scanner) throws InterruptedException {
        logger.info(Mensagem.DESEJASAIR);
        String selecao = scanner.next();

        if (selecao.equalsIgnoreCase("S")) {
            logger.info(Mensagem.OBRIGADOVISITA);
            return false;
        } else {
            logger.info(Mensagem.OPCAO_VOLTANDO_MENU);
            return true;
        }
    }

    private static Logger setupLogger() {
        Logger logger = Logger.getLogger(Principal.class.getName());
        logger.setUseParentHandlers(false);

        ConsoleHandler customHandler = new ConsoleHandler();
        customHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord rec) {
                return rec.getMessage() + "\n";
            }
        });

        logger.addHandler(customHandler);
        return logger;
    }
}
