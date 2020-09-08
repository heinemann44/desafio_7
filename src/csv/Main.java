package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {

		criarDataFrame();

		int totalFiles = 17100;
		int count = 1;

		while (count <= totalFiles) {
			PontoDeVenda pontoDeVenda = jsonToJava(Integer.toString(count));
			count++;

			if (pontoDeVenda == null) {
				continue;
			}

			writeLine(pontoDeVenda);
		}

		System.out.println("Pronto");

	}

	public static void criarDataFrame() {
		String diretorioProjeto = System.getProperty("user.dir");
		String diretorioDataFrame = diretorioProjeto + "\\dataframe";

		try {
			new File(diretorioDataFrame + "\\dataframe.csv");

			FileWriter arquivoEscrita = new FileWriter(diretorioDataFrame + "\\dataframe.csv", false);
			arquivoEscrita.write(
					"Tempo,Estação,LAT,LONG,Movimentação,Original_473,Original_269,Zero,Maçã-Verde,Tangerina,Citrus,Açaí-Guaraná,Pêssego,TARGET");
			arquivoEscrita.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static PontoDeVenda jsonToJava(String fileName) {
		String diretorioProjeto = System.getProperty("user.dir");
		String diretorioJsons = diretorioProjeto + "\\jsons";

		try {
			Gson gson = new Gson();
			Path path = Paths.get(diretorioJsons + "\\" + fileName + ".json");

			// Java 8
			BufferedReader reader = Files.newBufferedReader(path);

			return gson.fromJson(reader.readLine(), PontoDeVenda.class);

		} catch (IOException e) {
			return null;
		}

	}

	public static void writeLine(PontoDeVenda pontoDeVenda) {
		String diretorioProjeto = System.getProperty("user.dir");
		String diretorioDataFrame = diretorioProjeto + "\\dataframe";

		try {
			FileWriter myWriter2 = new FileWriter(diretorioDataFrame + "\\dataframe.csv", true);
			BufferedWriter bw = new BufferedWriter(myWriter2);
			bw.newLine();
			// Tempo,Estação,LAT,LONG,Movimentação,Original_473,Original_269,Zero,Maçã-Verde,Tangerina,Citrus,Açaí-Guaraná,Pêssego,TARGET
			bw.write(pontoDeVenda.getTempo());
			bw.write(",");

			bw.write(pontoDeVenda.getEstacao());
			bw.write(",");

			bw.write(pontoDeVenda.getLatitude());
			bw.write(",");

			bw.write(pontoDeVenda.getLongitude());
			bw.write(",");

			bw.write(pontoDeVenda.getMovimentacao());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadeOriginal473());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadeOriginal268());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadeZero());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadeMacaVerde());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadeTangerina());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadeCitrus());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadeAcaiGuarana());
			bw.write(",");

			bw.write(pontoDeVenda.getQuantidadePessego());
			bw.write(",");

			bw.write(pontoDeVenda.getTarget());

			bw.close();
		} catch (IOException e) {
		}

	}
}
