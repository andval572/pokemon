package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import java.io.File;


public class HelloController {


    Pokemon pokemon_1 = new Pokemon("JOLTEON","NIV 65",new File("src\\main\\java\\com\\example\\demo\\imagenes\\jolteon.gif"),"204/204",200,200);
    Pokemon pokemon_2 = new Pokemon("CHARIZARD","NIV 45",new File("src\\main\\java\\com\\example\\demo\\imagenes\\charmander1.gif"),"148/148",200,200);
    Pokemon pokemon_3 = new Pokemon("VAPOREON","NIV 54",new File("src\\main\\java\\com\\example\\demo\\imagenes\\vaporeon.gif"),"148/148",200,200);
    Pokemon pokemon_4 = new Pokemon("BLASTOISE","NIV 65",new File("src\\main\\java\\com\\example\\demo\\imagenes\\blastoise.gif"),"222/222",200,200);
    Pokemon pokemon_5 = new Pokemon("MEWTWO","NIV 75",new File("src\\main\\java\\com\\example\\demo\\imagenes\\mewtwo.gif") ,"298/298",200,200);
    Pokemon pokemon_6 = new Pokemon("BUTTERFREE","NIV 54",new File("src\\main\\java\\com\\example\\demo\\imagenes\\butterfree.gif"),"160/160",200,200);

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
    Button BOTON1;
    @FXML
    void ELPOKEMON1(MouseEvent event) {

    }

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

            Image image1 = new Image(pokemon_1.fotoPokemon.toURI().toString());
            POKEMON_1_IMG.setImage(image1);

            Image image2 = new Image(pokemon_2.fotoPokemon.toURI().toString());
            POKEMON_2_IMG.setImage(image2);

            Image image3 = new Image(pokemon_3.fotoPokemon.toURI().toString());
            POKEMON_3_IMG.setImage(image3);

            Image image4 = new Image(pokemon_4.fotoPokemon.toURI().toString());
            POKEMON_4_IMG.setImage(image4);

            Image image5 = new Image(pokemon_5.fotoPokemon.toURI().toString());
            POKEMON_5_IMG.setImage(image5);

            Image image6 = new Image(pokemon_6.fotoPokemon.toURI().toString());
            POKEMON_6_IMG.setImage(image6);

            POKEMON_1_VIDA.setProgress(pokemon_1.vidaRestantePokemon/pokemon_1.vidaPokemon);
            POKEMON_2_VIDA.setProgress(pokemon_2.vidaRestantePokemon/pokemon_2.vidaPokemon);
            POKEMON_3_VIDA.setProgress(pokemon_3.vidaRestantePokemon/pokemon_3.vidaPokemon);
            POKEMON_4_VIDA.setProgress(pokemon_4.vidaRestantePokemon/pokemon_4.vidaPokemon);
            POKEMON_5_VIDA.setProgress(pokemon_5.vidaRestantePokemon/pokemon_5.vidaPokemon);
            POKEMON_6_VIDA.setProgress(pokemon_6.vidaRestantePokemon/pokemon_6.vidaPokemon);

        }


    @FXML
    public void selectPokemon1(){
        System.out.println("imagen seleccionada");
        POKEMON_1.setStyle("-fx-background-color: #685175");
        POKEMON_2.setStyle("-fx-background-color: #7d6a87");
        POKEMON_3.setStyle("-fx-background-color: #7d6a87");
        POKEMON_4.setStyle("-fx-background-color: #7d6a87");
        POKEMON_5.setStyle("-fx-background-color: #7d6a87");
        POKEMON_6.setStyle("-fx-background-color: #7d6a87");
        BOTON1.setText("ELEGIR UN POKEMON");

        pokemonSeleccionado = pokemon_1;
    }
    @FXML
    public void selectPokemon2(){
        System.out.println("imagen seleccionada");
        boderPokemon2.setStyle("-fx-background-color: #685175");
        boderPokemon1.setStyle("-fx-background-color: #7d6a87");
        boderPokemon3.setStyle("-fx-background-color: #7d6a87");
        boderPokemon4.setStyle("-fx-background-color: #7d6a87");
        boderPokemon5.setStyle("-fx-background-color: #7d6a87");
        boderPokemon6.setStyle("-fx-background-color: #7d6a87");
        boton1.setText("SIGUIENTE");
        text1.setText("POKEMON ELEGIDO");
        pokemonSeleccionado = pokemon_2;
    }
    @FXML
    public void selectPokemon3(){
        System.out.println("imagen seleccionada");
        boderPokemon3.setStyle("-fx-background-color: #685175");
        boderPokemon2.setStyle("-fx-background-color: #7d6a87");
        boderPokemon1.setStyle("-fx-background-color: #7d6a87");
        boderPokemon4.setStyle("-fx-background-color: #7d6a87");
        boderPokemon5.setStyle("-fx-background-color: #7d6a87");
        boderPokemon6.setStyle("-fx-background-color: #7d6a87");
        boton1.setText("SIGUIENTE");
        text1.setText("POKEMON ELEGIDO");
        pokemonSeleccionado = pokemon_3;
    }
    @FXML
    public void selectPokemon4(){
        System.out.println("imagen seleccionada");
        boderPokemon4.setStyle("-fx-background-color: #685175");
        boderPokemon2.setStyle("-fx-background-color: #7d6a87");
        boderPokemon3.setStyle("-fx-background-color: #7d6a87");
        boderPokemon1.setStyle("-fx-background-color: #7d6a87");
        boderPokemon5.setStyle("-fx-background-color: #7d6a87");
        boderPokemon6.setStyle("-fx-background-color: #7d6a87");
        boton1.setText("SIGUIENTE");
        text1.setText("POKEMON ELEGIDO");
        pokemonSeleccionado = pokemon_4;
    }
    @FXML
    public void selectPokemon5(){
        System.out.println("imagen seleccionada");
        boderPokemon5.setStyle("-fx-background-color: #685175");
        boderPokemon2.setStyle("-fx-background-color: #7d6a87");
        boderPokemon3.setStyle("-fx-background-color: #7d6a87");
        boderPokemon4.setStyle("-fx-background-color: #7d6a87");
        boderPokemon1.setStyle("-fx-background-color: #7d6a87");
        boderPokemon6.setStyle("-fx-background-color: #7d6a87");
        boton1.setText("SIGUIENTE");
        text1.setText("POKEMON ELEGIDO");
        pokemonSeleccionado = pokemon_5;
    }
    @FXML
    public void selectPokemon6(){
        System.out.println("imagen seleccionada");
        boderPokemon6.setStyle("-fx-background-color: #685175");
        boderPokemon2.setStyle("-fx-background-color: #7d6a87");
        boderPokemon3.setStyle("-fx-background-color: #7d6a87");
        boderPokemon4.setStyle("-fx-background-color: #7d6a87");
        boderPokemon5.setStyle("-fx-background-color: #7d6a87");
        boderPokemon1.setStyle("-fx-background-color: #7d6a87");
        boton1.setText("SIGUIENTE");
        text1.setText("POKEMON ELEGIDO");
        pokemonSeleccionado = pokemon_6;
    }
}

class Pokemon {

    String nombrePokemon;
    String nivelPokemon;
    File fotoPokemon;
    String puntosPokemon;
    double vidaPokemon;
    double vidaRestantePokemon;


    public Pokemon(String nombrePokemon,String nivelPokemon,File fotoPokemon,String puntosPokemon,double vidaPokemon,double vidaRestantePokemon ){

        this.nombrePokemon=nombrePokemon;
        this.nivelPokemon=nivelPokemon;
        this.puntosPokemon=puntosPokemon;
        this.vidaPokemon=vidaPokemon;
        this.vidaRestantePokemon=vidaRestantePokemon;
        this.fotoPokemon=fotoPokemon;

    }
    }
