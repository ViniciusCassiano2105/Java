package br.com.imperial_flix_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.logging.Logger;

import br.com.imperial_flix_cinema.Cinema;
import br.com.imperial_flix_filme.Filme;
import br.com.aula_poo.utils.Util;

public class Relatorio {
    private static Logger logger = Util.setupLogger();

    public static void gerarRelatorioCinemas(Map<Integer, Cinema> cinemas, String caminhoArquivo) {
        Path diretorio = Paths.get("temp");
        if (Files.notExists(diretorio)) {
            try {
                Files.createDirectory(diretorio);
                logger.info("Diretório 'temp' criado.");
            } catch (IOException e) {
                logger.severe("Erro ao criar o diretório 'temp': " + e.getMessage());
                return;
            }
        }

        Path arquivoRelatorio = Paths.get(caminhoArquivo);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoRelatorio.toFile(), true))) {
            if (cinemas != null && !cinemas.isEmpty()) { 
                writer.write("=========================\n");
                writer.write("         Cinemas\n");
                writer.write("=========================\n");

                for (Cinema cinema : cinemas.values()) {
                    writer.write("Nome: " + cinema.getNome() + "\n");
                    writer.write("Sala: " + cinema.getSala() + "\n");
                    writer.write("Horário: " + cinema.getHorario() + "\n");
                    writer.write("Valor: " + cinema.getValor() + "\n");
                    writer.write("\n");
                }
            } else {
                writer.write("Nenhum cinema cadastrado.\n");
            }

            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataHoraFormatada = agora.format(formatador);

            writer.write("=========Obrigado pela preferência=========\n");
            writer.write("\t    " + agora.format(formatador) + "\n");
           

        } catch (IOException e) {
            logger.severe("Erro ao gerar o relatório: " + e.getMessage());
        }
    }

    public static void gerarRelatorioFilmes(Map<Integer, Cinema> cinemas, Map<Integer, Filme> filmes, String caminhoArquivo) {
        Path diretorio = Paths.get("temp");
        if (Files.notExists(diretorio)) {
            try {
                Files.createDirectory(diretorio);
                logger.info("Diretório 'temp' criado.");
            } catch (IOException e) {
                logger.severe("Erro ao criar o diretório 'temp': " + e.getMessage());
                return;
            }
        }

        Path arquivoRelatorio = Paths.get(caminhoArquivo);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoRelatorio.toFile(), true))) {
            if (filmes != null && !filmes.isEmpty()) { 
                writer.write("=========================\n");
                writer.write(" Programação de Filmes\n");
                writer.write("=========================\n");

                for (Filme filme : filmes.values()) {
                    Cinema cinemaAssociado = cinemas.get(filme.getIdCinema());

                    writer.write("Nome: " + filme.getNome() + "\n");
                    writer.write("Gênero: " + filme.getGenero() + "\n");
                    writer.write("Duração: " + filme.getDuracao() + " minutos\n");
                    if (cinemaAssociado != null) {
                        writer.write("Exibido em: " + cinemaAssociado.getNome() + "\n");
                    } else {
                        writer.write("Exibido em: Cinema não encontrado\n");
                    }
                    writer.write("\n");
                }
            } else {
                writer.write("Nenhum filme cadastrado.\n");
            }

            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataHoraFormatada = agora.format(formatador);

            writer.write("=========Obrigado pela preferência=========\n");
            writer.write("\t    " + agora.format(formatador) + "\n");
            
        } catch (IOException e) {
            logger.severe("Erro ao gerar o relatório: " + e.getMessage());
        }
    }
}
