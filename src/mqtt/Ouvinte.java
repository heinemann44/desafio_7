package mqtt;

import java.io.FileWriter;

import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Ouvinte implements IMqttMessageListener {

	private String diretorioJsons;

	public Ouvinte(ClienteMQTT clienteMQTT, String topico, int qos) {
		String diretorioProjeto = System.getProperty("user.dir");
		this.diretorioJsons = diretorioProjeto + "\\jsons";

		clienteMQTT.subscribe(qos, this, topico);
	}

	@Override
	public void messageArrived(String topico, MqttMessage mm) throws Exception {
		String mensagem = new String(mm.getPayload());

		System.out.println("Mensagem recebida:");
		System.out.println("\tTópico: " + topico);
		System.out.println("\tMensagem: " + mensagem);
		System.out.println("");

		this.salvarArquivoJson(mensagem);
	}

	private void salvarArquivoJson(String mensagem) throws Exception {
		String nomeArquivo = this.getNomeArquivo(mensagem);

		FileWriter writer = new FileWriter(this.diretorioJsons + "\\" + nomeArquivo + ".json");
		writer.write(mensagem);
		writer.close();
	}

	private String getNomeArquivo(String mensagem) {
		int idValueRow = mensagem.lastIndexOf(":") + 2;
		int idTotalMessage = mensagem.length() - 1;
		return mensagem.substring(idValueRow, idTotalMessage);
	}

}