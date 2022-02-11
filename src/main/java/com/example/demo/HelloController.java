package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class HelloController {

    Pokemon pokemonSeleccionado;

    ArrayList<Pokemon> ListaPokemon = new ArrayList<>();
    Pokemon pokemon_1 = new Pokemon(0,"JOLTEON","NIV 65",new File("src\\main\\java\\com\\example\\demo\\imagenes\\jolteon.gif"),"204/204","ELECTRICO",200,200);
    Pokemon pokemon_2 = new Pokemon(1,"CHARIZARD","NIV 45",new File("src\\main\\java\\com\\example\\demo\\imagenes\\charmander1.gif"),"148/148","FUEGO",200,200);
    Pokemon pokemon_3 = new Pokemon(2,"VAPOREON","NIV 54",new File("src\\main\\java\\com\\example\\demo\\imagenes\\vaporeon.gif"),"148/148","AGUA",200,200);
    Pokemon pokemon_4 = new Pokemon(3,"BLASTOISE","NIV 65",new File("src\\main\\java\\com\\example\\demo\\imagenes\\blastoise.gif"),"222/222","AGUA",200,200);
    Pokemon pokemon_5 = new Pokemon(4,"MEWTWO","NIV 75",new File("src\\main\\java\\com\\example\\demo\\imagenes\\mewtwo.gif") ,"298/298","SITICO",200,200);
    Pokemon pokemon_6 = new Pokemon(5,"BUTTERFREE","NIV 54",new File("src\\main\\java\\com\\example\\demo\\imagenes\\butterfree.gif"),"160/160","SITICO",200,200);

    @FXML
    Label POKEMON_1_NOM;
    @FXML
    Label POKEMON_1_NIV;
    @FXML
    Label POKEMON_1_PUNTOS;
    @FXML
    Label POKEMON_1_TIPO;
    @FXML
    Label POKEMON_2_NOM;
    @FXML
    Label POKEMON_2_NIV;
    @FXML
    Label POKEMON_2_PUNTOS;
    @FXML
    Label POKEMON_2_TIPO;
    @FXML
    Label POKEMON_3_NOM;
    @FXML
    Label POKEMON_3_NIV;
    @FXML
    Label POKEMON_3_PUNTOS;
    @FXML
    Label POKEMON_3_TIPO;
    @FXML
    Label POKEMON_4_NOM;
    @FXML
    Label POKEMON_4_NIV;
    @FXML
    Label POKEMON_4_PUNTOS;
    @FXML
    Label POKEMON_4_TIPO;
    @FXML
    Label POKEMON_5_NOM;
    @FXML
    Label POKEMON_5_NIV;
    @FXML
    Label POKEMON_5_PUNTOS;
    @FXML
    Label POKEMON_5_TIPO;
    @FXML
    Label POKEMON_6_NOM;
    @FXML
    Label POKEMON_6_NIV;
    @FXML
    Label POKEMON_6_PUNTOS;
    @FXML
    Label POKEMON_6_TIPO;
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
    AnchorPane POKEMON_1;
    @FXML
    AnchorPane POKEMON_2;
    @FXML
    AnchorPane POKEMON_3;
    @FXML
    AnchorPane POKEMON_4;
    @FXML
    AnchorPane POKEMON_5;
    @FXML
    AnchorPane POKEMON_6;
    @FXML
    Button BOTON1;
    @FXML
    Button BOTON2;


    @FXML

        public void initialize() {

            POKEMON_1_NOM.setText(pokemon_1.nombrePokemon);
            POKEMON_1_NIV.setText(pokemon_1.nivelPokemon);
            POKEMON_1_PUNTOS.setText(pokemon_1.puntosPokemon);
            POKEMON_1_TIPO.setText(pokemon_1.tipoPokemon);
            POKEMON_2_NOM.setText(pokemon_2.nombrePokemon);
            POKEMON_2_NIV.setText(pokemon_2.nivelPokemon);
            POKEMON_2_PUNTOS.setText(pokemon_2.puntosPokemon);
            POKEMON_2_TIPO.setText(pokemon_2.tipoPokemon);
            POKEMON_3_NOM.setText(pokemon_3.nombrePokemon);
            POKEMON_3_NIV.setText(pokemon_3.nivelPokemon);
            POKEMON_3_PUNTOS.setText(pokemon_3.puntosPokemon);
            POKEMON_3_TIPO.setText(pokemon_3.tipoPokemon);
            POKEMON_4_NOM.setText(pokemon_4.nombrePokemon);
            POKEMON_4_NIV.setText(pokemon_4.nivelPokemon);
            POKEMON_4_PUNTOS.setText(pokemon_4.puntosPokemon);
            POKEMON_4_TIPO.setText(pokemon_4.tipoPokemon);
            POKEMON_5_NOM.setText(pokemon_5.nombrePokemon);
            POKEMON_5_NIV.setText(pokemon_5.nivelPokemon);
            POKEMON_5_PUNTOS.setText(pokemon_5.puntosPokemon);
            POKEMON_5_TIPO.setText(pokemon_5.tipoPokemon);
            POKEMON_6_NOM.setText(pokemon_6.nombrePokemon);
            POKEMON_6_NIV.setText(pokemon_6.nivelPokemon);
            POKEMON_6_PUNTOS.setText(pokemon_6.puntosPokemon);
            POKEMON_6_TIPO.setText(pokemon_6.tipoPokemon);

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
        BOTON1.setText("POKEMON ELEGIDO");
        BOTON2.setText("SIGUIENTE");
        pokemonSeleccionado = pokemon_1;
    }
    @FXML
    public void selectPokemon2(){
        System.out.println("imagen seleccionada");
        POKEMON_1.setStyle("-fx-background-color: #7d6a87");
        POKEMON_2.setStyle("-fx-background-color: #685175");
        POKEMON_3.setStyle("-fx-background-color: #7d6a87");
        POKEMON_4.setStyle("-fx-background-color: #7d6a87");
        POKEMON_5.setStyle("-fx-background-color: #7d6a87");
        POKEMON_6.setStyle("-fx-background-color: #7d6a87");
        BOTON1.setText("POKEMON ELEGIDO");
        BOTON2.setText("SIGUIENTE");
        pokemonSeleccionado = pokemon_2;
    }
    @FXML
    public void selectPokemon3(){
        System.out.println("imagen seleccionada");
        POKEMON_1.setStyle("-fx-background-color: #7d6a87");
        POKEMON_2.setStyle("-fx-background-color: #7d6a87");
        POKEMON_3.setStyle("-fx-background-color: #685175");
        POKEMON_4.setStyle("-fx-background-color: #7d6a87");
        POKEMON_5.setStyle("-fx-background-color: #7d6a87");
        POKEMON_6.setStyle("-fx-background-color: #7d6a87");
        BOTON1.setText("POKEMON ELEGIDO");
        BOTON2.setText("SIGUIENTE");
        pokemonSeleccionado = pokemon_3;
    }
    @FXML
    public void selectPokemon4(){
        System.out.println("imagen seleccionada");
        POKEMON_1.setStyle("-fx-background-color: #7d6a87");
        POKEMON_2.setStyle("-fx-background-color: #7d6a87");
        POKEMON_3.setStyle("-fx-background-color: #7d6a87");
        POKEMON_4.setStyle("-fx-background-color: #685175");
        POKEMON_5.setStyle("-fx-background-color: #7d6a87");
        POKEMON_6.setStyle("-fx-background-color: #7d6a87");
        BOTON1.setText("POKEMON ELEGIDO");
        BOTON2.setText("SIGUIENTE");
        pokemonSeleccionado = pokemon_4;
    }
    @FXML
    public void selectPokemon5(){

        System.out.println("imagen seleccionada");
        POKEMON_1.setStyle("-fx-background-color: #7d6a87");
        POKEMON_2.setStyle("-fx-background-color: #7d6a87");
        POKEMON_3.setStyle("-fx-background-color: #7d6a87");
        POKEMON_4.setStyle("-fx-background-color: #7d6a87");
        POKEMON_5.setStyle("-fx-background-color: #685175");
        POKEMON_6.setStyle("-fx-background-color: #7d6a87");
        BOTON1.setText("POKEMON ELEGIDO");
        BOTON2.setText("SIGUIENTE");
        pokemonSeleccionado = pokemon_5;
    }
    @FXML
    public void selectPokemon6(){
        System.out.println("imagen seleccionada");
        POKEMON_1.setStyle("-fx-background-color: #7d6a87");
        POKEMON_2.setStyle("-fx-background-color: #7d6a87");
        POKEMON_3.setStyle("-fx-background-color: #7d6a87");
        POKEMON_4.setStyle("-fx-background-color: #7d6a87");
        POKEMON_5.setStyle("-fx-background-color: #7d6a87");
        POKEMON_6.setStyle("-fx-background-color: #685175");
        BOTON1.setText("POKEMON ELEGIDO");
        BOTON2.setText("SIGUIENTE");
        pokemonSeleccionado = pokemon_6;
    }

    Stage campobatalla;

    @FXML
    protected void campo_de_batalla() {

        System.out.println("Boton pulsado vamos al campo de Batalla");

        try {

            campobatalla = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("campo-batalla.fxml"));

            AnchorPane root =  loader.load();
            Scene scene = new Scene(root, 960, 727);

            campobatalla.setScene(scene);
            campobatalla.show();

            HelloController2 v = loader.getController();
            v.initialize2(pokemonSeleccionado);
            v.enviarDatos(this);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Float calcularVida(Pokemon pokemon){
        return Float.parseFloat(String.valueOf(pokemon.vidaRestantePokemon / pokemon.vidaPokemon));
    }

    public void actualizarInterfaz(Pokemon pokemon){
        ListaPokemon.set(pokemon.getIndex(),pokemon);
        initialize();
    }

}

class Pokemon {
    int id;
    String nombrePokemon;
    String nivelPokemon;
    File fotoPokemon;
    String puntosPokemon;
    String tipoPokemon;
    float vidaPokemon;
    float vidaRestantePokemon;


    public Pokemon( int id,String nombrePokemon,String nivelPokemon,File fotoPokemon,String puntosPokemon,String tipoPokemon,float vidaPokemon,float vidaRestantePokemon ){
        this.id=id;
        this.nombrePokemon=nombrePokemon;
        this.nivelPokemon=nivelPokemon;
        this.puntosPokemon=puntosPokemon;
        this.tipoPokemon=tipoPokemon;
        this.vidaPokemon=vidaPokemon;
        this.vidaRestantePokemon=vidaRestantePokemon;
        this.fotoPokemon=fotoPokemon;

    }
    public int getIndex(){
        return id;
    }
    }
