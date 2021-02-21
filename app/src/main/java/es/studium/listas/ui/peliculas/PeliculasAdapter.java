package es.studium.listas.ui.peliculas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import es.studium.listas.R;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder> implements View.OnClickListener {
    private List<Peliculas> items;
    private View.OnClickListener listener;
    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public static class PeliculasViewHolder extends RecyclerView.ViewHolder {
        // Campos respetivos de un item
        public ImageView imagenPeliculas;
        public TextView nombrePeliculas;
        public TextView directorPeliculas;

        public PeliculasViewHolder(View view){
            super(view);
            imagenPeliculas = (ImageView) view.findViewById(R.id.imagenPelicula);
            nombrePeliculas = (TextView) view.findViewById(R.id.nombrePelicula);
            directorPeliculas = (TextView) view.findViewById(R.id.directorPelicula);
        }
    }
    public PeliculasAdapter(List<Peliculas> items) {
        this.items = items;
    }
    @Override
    public PeliculasViewHolder onCreateViewHolder (ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.peliculas_card, viewGroup, false);
        view.setOnClickListener(this);
        return new PeliculasViewHolder(view);
    }
    @Override
    public void onBindViewHolder(PeliculasViewHolder viewHolder, int i) {
        viewHolder.imagenPeliculas.setImageResource(items.get(i).getImagenPelicula());
        viewHolder.nombrePeliculas.setText(items.get(i).getNombrePelicula());
        viewHolder.directorPeliculas.setText(items.get(i).getDirectorPelicula());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    //Metodo para el click on listener implementado en peliculasfragment
    public void setOnClickLister(View.OnClickListener listener){
        this.listener=listener;
    }
}

