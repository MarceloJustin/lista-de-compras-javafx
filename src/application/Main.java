package application;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private ArrayList<String> listaDeCompras = new ArrayList<>();
	private ListView<String> listaVisualizavel = new ListView<>();

	@Override
	public void start(Stage palco) {
		palco.setTitle("Aplicativo de Lista de Compras");

		TextField descricaoDoItem = new TextField();
		Button botaoAdicionar = new Button("Adicionar");
		Button botaoExportar = new Button("Exportar Lista");

		Label labelAdicionar = new Label("Digire um item que deseja adiconar");
		Label labelListaDeCompras = new Label("Lista de Compras:");

		// Criação do objeto ObservableList a partir da listaDeCompras.
		ObservableList<String> observableListaDeCompras = FXCollections.observableArrayList(listaDeCompras);
		listaVisualizavel.setItems(observableListaDeCompras);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(labelAdicionar, descricaoDoItem, botaoAdicionar);
		vBox.getChildren().addAll(labelListaDeCompras, listaVisualizavel, botaoExportar);
		vBox.setSpacing(10); // Espaçamento vertical entre os componentes.
		vBox.setPadding(new Insets(10)); // Margens internas (espaçamento) para o VBox.

		botaoAdicionar.setOnAction(e -> {
			String item = descricaoDoItem.getText(); // obtem o texto digitado e armazana na varial item.
			if (!item.isEmpty()) { // Entra o 'if' se o texto não está vazio (ou seja, se o usuário digitou algo).
				listaDeCompras.add(item); // O texto digitado é adicionado à lista de compras.
				listaVisualizavel.getItems().add(item); // Adicionamo o texto à listaVisualizavel.
				descricaoDoItem.clear(); // O campo de texto é limpo, removendo o texto adicionado.
			}
		});

		botaoExportar.setOnAction(e -> {
			try {
				File arquivo = new File("listaDeCompras.txt");
				PrintWriter writer = new PrintWriter(arquivo); // O PrintWriter é usado para gravar os itens da lista no arquivo.
				for (String item : listaDeCompras) {
					writer.println(item);
				}
				writer.close();
			} catch (Exception ex) {
				System.out.println("Erro ocorrido: " + ex.getMessage());
			}
		});

		Scene cena = new Scene(vBox, 350, 300);
		palco.setScene(cena);
		palco.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
