package es.studium.listas.ui.peliculas;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import es.studium.listas.R;

public class PeliculasFragment extends Fragment {
    PeliculasAdapter peliculasAdapter;
    RecyclerView recyclerViewPeliculas;
    //Iniciar Listas
    List<Peliculas> listaPeliculas;
    Activity activity;
    PeliculasInterface peliculasInterface;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_peliculas, container, false);
        recyclerViewPeliculas=view.findViewById(R.id.peliculasRecyclerView);
        listaPeliculas = new ArrayList();
        cargarlista();
        mostrardatos();
        return view;
            }
    public void cargarlista() {
        listaPeliculas.add(new Peliculas(R.drawable.deadpool, getString(R.string.nombrePelicula1),getString(R.string.directorPelicula1)
                , getString(R.string.repartoPelicula1),1,getString(R.string.sinopsisPelicula1)));
        listaPeliculas.add(new Peliculas(R.drawable.elseniordelosanillos, getString(R.string.nombrePelicula2),getString(R.string.directorPelicula2)
                , getString(R.string.repartoPelicula2),2,getString(R.string.sinopsisPelicula2)));
        listaPeliculas.add(new Peliculas(R.drawable.losvengadores, getString(R.string.nombrePelicula3),getString(R.string.directorPelicula3)
                , getString(R.string.repartoPelicula3),3,getString(R.string.sinopsisPelicula3)));
        listaPeliculas.add(new Peliculas(R.drawable.starwars, getString(R.string.nombrePelicula4),getString(R.string.directorPelicula4)
                , getString(R.string.repartoPelicula4),4,getString(R.string.sinopsisPelicula4)));
        listaPeliculas.add(new Peliculas(R.drawable.superman, getString(R.string.nombrePelicula5),getString(R.string.directorPelicula5)
                ,  getString(R.string.repartoPelicula5),5,getString(R.string.sinopsisPelicula5)));
    }
    public void mostrardatos(){
        recyclerViewPeliculas.setLayoutManager(new LinearLayoutManager(getContext()));
        peliculasAdapter = new PeliculasAdapter(listaPeliculas);
        recyclerViewPeliculas.setAdapter(peliculasAdapter);

        peliculasAdapter.setOnClickLister(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Enviamos el objeto de la lista completa
                peliculasInterface.enviarPelicula(listaPeliculas.get(recyclerViewPeliculas.getChildAdapterPosition(v)));
            }
        });

    }
}