package contratarprofissional.studio.com.mainactivity;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class LstFragment extends ListFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        //inflate the fragment layout file
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragmentlayout,container,false);
        // Create datasource
        String [] datasource={"AULAS","EVENTOS","ASSISTENCIA TÉCNICA","REFORMAS","SERVIÇOS DOMÉSTICOS","DESIGN E TECNOLOGIA"};
        // Create adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),R.layout.rowlayout,R.id.txtitem,datasource);
        // Bind adapter to the listfragment
        setListAdapter (adapter);
        // Retain listfragment instance across configuration changes
        setRetainInstance (true);
        return rootView;
     }

    //Handling item click
        public void onListItemClick (ListView l, View view, int position, long id) {
            ViewGroup viewGroup=(ViewGroup)view;
            TextView txt=(TextView) viewGroup.findViewById(R.id.txtitem);
            Toast.makeText(getActivity(),txt.getText().toString(),Toast.LENGTH_LONG).show();

        }

            }