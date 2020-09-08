Programa feito para buscar os dados do desafio 7 da maratona behind the code 2020 e montar o data frame em formato csv.

No projeto existem 2 classes main, uma para buscar os dados pelo protocolo mqtt e salvar os dados em formato json e outra classe main para ler esses dados e montar o data frame em formato csv.

**A parte de consulta dos dados por MQTT foi feita com base no tutorial do Paulo Collares, eu apenas modifiquei para salvar os dados.**
https://www.paulocollares.com.br/programacao/exemplo-de-mqtt-com-java/

1º Precisa deixar rodando o Main do pacote mqtt, depois de um tempo quando você achar que esta com dados o suficiente pode para a execução.

![Alt text](main_mqtt.jpg?raw=true)

2º Rodar a classe Main do pacote csv.

![Alt text](main_csv.jpg?raw=true)

3º Quando aparecer no console "Pronto" é só procurar na pasta dataframe do projeto

![Alt text](dataframe.jpg?raw=true)
