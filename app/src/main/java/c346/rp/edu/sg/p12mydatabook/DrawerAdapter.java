package c346.rp.edu.sg.p12mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15031777 on 10/8/2017.
 */

public class DrawerAdapter extends ArrayAdapter<Drawer> {
    private ArrayList<Drawer> drawer;
    private Context context;
    private TextView bio, vacc, anni, about;
    private ImageView imgb, imgv, imgan, imgab;



    public DrawerAdapter(Context context, int resource, ArrayList<Drawer> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        drawer = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        // Get the ImageView object
        bio = (TextView) rowView.findViewById(R.id.textViewTitle);


        imgb = (ImageView) rowView.findViewById(R.id.imageView);
//


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Drawer currentFood = drawer.get(position);
        // Set the TextView to show the food

        bio.setText(currentFood.getTitle());
        // Set the image to star or nostar accordingly
        if(currentFood.getText().toString().equalsIgnoreCase("bio")) {
            imgb.setImageResource(R.drawable.info);
        }
        else if(currentFood.getText().toString().equalsIgnoreCase("vaccination")) {
            imgv.setImageResource(R.drawable.vac);
        }
        else if (currentFood.getText().toString().equalsIgnoreCase("anniversary")) {
            imgan.setImageResource(R.drawable.anni);
        }
        else if (currentFood.getText().toString().equalsIgnoreCase("about us")) {
            imgab.setImageResource(R.drawable.about);
        }

        // Return the nicely done up View to the ListView
        return rowView;
    }


}
