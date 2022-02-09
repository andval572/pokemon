package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class HelloController2 {


    Pokemon_Oponetes pokemonSeleccionado;
    Pokemon_Oponetes oponente;

    ArrayList<Pokemon_Oponetes> ListaOponentes = new ArrayList<>();

    Fondo f1 = new Fondo(new File("src\\main\\java\\com\\example\\entregapokemon1\\Imagenes\\campo.jpg"));

    Pokemon_Oponetes pokemonO_1 = new Pokemon_Oponetes("JOLTEON", "NIV 65", new File("src\\main\\java\\com\\example\\demo\\imagenes\\jolteon.gif"), 200, 200);
    Pokemon_Oponetes pokemonO_2 = new Pokemon_Oponetes("CHARIZARD", "NIV 45", new File("src\\main\\java\\com\\example\\demo\\imagenes\\charmander1.gif"), 200, 200);
    Pokemon_Oponetes pokemonO_3 = new Pokemon_Oponetes("VAPOREON", "NIV 54", new File("src\\main\\java\\com\\example\\demo\\imagenes\\vaporeon.gif"), 200, 200);
    Pokemon_Oponetes pokemonO_4 = new Pokemon_Oponetes("BLASTOISE", "NIV 65", new File("src\\main\\java\\com\\example\\demo\\imagenes\\blastoise.gif"), 200, 200);


    @FXML
    Label NOM_MI_POKEMON;
    @FXML
    Label NIV_MI_POKEMON;
    @FXML
    Label NOM_OPONENTE;
    @FXML
    Label NIV_OPONENTE;

    @FXML
    ImageView IMG_MI_POKEMON;
    @FXML
    ImageView IMG_OPONENTE;
    @FXML
    ImageView FONDO_CAMPO;

    @FXML
    ProgressBar VIDA_MI_POKEMON;
    @FXML
    ProgressBar VIDA_OPONENTE;

    @FXML
    AnchorPane MI_POKEMON;
    @FXML
    AnchorPane POKEMON_OPONENTE;
    @FXML
    AnchorPane BATALLA;
    @FXML
    AnchorPane LISTA_BOTONES_1;
    @FXML
    AnchorPane LISTA_BOTONES_2;
    @FXML
    Button ATAQUE_1;
    @FXML
    Button ATAQUE_2;
    @FXML
    Button ATAQUE_3;
    @FXML
    Button CANCELAR;
    @FXML
    Button ATACAR;
    @FXML
    Button CURAR;

    private HelloController HelloController;

    @FXML

    public void initialize2(Pokemon pokemonSeleccionado) {

        this.pokemonSeleccionado = pokemonSeleccionado;

        Image imagen1 = new Image(pokemonSeleccionado.fotoPokemon.toURI().toString());
        IMG_MI_POKEMON.setImage(imagen1);
        NOM_MI_POKEMON.setText(pokemonSeleccionado.nombrePokemon);
        NIV_MI_POKEMON.setText(pokemonSeleccionado.nivelPokemon);
        VIDA_MI_POKEMON.setProgress(pokemonSeleccionado.vidaRestantePokemon / pokemonSeleccionado.vidaPokemon);

        ListaOponentes.add(pokemonO_1);
        ListaOponentes.add(pokemonO_2);
        ListaOponentes.add(pokemonO_3);
        ListaOponentes.add(pokemonO_4);

        oponente = ListaOponentes.get((int) (Math.random() * ListaOponentes.size()));

        Image imagen2 = new Image(oponente.fotoPokemon.toURI().toString());
        IMG_OPONENTE.setImage(imagen2);
        NOM_OPONENTE.setText(oponente.nombrePokemon);
        VIDA_OPONENTE.setProgress(oponente.vidaRestantePokemon / oponente.vidaPokemon);
        NIV_OPONENTE.setText(oponente.nivelPokemon);

        ATAQUE_1.setVisible(false);
        ATAQUE_2.setVisible(false);
        ATAQUE_3.setVisible(false);
        CANCELAR.setVisible(false);


    }

    @FXML
    protected void btAtaques() {

        System.out.println("BotonAtaqueSeleccionado");
        ATACAR.setVisible(false);
        CURAR.setVisible(false);
        ATAQUE_1.setVisible(true);
        ATAQUE_2.setVisible(true);
        ATAQUE_3.setVisible(true);
        CANCELAR.setVisible(true);


    }

    @FXML
    protected void MasVida() {

        System.out.println("Boton Curar Seleccionado");
        Random r = new Random();

        int masVida = r.nextInt(50) + 25;
        pokemonSeleccionado.vidaRestantePokemon += masVida;
        VIDA_MI_POKEMON.setProgress(pokemonSeleccionado.vidaRestantePokemon / pokemonSeleccionado.vidaPokemon);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        System.out.println("Curacion1 de " + masVida);

        masVida = r.nextInt(50) + 25;
        oponente.vidaRestantePokemon+= masVida;
        VIDA_OPONENTE.setProgress(oponente.vidaRestantePokemon / oponente.vidaPokemon);
        System.out.println("Curacion2 de " + masVida);
    }

    @FXML
    protected void btSeguro() {

        int danoSeguro = 20;

        System.out.println("BotonSeguroSeleccionado");

        pokemonSeleccionado.vidaRestante -= danoSeguro;
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);
        System.out.println("Daño seguro1 de " + danoSeguro);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        controlarDeLaVidaAliado();

        oponente.vidaRestante2 -= danoSeguro;
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        System.out.println("Daño seguro2 de " + danoSeguro);
        controlarDeLaVidaEnemigo();

    }

    @FXML
    protected void btArriesgado() {

        System.out.println("BotonArriesgadoSeleccionado");
        Random r = new Random();

        int rdmArriesgado = r.nextInt(15) + 10;
        pokemonSeleccionado.vidaRestante -= rdmArriesgado;
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);
        System.out.println("Daño arriesgado1 de " + rdmArriesgado);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        controlarDeLaVidaAliado();

        rdmArriesgado = r.nextInt(15) + 10;
        oponente.vidaRestante2 -= rdmArriesgado;
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        System.out.println("Daño arriesgado2 de " + rdmArriesgado);
        controlarDeLaVidaEnemigo();

    }

    @FXML
    protected void btMuyArriesgado() {

        System.out.println("BotonMuyArriesgadoSeleccionado");
        Random r = new Random();

        int rdmMuyArriesgado = r.nextInt(50);
        pokemonSeleccionado.vidaRestante -= rdmMuyArriesgado;
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);
        System.out.println("Daño muy arriesgado1 de " + rdmMuyArriesgado);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        controlarDeLaVidaAliado();

        rdmMuyArriesgado = r.nextInt(50);
        oponente.vidaRestante2 -= rdmMuyArriesgado;
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        System.out.println("Daño muy arriesgado2 de " + rdmMuyArriesgado);
        controlarDeLaVidaEnemigo();

    }

    @FXML
    protected void btCancelar() {

        System.out.println("BotonCancelarSeleccionado");
        btAtacar.setVisible(true);
        btCurar.setVisible(true);
        btAtaque1.setVisible(false);
        btAtaque2.setVisible(false);
        btAtaque3.setVisible(false);
        btCancelar.setVisible(false);

    }
}
class Pokemon_Oponetes {

    String nombrePokemon;
    String nivelPokemon;
    File fotoPokemon;
    double vidaPokemon;
    double vidaRestantePokemon;


    public Pokemon_Oponetes(String nombrePokemon, String nivelPokemon, File fotoPokemon, double vidaPokemon, double vidaRestantePokemon) {

        this.nombrePokemon = nombrePokemon;
        this.nivelPokemon = nivelPokemon;
        this.vidaPokemon = vidaPokemon;
        this.vidaRestantePokemon = vidaRestantePokemon;
        this.fotoPokemon = fotoPokemon;

    }
}

