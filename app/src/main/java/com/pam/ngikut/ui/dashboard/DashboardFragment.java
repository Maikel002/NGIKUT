package com.pam.ngikut.ui.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pam.ngikut.R;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {
    public DashboardFragment(){

    }
    ArrayList<String> data;
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        data = new ArrayList<>();
        data.add("Kuta");
        data.add("Pandawa");
        data.add("Dreamland");
        data.add("Tanjung Benoa");
        data.add("Sanur");
        data.add("Jimbaran");
        data.add("Legian");
        data.add("Padang Padang");
        data.add("Seminyak");
        data.add("Karama Kandara");
        data.add("Tanah Lot");
        data.add("Blue Lagoon");
        data.add("Bias Tugel");
        data.add("Nusa Dua");
        data.add("Canggu");
        data.add("Tulamben");
        data.add("Medewi");
        data.add("Amed");
        data.add("Blue Point");
        data.add("Echo");

        ArrayAdapter<String> listviewadapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_list_item_1, data
        );
        ListView listView = (ListView) root.findViewById(R.id.listbeach);
        listView.setAdapter(listviewadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selecteddata =  data.get(position);
                Bundle bundle = new Bundle();
                bundle.putString("selected_data", selecteddata);
                TextView tv = (TextView) root.findViewById(R.id.teksss);
                ImageView iv = (ImageView) root.findViewById(R.id.gambar);
                if(bundle.getString("selected_data") == "Kuta"){
                    iv.setImageResource(R.drawable.kuta);
                } else
                if(bundle.getString("selected_data") == "Pandawa"){
                    iv.setImageResource(R.drawable.pandawa);
                }else
                if(bundle.getString("selected_data") == "Dreamland"){
                    iv.setImageResource(R.drawable.dreamland);
                }else
                if(bundle.getString("selected_data") == "Tanjung Benoa"){
                    iv.setImageResource(R.drawable.tanjungbenoa);
                }else
                if(bundle.getString("selected_data") == "Sanur"){
                    iv.setImageResource(R.drawable.sanur);
                }else
                if(bundle.getString("selected_data") == "Jimbaran"){
                    iv.setImageResource(R.drawable.jimbaran);
                }else
                if(bundle.getString("selected_data") == "Legian"){
                    iv.setImageResource(R.drawable.legian);
                }else
                if(bundle.getString("selected_data") == "Padang Padang"){
                    iv.setImageResource(R.drawable.padangpadang);
                }else
                if(bundle.getString("selected_data") == "Seminyak"){
                    iv.setImageResource(R.drawable.seminyak);
                }else
                if(bundle.getString("selected_data") == "Karama Kandara"){
                    iv.setImageResource(R.drawable.karmakandara);
                }else
                if(bundle.getString("selected_data") == "Tanah Lot"){
                    iv.setImageResource(R.drawable.tanahlot);
                }else
                if(bundle.getString("selected_data") == "Blue Lagoon"){
                    iv.setImageResource(R.drawable.bluelagoon);
                }else
                if(bundle.getString("selected_data") == "Bias Tugel"){
                    iv.setImageResource(R.drawable.biastugel);
                }else
                if(bundle.getString("selected_data") == "Nusa Dua"){
                    iv.setImageResource(R.drawable.nusadua);
                }else
                if(bundle.getString("selected_data") == "Canggu"){
                    iv.setImageResource(R.drawable.canggu);
                }else
                if(bundle.getString("selected_data") == "Tulamben"){
                    iv.setImageResource(R.drawable.tulamben);
                }else
                if(bundle.getString("selected_data") == "Medewi"){
                    iv.setImageResource(R.drawable.medewi);
                }else
                if(bundle.getString("selected_data") == "Amed"){
                    iv.setImageResource(R.drawable.amed);
                }else
                if(bundle.getString("selected_data") == "Blue Point"){
                    iv.setImageResource(R.drawable.bluepoint);
                }

                tv.setText(bundle.getString("selected_data"));
            }
        });
        return root;
    }


}
