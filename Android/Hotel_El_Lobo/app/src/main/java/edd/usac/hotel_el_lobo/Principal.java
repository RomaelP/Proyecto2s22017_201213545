package edd.usac.hotel_el_lobo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
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

public class Principal extends AppCompatActivity {

    private Button btnLogin;
    private Button btnAgregar;
    private EditText etUsuario;
    private EditText etPassword;
    String respuestaServidor = "";
    String verificacion = "";
    RequestBody formBody;
    OkHttpClient clienteWEB = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnAgregar = (Button) findViewById(R.id.btnAgregarUser);
        etUsuario = (EditText) findViewById(R.id.etUsuarioL);
        etPassword = (EditText) findViewById(R.id.etPasswordL);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    intentarConexion();
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        });

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntento = new Intent(view.getContext(),agregaUsuario.class);
                startActivityForResult(miIntento,0);
            }
        });
    }

    public void intentarConexion() throws IOException
    {

        String Usuario = etUsuario.getText().toString();
        String Contra = etPassword.getText().toString();


        if(TextUtils.isEmpty(Usuario) || TextUtils.isEmpty(Contra)){
            Toast.makeText(Principal.this, "Llenar ambos campos", Toast.LENGTH_SHORT).show();
        }else{

            RequestBody datosaEnviar = new FormEncodingBuilder()
                    .add("usuario",Usuario)
                    .add("contra", Contra)
                    .build();
            formBody = datosaEnviar;
            Toast.makeText(Principal.this, Usuario, Toast.LENGTH_SHORT).show();
            //Toast.makeText(MainActivity.this, Contra, Toast.LENGTH_SHORT).show();
            conectarServidorPython();
        }
    }

    public void conectarServidorPython(){
        Thread nuevohilo =new Thread(){
            @Override
            public void run(){

                try{
                    URL url =new URL("http://"+conexion.globalDireccionIP+":5000/agregarLD");
                    Request request = new Request.Builder().url(url).post(formBody).build();
                    Response response = clienteWEB.newCall(request).execute();
                    respuestaServidor = response.body().string();
                    Toast.makeText(Principal.this, respuestaServidor, Toast.LENGTH_SHORT).show();
                }catch (MalformedURLException ee){
                    java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ee);
                    //Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_SHORT).show();

                }catch (Exception ex){
                    java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    //Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_SHORT).show();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_SHORT).show();
                        if(respuestaServidor.equals("True")){
                            //Toast.makeText(MainActivity.this, respuestaPython, Toast.LENGTH_SHORT).show();
                            Intent miIntento2 = new Intent (Principal.this, Usuario.class);
                            startActivityForResult(miIntento2,0);//Pendiente la llamada al siguiente Activity
                        }else{
                            Toast.makeText(Principal.this, "No se ha podido conectar con el servidor", Toast.LENGTH_SHORT).show();
                            etPassword.setText("");
                        }

                    }
                });
            }
        };
        nuevohilo.start();
    }

}
