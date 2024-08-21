package bd.city.utility.management;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.management.R;

public class ReportListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] title;
    private final Integer[] imgid;

    public ReportListAdapter(Activity context, Integer[] imgid, String[] title) {
        super(context, R.layout.mylist, title);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.title=title;
        this.imgid=imgid;
    }


    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        titleText.setText(title[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;
    };

}