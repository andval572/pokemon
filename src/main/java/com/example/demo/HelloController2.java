package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.File;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class HelloController2 {


    Pokemon pokemonSeleccionado;
    Pokemon_Oponetes oponente;

    ArrayList<Pokemon_Oponetes> ListaOponentes = new ArrayList<>();

    Fondo f1 = new Fondo(new File("src\\main\\java\\com\\example\\demo\\Imagenes\\campo.jpg"));

    Pokemon_Oponetes pokemonO_1 = new Pokemon_Oponetes("PIKACHU", "NIV 65", new File("src\\main\\java\\com\\example\\demo\\imagenes\\pikachu.gif"), 200, 200);
    Pokemon_Oponetes pokemonO_2 = new Pokemon_Oponetes("SNORLAX", "NIV 45", new File("src\\main\\java\\com\\example\\demo\\imagenes\\snorlax.gif"), 200, 200);
    Pokemon_Oponetes pokemonO_3 = new Pokemon_Oponetes("SQUIRTLE", "NIV 54", new File("src\\main\\java\\com\\example\\demo\\imagenes\\squirtle.gif"), 200, 200);
    Pokemon_Oponetes pokemonO_4 = new Pokemon_Oponetes("BULBASAUR", "NIV 65", new File("src\\main\\java\\com\\example\\demo\\imagenes\\bulbasaur.gif"), 200, 200);


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
    @FXML
    Text PS_OPONENTE;
    @FXML
    Text PS_MI_POKEMON;


    private HelloController HelloController;


    public void initialize2(Pokemon pokemonSeleccionado) {

        Image fondo = new Image(f1.fondo1.toURI().toString());
        FONDO_CAMPO.setImage(fondo);

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
    protected void BT_ATACAR() {

        System.out.println("Boton de Ataque Seleccionado");
        ATACAR.setVisible(false);
        CURAR.setVisible(false);
        ATAQUE_1.setVisible(true);
        ATAQUE_2.setVisible(true);
        ATAQUE_3.setVisible(true);
        CANCELAR.setVisible(true);


    }

    @FXML
    protected void BT_CURAR() {

        System.out.println("Boton Curar Seleccionado");
        Random r = new Random();

        int masVida = r.nextInt(50) + 25;
        pokemonSeleccionado.vidaRestantePokemon += masVida;
        VIDA_MI_POKEMON.setProgress(pokemonSeleccionado.vidaRestantePokemon / pokemonSeleccionado.vidaPokemon);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        System.out.println("Curacion de mi pokemon " + masVida);

        masVida = r.nextInt(50) + 25;
        oponente.vidaRestantePokemon+= masVida;
        VIDA_OPONENTE.setProgress(oponente.vidaRestantePokemon / oponente.vidaPokemon);
        System.out.println("Curacion de oponente " + masVida);
    }

    @FXML
    protected void BT_SEGURO() {

        int danio = 20;

        System.out.println("Boton Seguro Seleccionado");

        pokemonSeleccionado.vidaRestantePokemon -= danio;
        VIDA_MI_POKEMON.setProgress(pokemonSeleccionado.vidaRestantePokemon / pokemonSeleccionado.vidaPokemon);
        System.out.println("Dano seguro de " + danio);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        controlador_vida_mi_pokemon();

        oponente.vidaRestantePokemon -= danio;
        VIDA_OPONENTE.setProgress(oponente.vidaRestantePokemon / oponente.vidaPokemon);
        System.out.println("Dano seguro de " + danio);
        controlador_vida_oponente();

    }

    @FXML

    protected void BT_ARRIESGADO() {

        System.out.println("Boton Arriesgado Seleccionado");
        Random r = new Random();

        int ataque_arriesgado = r.nextInt(15) + 10;
        pokemonSeleccionado.vidaRestantePokemon -= ataque_arriesgado;
        VIDA_MI_POKEMON.setProgress(pokemonSeleccionado.vidaRestantePokemon / pokemonSeleccionado.vidaPokemon);
        System.out.println("Dano arriesgado1 de " + ataque_arriesgado);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        controlador_vida_mi_pokemon();

        ataque_arriesgado = r.nextInt(15) + 10;
        oponente.vidaRestantePokemon -= ataque_arriesgado;
        VIDA_OPONENTE.setProgress(oponente.vidaRestantePokemon / oponente.vidaPokemon);
        System.out.println("Dano arriesgado2 de " + ataque_arriesgado);
        controlador_vida_oponente();

    }

    @FXML
    protected void BT_MUY_ARRIESGADO() {

        System.out.println("Boton Muy Arriesgado Seleccionado");
        Random r = new Random();

        int MuyArriesgado = r.nextInt(50);
        pokemonSeleccionado.vidaRestantePokemon -= MuyArriesgado;
        VIDA_MI_POKEMON.setProgress(pokemonSeleccionado.vidaRestantePokemon / pokemonSeleccionado.vidaPokemon);
        System.out.println("Dano muy arriesgado de " + MuyArriesgado);
        //HelloController.actualizarInterfaz(pokemonSeleccionado);
        controlador_vida_mi_pokemon();

        MuyArriesgado = r.nextInt(50);
        oponente.vidaRestantePokemon -= MuyArriesgado;
        VIDA_OPONENTE.setProgress(oponente.vidaRestantePokemon/ oponente.vidaPokemon);
        System.out.println("Dano muy arriesgado de " + MuyArriesgado);
        controlador_vida_oponente();

    }

    @FXML
    protected void BT_CANCELAR() {

        System.out.println("Boton Cancelar Seleccionado");
        ATACAR.setVisible(true);
        CURAR.setVisible(true);
        ATAQUE_1.setVisible(false);
        ATAQUE_2.setVisible(false);
        ATAQUE_3.setVisible(false);
        CANCELAR.setVisible(false);

    }

    @FXML
    protected void cambiotextoOponente() {
        PS_OPONENTE.setText(String.valueOf(oponente.vidaRestantePokemon));}

    @FXML
    protected void cambiotextoOponente1() {
        PS_OPONENTE.setText("PS");
    }

    @FXML
    protected void cambiotextomiPokemon() {
        PS_MI_POKEMON.setText(String.valueOf(pokemonSeleccionado.vidaRestantePokemon));}

    @FXML
    protected void cambiotextomiPokemon1() {
        PS_MI_POKEMON.setText("PS");
    }


    private void controlador_vida_mi_pokemon() {

        if (pokemonSeleccionado.vidaRestantePokemon <= 0) {
            showAlert1(alertaPokemonAliado(oponente));
        }
    }

    private void controlador_vida_oponente() {

        if (oponente.vidaRestantePokemon <= 0) {
            showAlert2(alertaPokemonEnemigo(pokemonSeleccionado));
        }

    }

    private void showAlert1(Alert alert) {

        Optional<ButtonType> resultado = alert.showAndWait();

        if (resultado.get() == ButtonType.NO) {
            System.exit(0);
        }else{

            HelloController.stage2.close();
            HelloController.actualizarInterfaz(pokemonSeleccionado);
        }
    }
    private void showAlert2(Alert alert) {

        Optional<ButtonType> resultado = alert.showAndWait();

            if (resultado.get() == ButtonType.NO) {
                System.exit(0);

        }else{

                HelloController.stage2.close();
                HelloController.actualizarInterfaz(pokemonSeleccionado);
        }
    }


    public Alert alertaPokemonEnemigo(Pokemon pokemonSeleccionado) {

        Alert customAlert = new Alert(Alert.AlertType.NONE);

        customAlert.setTitle("Pokemon Ganador");
        customAlert.setContentText("El pokemon ganador es " +pokemonSeleccionado.nombrePokemon);
        customAlert.setGraphic(new ImageView(new Image(pokemonSeleccionado.fotoPokemon.toURI().toString())));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.NEXT, ButtonType.CLOSE);
        showAlert1(customAlert);

        return customAlert;

    }

    public Alert alertaPokemonAliado(Pokemon_Oponetes oponente) {

        Alert customAlert = new Alert(Alert.AlertType.NONE);

        customAlert.setTitle("Pokemon Ganador");
        customAlert.setContentText("tu pokemon ha perdido contra " +oponente.nombrePokemon);
        customAlert.setGraphic(new ImageView(new Image(oponente.fotoPokemon.toURI().toString())));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.NEXT, ButtonType.CANCEL);
        showAlert2(customAlert);

        return customAlert;

    }

    void enviarDatos(HelloController HelloController){
        this.HelloController=HelloController;
    }
}

class Pokemon_Oponetes {

    String nombrePokemon;
    String nivelPokemon;
    File fotoPokemon;
    Integer vidaPokemon;
    float vidaRestantePokemon;


    public Pokemon_Oponetes( String nombrePokemon, String nivelPokemon, File fotoPokemon, Integer vidaPokemon, float vidaRestantePokemon) {

        this.nombrePokemon = nombrePokemon;
        this.nivelPokemon = nivelPokemon;
        this.vidaPokemon = vidaPokemon;
        this.vidaRestantePokemon = vidaRestantePokemon;
        this.fotoPokemon = fotoPokemon;

    }
}
class Fondo {

    File fondo1;

    public Fondo(File fondo1) {
        this.fondo1 = fondo1;
    }

}
