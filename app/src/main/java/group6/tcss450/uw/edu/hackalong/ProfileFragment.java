/**
 * TCSS 450 Spring 2017 Group 6
 * ProfileFragment.java
 * May 5, 2017
 */
package group6.tcss450.uw.edu.hackalong;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * This class controls the user profile
 */
public class ProfileFragment extends LoginFragment {
    /* the fragment listener */
    private OnFragmentInteractionListener mListener;
    private TextView mTextView;
    /**
     * Required empty constructor
     */
    public ProfileFragment() {
    }

    /**
     * Creates the view for the fragment
     *
     * @param inflater           inflates the fragment
     * @param container          the container that holds the fragment
     * @param savedInstanceState the previous state, if any
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        mTextView = (TextView) v.findViewById(R.id.username);

        FloatingActionButton F = (FloatingActionButton) v.findViewById(R.id.fab);
        F.setOnClickListener(this);
        return v;
    }

    public void onClick(View v){
        if (mListener != null) {
            switch (v.getId()) {
                case R.id.fab:
                    mListener.onFragmentInteraction("profileEdit", null, null);
                    break;

                default:
                    break;

            }
        }
    }


    /**
     * Checks the context to make sure it is an OnFragmentInteractionListener
     *
     * @param context is the context of this class
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    /**
     * Calls the super method and sets the mListener to null
     */
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
