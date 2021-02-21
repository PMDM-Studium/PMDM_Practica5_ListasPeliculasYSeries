package es.studium.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import es.studium.listas.ui.peliculas.Peliculas;

public class DetallesPeliculas extends AppCompatActivity {
    ImageView imagen;
    TextView nombre;
    TextView director;
    TextView reparto;
    RatingBar clasificacion;
    TextView sinopsis;
    Peliculas peliculas=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallespeliculas);
//        View vista = setContentView(R.layout.activity_detalles,container, false);
//        imagen = (ImageView) findViewById(R.id.imagen);
//        nombre = (TextView) findViewById(R.id.nombre);
//        director = (TextView) findViewById(R.id.director);
//        reparto = (TextView) findViewById(R.id.reparto);
//        clasificacion = (RatingBar) findViewById(R.id.ratingBar);
//        sinopsis = (TextView) findViewById(R.id.sinopsis);
//
//        Intent intent = getIntent();
//        Bundle bundle = intent.getExtras();
//
//        if(bundle!=null) {
//            peliculas = (Peliculas)getIntent().getExtras().getSerializable("peliculas");
//            imagen.setImageResource(peliculas.getImagenPelicula());
//            nombre.setText(peliculas.getNombrePelicula());
//            director.setText(peliculas.getDirectorPelicula());
//            reparto.setText(peliculas.getRepartoPelicula());
//            clasificacion.setRating(peliculas.getClasificacionPelicula());
//            sinopsis.setText(peliculas.getSinopsisPelicula());
//        }
        initViews();
        initValues();
    }
    private void initViews() {
        imagen = findViewById(R.id.imagen);
        nombre = findViewById(R.id.nombre);
        director = findViewById(R.id.director);
        reparto = findViewById(R.id.reparto);
        clasificacion = findViewById(R.id.ratingBar);
        sinopsis = findViewById(R.id.sinopsis);
    }

    private void initValues(){
        peliculas = (Peliculas)getIntent().getExtras().getSerializable("pelicula");
        imagen.setImageResource(peliculas.getImagenPelicula());
        nombre.setText(peliculas.getNombrePelicula());
        director.setText(peliculas.getDirectorPelicula());
        reparto.setText(peliculas.getRepartoPelicula());
        clasificacion.setRating(peliculas.getClasificacionPelicula());
        sinopsis.setText(peliculas.getSinopsisPelicula());
    }
}