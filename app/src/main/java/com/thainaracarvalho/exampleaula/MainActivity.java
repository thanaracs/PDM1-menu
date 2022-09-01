package com.thainaracarvalho.exampleaula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.my_toolbar); //converter xml para classe toolbar
        setSupportActionBar(toolbar); //setar na classe toolbar que dá suporte ao aplicativo
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }//onCreate

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }//cria o menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.novogrupo:
                Toast.makeText(getApplicationContext(),"Criar novo grupo",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.arquivadas:
                Toast.makeText(getApplicationContext(),"Mensagens arquivadas",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.msgFavoritas:
                Toast.makeText(getApplicationContext(),"Thainara: Olá mundo",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.configuracoes:
                Toast.makeText(getApplicationContext(),"Condigurar perfil",
                        Toast.LENGTH_SHORT).show();
                return true;
            case android.R.id.home: //habilitando o botão home
                Toast.makeText(getApplicationContext(),"programa finalizado.",
                        Toast.LENGTH_SHORT).show();
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}//closs