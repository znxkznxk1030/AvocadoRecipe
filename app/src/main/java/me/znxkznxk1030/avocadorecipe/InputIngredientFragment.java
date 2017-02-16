package me.znxkznxk1030.avocadorecipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class InputIngredientFragment extends Fragment {


    private final String LOG_TAG = InputIngredientFragment.class.getSimpleName();
    ListView mListView;
    ArrayAdapter<String> mIngredient;

    public InputIngredientFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_input_ingredient, container, false);

        ArrayList<String> ingredients = new ArrayList<String>();

        // TODO : delete this temp list, and get Datas from Content Provider.
        ingredients.add("Tomato");
        ingredients.add("Potato");
        ingredients.add("Carrot");
        ingredients.add("Orange");
        ingredients.add("Apple");
        ingredients.add("Onion");
        ingredients.add("Garlic");
        ingredients.add("Lam");
        ingredients.add("Pork");
        ingredients.add("Meat");


        mListView = (ListView) rootView.findViewById(R.id.select_ingredient_listview);
        mIngredient = new ArrayAdapter<String>(getActivity(), R.layout.list_item_ingredient,
                ingredients);

        mListView.setAdapter(mIngredient);

        return rootView;
    }
}
