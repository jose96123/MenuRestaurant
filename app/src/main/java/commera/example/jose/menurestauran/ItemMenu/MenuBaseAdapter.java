package commera.example.jose.menurestauran.ItemMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuBaseAdapter extends BaseAdapter {

    private Context context;
    private ArrayList counter;
    private ArrayList list;



    public MenuBaseAdapter(Context context , ArrayList<itemMenuStructure> list){

        this.list=list;
        this.context= context;
        counter = new ArrayList<TextView>();

    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){

            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.itemfood,null);
        }
        TextView txt1 = convertView.findViewById(R.id.textView);

        TextView txt2 = convertView.findViewById(R.id.textView2);

        ImageView img = convertView.findViewById(R.id.imageView2)


        return null;
    }
}
