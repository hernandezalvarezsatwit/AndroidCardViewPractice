package edu.wit.mobileapp.cardview;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> list;
    private LayoutInflater inflater;

    public ListAdapter(List<ListElement> itemsList, Context context){
        inflater = LayoutInflater.from(context);
        list = itemsList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, city;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.titleView);
            city = itemView.findViewById(R.id.descriptionView);
        }

        void bindData(ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            city.setText(item.getCity());
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.list_element, null);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ListAdapter.ViewHolder holder, int position){
        holder.bindData(list.get(position));
    }

    public int getItemCount(){
        return list.size();
    }
}
