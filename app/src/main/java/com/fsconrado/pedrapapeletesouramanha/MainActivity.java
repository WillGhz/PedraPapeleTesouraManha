package com.fsconrado.pedrapapeletesouramanha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View v){
        this.opcaoSelecionada("pedra");

    }
    public void papel(View v){
        this.opcaoSelecionada("papel");
    }
    public void tesoura(View v){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario){

        //Escolha do App
        String opcoes[] = {"pedra","papel","tesoura"};
        int indice = new Random().nextInt(opcoes.length);
        String escolhaApp = opcoes[indice];

        //Usuário Ganha
        if(escolhaUsuario=="pedra" && escolhaApp=="tesoura"
                || escolhaUsuario=="papel" && escolhaApp=="pedra"
                || escolhaUsuario=="tesoura" && escolhaApp=="papel"){
            Toast.makeText(this, "Você Venceu! :)", Toast.LENGTH_LONG).show();

        //App Ganha
        }else if (escolhaApp=="pedra" && escolhaUsuario=="tesoura"
                || escolhaApp=="papel" && escolhaUsuario=="pedra"
                || escolhaApp=="tesoura" && escolhaUsuario=="papel"){
            Toast.makeText(this, "Você Perdeu! :(", Toast.LENGTH_LONG).show();
        //Empate
        }else{
            Toast.makeText(this, "Deu empate! :|", Toast.LENGTH_LONG).show();
        }


    }
}
