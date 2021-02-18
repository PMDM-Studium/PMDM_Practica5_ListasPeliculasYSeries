package es.studium.listas.ui.series;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import es.studium.listas.R;

public class SeriesAdapter extends RecyclerView.Adapter<es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder> implements View.OnClickListener {
    private List<Series> items;
    private View.OnClickListener listener;
    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public static class SeriesViewHolder extends RecyclerView.ViewHolder {
        // Campos respetivos de un item
        public ImageView imagenSeries;
        public TextView nombreSeries;
        public TextView directorSeries;

        public SeriesViewHolder(View view){
            super(view);
            imagenSeries = (ImageView) view.findViewById(R.id.imagenSerie);
            nombreSeries = (TextView) view.findViewById(R.id.nombreSerie);
            directorSeries = (TextView) view.findViewById(R.id.directorSerie);
        }
    }
    public SeriesAdapter(List<Series> items) {
        this.items = items;
    }
    @Override
    public es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder onCreateViewHolder (ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_card, viewGroup, false);
        return new es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder(view);
    }
    @Override
    public void onBindViewHolder(es.studium.listas.ui.series.SeriesAdapter.SeriesViewHolder viewHolder, int i) {
        viewHolder.imagenSeries.setImageResource(items.get(i).getImagenSerie());
        viewHolder.nombreSeries.setText(items.get(i).getNombreSerie());
        viewHolder.directorSeries.setText(items.get(i).getDirectorSerie());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    //Metodo para el click on listener implementado en seriesfragment
    public void setOnClickLister(View.OnClickListener listener){
        this.listener=listener;
    }
}

