package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.io.File;

public class HelloController {

    int contador=0;

    Pokemon pokemon_1 = new Pokemon("jolteon","Niv 65",new File("src\\main\\resources\\imagenes\\jolteon.gif"),200,"204/204",200);
    Pokemon pokemon_2 = new Pokemon("charizard","Niv 45",new File("src\\main\\resources\\imagenes\\charizard(1).gif"),200,"148/148",200);
    Pokemon pokemon_3 = new Pokemon("vaporeon","Niv 54",new File("src\\main\\resources\\imagenes\\vaporeon.gif"),200,"148/148",200);
    Pokemon pokemon_4 = new Pokemon("blastoise","Niv 65",new File("src\\main\\resources\\imagenes\\blastoise.gif"),200,"222/222",200);
    Pokemon pokemon_5 = new Pokemon("mewteo","Niv 75",new File("src\\main\\resources\\imagenes\\mewtwo.gif"),200,"298/298",200);
    Pokemon pokemon_6 = new Pokemon("butterfree","Niv 54",new File("src\\main\\resources\\imagenes\\butterfree.gif"),200,"160/160",200);

    @FXML
    TextArea POKEMON_1_NOM;
    @FXML
    TextArea POKEMON_1_Niv;
    @FXML
    TextArea POKEMON_1_PUNTOS;
    @FXML
    TextArea POKEMON_2_NOM;
    @FXML
    TextArea POKEMON_2_Niv;
    @FXML
    TextArea POKEMON_2_PUNTOS;
    @FXML
    TextArea POKEMON_3_NOM;
    @FXML
    TextArea POKEMON_3_Niv;
    @FXML
    TextArea POKEMON_3_PUNTOS;
    @FXML
    TextArea POKEMON_4_NOM;
    @FXML
    TextArea POKEMON_4_Niv;
    @FXML
    TextArea POKEMON_4_PUNTOS;
    @FXML
    TextArea POKEMON_5_NOM;
    @FXML
    TextArea POKEMON_5_Niv;
    @FXML
    TextArea POKEMON_5_PUNTOS;
    @FXML
    TextArea POKEMON_6_NOM;
    @FXML
    TextArea POKEMON_6_Niv;
    @FXML
    TextArea POKEMON_6_PUNTOS;
    @FXML
    ImageView POKEMON_1_IMG;
    @FXML
    ImageView POKEMON_2_IMG;
    @FXML
    ImageView POKEMON_3_IMG;
    @FXML
    ImageView POKEMON_4_IMG;
    @FXML
    ImageView POKEMON_5_IMG;
    @FXML
    ImageView POKEMON_6_IMG;
    @FXML
    ProgressBar POKEMON_1_VIDA;
    @FXML
    ProgressBar POKEMON_2_VIDA;
    @FXML
    ProgressBar POKEMON_3_VIDA;
    @FXML
    ProgressBar POKEMON_4_VIDA;
    @FXML
    ProgressBar POKEMON_5_VIDA;
    @FXML
    ProgressBar POKEMON_6_VIDA;
    @FXML
    VBox POKEMON_1;
    @FXML
    VBox POKEMON_2;
    @FXML
    VBox POKEMON_3;
    @FXML
    VBox POKEMON_4;
    @FXML
    VBox POKEMON_5;
    @FXML
    VBox POKEMON_6;


    @FXML

        public void initialize() {
            POKEMON_1_NOM.setText(pokemon_1.nombrePokemon);
            POKEMON_1_Niv.setText(""+pokemon_1.nivelPokemon);
            POKEMON_1_PUNTOS.setText(""+pokemon_1.puntosPokemon);
            POKEMON_2_NOM.setText(pokemon_2.nombrePokemon);
            POKEMON_2_Niv.setText(""+pokemon_2.nivelPokemon);
            POKEMON_2_PUNTOS.setText(""+pokemon_2.puntosPokemon);
            POKEMON_3_NOM.setText(pokemon_3.nombrePokemon);
            POKEMON_3_Niv.setText(""+pokemon_3.nivelPokemon);
            POKEMON_3_PUNTOS.setText(""+pokemon_3.puntosPokemon);
            POKEMON_4_NOM.setText(pokemon_4.nombrePokemon);
            POKEMON_4_Niv.setText(""+pokemon_4.nivelPokemon);
            POKEMON_4_PUNTOS.setText(""+pokemon_4.puntosPokemon);
            POKEMON_5_NOM.setText(pokemon_5.nombrePokemon);
            POKEMON_5_Niv.setText(""+pokemon_5.nivelPokemon);
            POKEMON_5_PUNTOS.setText(""+pokemon_5.puntosPokemon);
            POKEMON_6_NOM.setText(pokemon_6.nombrePokemon);
            POKEMON_6_Niv.setText(""+pokemon_6.nivelPokemon);
            POKEMON_6_PUNTOS.setText(""+pokemon_6.puntosPokemon);

            Image POKEMON1 = new Image(pokemon_1.fotoPokemon.toURI().toString());
            POKEMON_1_IMG.setImage(POKEMON1);
            Image POKEMON2 = new Image(pokemon_2.fotoPokemon.toURI().toString());
            POKEMON_2_IMG.setImage(POKEMON2);
            Image POKEMON3 = new Image(pokemon_3.fotoPokemon.toURI().toString());
            POKEMON_2_IMG.setImage(POKEMON3);
            Image POKEMON4 = new Image(pokemon_4.fotoPokemon.toURI().toString());
            POKEMON_2_IMG.setImage(POKEMON4);
            Image POKEMON5 = new Image(pokemon_5.fotoPokemon.toURI().toString());
            POKEMON_2_IMG.setImage(POKEMON5);
            Image POKEMON6 = new Image(pokemon_6.fotoPokemon.toURI().toString());
            POKEMON_2_IMG.setImage(POKEMON6);

            POKEMON_1_VIDA.setProgress(pokemon_1.vidaRestantePokemon/pokemon_1.vidaPokemon);
            POKEMON_2_VIDA.setProgress(pokemon_2.vidaRestantePokemon/pokemon_2.vidaPokemon);
            POKEMON_3_VIDA.setProgress(pokemon_3.vidaRestantePokemon/pokemon_3.vidaPokemon);
            POKEMON_4_VIDA.setProgress(pokemon_4.vidaRestantePokemon/pokemon_4.vidaPokemon);
            POKEMON_5_VIDA.setProgress(pokemon_5.vidaRestantePokemon/pokemon_5.vidaPokemon);
            POKEMON_6_VIDA.setProgress(pokemon_6.vidaRestantePokemon/pokemon_6.vidaPokemon);
        }
    @FXML
    private void clickear1() {
        System.out.println("anchor pulsado");
        POKEMON_1.setStyle("-fx-background-color:#675073");
        POKEMON_2.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_3.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_4.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_5.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_6.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_1_IMG.setStyle("-fx-opacity:1");
        POKEMON_2_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_3_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_4_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_5_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_6_IMG.setStyle("-fx-opacity:0.5");
        contador=1;
    }
    @FXML
    private void clickear2() {
        System.out.println("anchor pulsado");
        POKEMON_2.setStyle("-fx-background-color:#675073");
        POKEMON_1.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_3.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_4.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_5.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_6.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_2_IMG.setStyle("-fx-opacity:1");
        POKEMON_1_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_3_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_4_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_5_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_6_IMG.setStyle("-fx-opacity:0.5");
        contador=1;
    }
    @FXML
    private void clickear3() {
        System.out.println("anchor pulsado");
        POKEMON_3.setStyle("-fx-background-color:#675073");
        POKEMON_2.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_1.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_4.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_5.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_6.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_3_IMG.setStyle("-fx-opacity:1");
        POKEMON_2_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_1_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_4_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_5_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_6_IMG.setStyle("-fx-opacity:0.5");
        contador=1;
    }
    @FXML
    private void clickear4() {
        System.out.println("anchor pulsado");
        POKEMON_4.setStyle("-fx-background-color:#675073");
        POKEMON_2.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_3.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_1.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_5.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_6.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_4_IMG.setStyle("-fx-opacity:1");
        POKEMON_2_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_3_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_1_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_5_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_6_IMG.setStyle("-fx-opacity:0.5");
        contador=1;
    }
    @FXML
    private void clickear5() {
        System.out.println("anchor pulsado");
        POKEMON_5.setStyle("-fx-background-color:#675073");
        POKEMON_2.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_3.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_4.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_1.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_6.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_5_IMG.setStyle("-fx-opacity:1");
        POKEMON_2_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_3_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_4_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_1_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_6_IMG.setStyle("-fx-opacity:0.5");
        contador=1;
    }
    @FXML
    private void clickear6() {
        System.out.println("anchor pulsado");
        POKEMON_6.setStyle("-fx-background-color:#675073");
        POKEMON_2.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_3.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_4.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_5.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_1.setStyle("-fx-background-color: #7D6A87;");
        POKEMON_6_IMG.setStyle("-fx-opacity:1");
        POKEMON_2_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_3_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_4_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_5_IMG.setStyle("-fx-opacity:0.5");
        POKEMON_1_IMG.setStyle("-fx-opacity:0.5");
        contador=1;
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

class Pokemon {

    String nombrePokemon;
    String nivelPokemon;
    File fotoPokemon;
    float vidaPokemon;
    String puntosPokemon;
    float vidaRestantePokemon;


    public Pokemon(String nombrePokemon, String nivelPokemon, File fotoPokemon, Integer vidaPokemon, String puntosPokemon, float vidaRestantePokemon ){

        this.nombrePokemon=nombrePokemon;
        this.nivelPokemon=nivelPokemon;
        this.fotoPokemon=fotoPokemon;
        this.vidaPokemon=vidaPokemon;
        this.puntosPokemon=puntosPokemon;
        this.vidaRestantePokemon=vidaRestantePokemon;
    }
}