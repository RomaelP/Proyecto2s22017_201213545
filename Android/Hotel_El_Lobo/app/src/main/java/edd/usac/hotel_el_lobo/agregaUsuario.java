package edd.usac.hotel_el_lobo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;


public class agregaUsuario extends AppCompatActivity {

    private Button btnEnviar;
    private EditText txtUsuario;
    private EditText txtPass;
    private EditText txtDireccion;
    private EditText txtTelefono;
    private EditText txtEdad;

    String respuestaPython = "";
    String verificacion = "";
    RequestBody formBody;
    OkHttpClient clienteWEB = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrega_usuario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPass = (EditText) findViewById(R.id.txtPass);
        txtDireccion = (EditText) findViewById(R.id.txtDireccion);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        txtEdad = (EditText) findViewById(R.id.txtEdad);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    intentarConexion();
                }catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void intentarConexion() throws IOException
    {
        String Usuario = txtUsuario.getText().toString();
        String Contra = txtPass.getText().toString();
        String Direccion = txtDireccion.getText().toString();
        String Telefono = txtTelefono.getText().toString();
        String Edad = txtEdad.getText().toString();

        Toast.makeText(agregaUsuario.this, Usuario+" " +Direccion+" " +Edad, Toast.LENGTH_SHORT).show();
        RequestBody datosaEnviar = new FormEncodingBuilder()
                .add("usuario","Roma")
                .add("contrasenia", "1234")
                .add("direccion","san marcos")
                .add("telefono", "77603933")
                .add("edad","27")
                .build();
        formBody = datosaEnviar;

        conectarServidorPython();
    }

    public void conectarServidorPython()
    {
        Thread nuevoHilo = new Thread(){

            @Override
            public void run(){

                try{
                    URL url =new URL("http://"+conexion.globalDireccionIP+":5000/agregarNuevoUsuario");
                    Request request = new Request.Builder().url(url).post(formBody).build();
                    Response response = clienteWEB.newCall(request).execute();
                    respuestaPython = response.body().string();
                    Toast.makeText(agregaUsuario.this, respuestaPython, Toast.LENGTH_SHORT).show();
                }catch (MalformedURLException ee){
                    java.util.logging.Logger.getLogger(agregaUsuario.class.getName()).log(Level.SEVERE, null, ee);
                    //Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_SHORT).show();

                }catch (Exception ex){
                    java.util.logging.Logger.getLogger(agregaUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    //Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_SHORT).show();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_SHORT).show();
                        if(respuestaPython.equals("True")){
                            Toast.makeText(agregaUsuario.this, respuestaPython, Toast.LENGTH_SHORT).show();
                            Intent miIntento2 = new Intent (agregaUsuario.this, Principal.class);
                            startActivityForResult(miIntento2,0);//Pendiente la llamada al siguiente Activity
                        }else{
                            Toast.makeText(agregaUsuario.this, "No se ha podido conectar con el servidor", Toast.LENGTH_SHORT).show();
                            //etContra.setText("");
                        }

                    }
                });
            }

        };
        nuevoHilo.start();
    }
}
