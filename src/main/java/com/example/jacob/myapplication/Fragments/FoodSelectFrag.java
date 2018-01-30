package com.example.jacob.myapplication.Fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jacob.myapplication.R;



/**
 * A simple {@link Fragment} subclass.
 */
public class FoodSelectFrag extends Fragment {

/*
* Below is a large onclick for the buttons on the select page
* This is used to navigate to individual fragments for each of the buttons
* which should function differently from one another. They essentially act as 7 different pages.
* fbut# refers to the fragment and the number associated with it
* fButTrans# refers to the fragment transition and the number associated with it.
*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

private View.OnClickListener buttonListen = new View.OnClickListener() {
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button:
                            FoodListFrag fbut1 = new FoodListFrag();
                            FragmentTransaction fButTrans1 =
                                    getFragmentManager().beginTransaction();
                            fButTrans1.replace(R.id.fragment_container, fbut1);
                            fButTrans1.commit();
                            break;
                        case R.id.button2:
                            FoodListFrag fbut2 = new FoodListFrag();
                            FragmentTransaction fButTrans2 =
                                    getFragmentManager().beginTransaction();
                            fButTrans2.replace(R.id.fragment_container, fbut2);
                            fButTrans2.commit();
                            break;
                        case R.id.button3:
                            FoodListFrag fbut3 = new FoodListFrag();
                            FragmentTransaction fButTrans3 =
                                    getFragmentManager().beginTransaction();
                            fButTrans3.replace(R.id.fragment_container, fbut3);
                            fButTrans3.commit();
                            break;
                        case R.id.button4:
                            FoodListFrag fbut4 = new FoodListFrag();
                            FragmentTransaction fButTrans4 =
                                    getFragmentManager().beginTransaction();
                            fButTrans4.replace(R.id.fragment_container, fbut4);
                            fButTrans4.commit();
                            break;
                        case R.id.button5:
                            FoodListFrag fbut5 = new FoodListFrag();
                            FragmentTransaction fButTrans5 =
                                    getFragmentManager().beginTransaction();
                            fButTrans5.replace(R.id.fragment_container, fbut5);
                            fButTrans5.commit();
                            break;
                        case R.id.button6:
                            FoodListFrag fbut6 = new FoodListFrag();
                            FragmentTransaction fButTrans6 =
                                    getFragmentManager().beginTransaction();
                            fButTrans6.replace(R.id.fragment_container, fbut6);
                            fButTrans6.commit();
                            break;
                        case R.id.button7:
                            FoodListFrag fbut7 = new FoodListFrag();
                            FragmentTransaction fButTrans7 =
                                    getFragmentManager().beginTransaction();
                            fButTrans7.replace(R.id.fragment_container, fbut7);
                            fButTrans7.commit();
                            break;
                    }
                }
            };

    public FoodSelectFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.foodselectfrag, container, false);

        // Establish Buttons
        Button button = (Button) view.findViewById(R.id.button);
        Button button2 = (Button) view.findViewById(R.id.button2);
        Button button3 = (Button) view.findViewById(R.id.button3);
        Button button4 = (Button) view.findViewById(R.id.button4);
        Button button5 = (Button) view.findViewById(R.id.button5);
        Button button6 = (Button) view.findViewById(R.id.button6);
        Button button7 = (Button) view.findViewById(R.id.button7);

        // Setting onClickListeners
        button.setOnClickListener(buttonListen);
        button2.setOnClickListener(buttonListen);
        button3.setOnClickListener(buttonListen);
        button4.setOnClickListener(buttonListen);
        button5.setOnClickListener(buttonListen);
        button6.setOnClickListener(buttonListen);
        button7.setOnClickListener(buttonListen);

        return view;
    }

}
