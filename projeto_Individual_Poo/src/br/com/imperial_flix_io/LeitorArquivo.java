package br.com.imperial_flix_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import br.com.imperial_flix_cinema.Cinema;
import br.com.imperial_flix_filme.Filme;

public class LeitorArquivo {
    private static Map<Integer, Cinema> mapCinemas = new HashMap<>();
    private static Map<Integer, Filme> mapFilmes = new HashMap<>();
    private static Logger logger = Logger.getLogger(LeitorArquivo.class.getName());

    public static void leitor(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader("./temp/" + path + ".txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                if (dados[0].equalsIgnoreCase("Cinema")) {
                    Cinema cinema = new Cinema(
                            Integer.parseInt(dados[1]), Integer.parseInt(dados[3]), Double.parseDouble(dados[5]), dados[2], dados[4]);
                    mapCinemas.put(cinema.getIdcinema(), cinema);
                } else if (dados[0].equalsIgnoreCase("Filme")) {
                    Filme filme = new Filme(
                            Integer.parseInt(dados[1]), dados[2], dados[3], Integer.parseInt(dados[4]), Integer.parseInt(dados[5]));
                    mapFilmes.put(filme.getIdFilme(), filme);
                }
            }
        } catch (IOException e) {
            logger.severe("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static Map<Integer, Cinema> getMapCinemas() {
        return mapCinemas;
    }

    public static Map<Integer, Filme> getMapFilmes() {
        return mapFilmes;
    }
}
