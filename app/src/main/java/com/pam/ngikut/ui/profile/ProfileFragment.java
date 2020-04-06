package com.pam.ngikut.ui.profile;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 34985ba8ea51752b92eff463d7101759cffa3ac8
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.pam.ngikut.LoginActivity;
import com.pam.ngikut.R;

public class ProfileFragment extends Fragment {
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    private Button mSignOut;
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        mSignOut = (Button) root.findViewById(R.id.signOutButton);
        setupfirebaseListener();
        mSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
            }
        });
        return root;
    }

    private  void setupfirebaseListener(){
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null){

                } else{
                    Intent intent = new Intent(getActivity(),LoginActivity.class);
                    startActivity(intent);
                    Toast.makeText(getActivity().getApplicationContext(), "Sign Out Success", Toast.LENGTH_LONG).show();
                }
            }
        };
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseAuth.getInstance().addAuthStateListener(mAuthStateListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if(mAuthStateListener != null){
            FirebaseAuth.getInstance().removeAuthStateListener(mAuthStateListener);
        }
    }
=======

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.pam.ngikut.R;

public class ProfileFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        return root;
    }
>>>>>>> 34985ba8ea51752b92eff463d7101759cffa3ac8
}
