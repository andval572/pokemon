package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.io.File;


public class HelloController {


    Pokemon pokemon_1 = new Pokemon("JOLTEON","NIV 65","src\\main\\com\\example\\demo\\imagenes\\jolteon.gif","204/204",200,200);
    Pokemon pokemon_2 = new Pokemon("CHARIZARD","NIV 45","src\\main\\com\\example\\demo\\imagenes\\charizard(1).gif","148/148",200,200);
    Pokemon pokemon_3 = new Pokemon("VAPOREON","NIV 54","src\\main\\com\\example\\demo\\imagenes\\vaporeon.gif","148/148",200,200);
    Pokemon pokemon_4 = new Pokemon("BLASTOISE","NIV 65","src\\main\\com\\example\\demo\\imagenes\\blastoise.gif","222/222",200,200);
    Pokemon pokemon_5 = new Pokemon("MEWTWO","NIV 75","src\\main\\com\\example\\demo\\imagenes\\mewtwo.gif","298/298",200,200);
    Pokemon pokemon_6 = new Pokemon("BUTTERFREE","NIV 54","src\\main\\com\\example\\demo\\imagenes\\butterfree.gif","160/160",200,200);

    @FXML
    Label POKEMON_1_NOM;
    @FXML
    Label POKEMON_1_NIV;
    @FXML
    Label POKEMON_1_PUNTOS;
    @FXML
    Label POKEMON_2_NOM;
    @FXML
    Label POKEMON_2_NIV;
    @FXML
    Label POKEMON_2_PUNTOS;
    @FXML
    Label POKEMON_3_NOM;
    @FXML
    Label POKEMON_3_NIV;
    @FXML
    Label POKEMON_3_PUNTOS;
    @FXML
    Label POKEMON_4_NOM;
    @FXML
    Label POKEMON_4_NIV;
    @FXML
    Label POKEMON_4_PUNTOS;
    @FXML
    Label POKEMON_5_NOM;
    @FXML
    Label POKEMON_5_NIV;
    @FXML
    Label POKEMON_5_PUNTOS;
    @FXML
    Label POKEMON_6_NOM;
    @FXML
    Label POKEMON_6_NIV;
    @FXML
    Label POKEMON_6_PUNTOS;
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
            POKEMON_1_NIV.setText(pokemon_1.nivelPokemon);
            POKEMON_1_PUNTOS.setText(pokemon_1.puntosPokemon);
            POKEMON_2_NOM.setText(pokemon_2.nombrePokemon);
            POKEMON_2_NIV.setText(pokemon_2.nivelPokemon);
            POKEMON_2_PUNTOS.setText(pokemon_2.puntosPokemon);
            POKEMON_3_NOM.setText(pokemon_3.nombrePokemon);
            POKEMON_3_NIV.setText(pokemon_3.nivelPokemon);
            POKEMON_3_PUNTOS.setText(pokemon_3.puntosPokemon);
            POKEMON_4_NOM.setText(pokemon_4.nombrePokemon);
            POKEMON_4_NIV.setText(pokemon_4.nivelPokemon);
            POKEMON_4_PUNTOS.setText(pokemon_4.puntosPokemon);
            POKEMON_5_NOM.setText(pokemon_5.nombrePokemon);
            POKEMON_5_NIV.setText(pokemon_5.nivelPokemon);
            POKEMON_5_PUNTOS.setText(pokemon_5.puntosPokemon);
            POKEMON_6_NOM.setText(pokemon_6.nombrePokemon);
            POKEMON_6_NIV.setText(pokemon_6.nivelPokemon);
            POKEMON_6_PUNTOS.setText(pokemon_6.puntosPokemon);

            POKEMON_1_IMG.setImage(pokemon_1.fotoPokemon);
            POKEMON_2_IMG.setImage(pokemon_2.fotoPokemon);
            POKEMON_3_IMG.setImage(pokemon_3.fotoPokemon);
            POKEMON_4_IMG.setImage(pokemon_4.fotoPokemon);
            POKEMON_5_IMG.setImage(pokemon_5.fotoPokemon);
            POKEMON_6_IMG.setImage(pokemon_6.fotoPokemon);

            POKEMON_1_VIDA.setProgress(pokemon_1.vidaRestantePokemon/pokemon_1.vidaPokemon);
            POKEMON_2_VIDA.setProgress(pokemon_2.vidaRestantePokemon/pokemon_2.vidaPokemon);
            POKEMON_3_VIDA.setProgress(pokemon_3.vidaRestantePokemon/pokemon_3.vidaPokemon);
            POKEMON_4_VIDA.setProgress(pokemon_4.vidaRestantePokemon/pokemon_4.vidaPokemon);
            POKEMON_5_VIDA.setProgress(pokemon_5.vidaRestantePokemon/pokemon_5.vidaPokemon);
            POKEMON_6_VIDA.setProgress(pokemon_6.vidaRestantePokemon/pokemon_6.vidaPokemon);
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
    Image fotoPokemon;
    String puntosPokemon;
    double vidaPokemon;
    double vidaRestantePokemon;


    public Pokemon(String nombrePokemon,String nivelPokemon,String fotoPokemon,String puntosPokemon,double vidaPokemon,double vidaRestantePokemon ){

        this.nombrePokemon=nombrePokemon;
        this.nivelPokemon=nivelPokemon;
        this.puntosPokemon=puntosPokemon;
        this.vidaPokemon=vidaPokemon;
        this.vidaRestantePokemon=vidaRestantePokemon;
        File f = new File(fotoPokemon);
        Image i = new Image(f.toURI().toString());
        this.fotoPokemon = i;
    }
    }
