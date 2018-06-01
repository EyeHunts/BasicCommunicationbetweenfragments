package in.eyehunt.basiccommunicationbetweenfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SenderFragment extends Fragment {

    SenderFragmentListener mCommunication;

    public SenderFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCommunication = (SenderFragmentListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sender, container, false);
        Button button = (Button) view.findViewById(R.id.btn_sender);
        // on click button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCommunication.messageFromSenderFragment("Hello Fragment i am Sender...");
            }
        });
        return view;
    }

    //Interface for communication
    public interface SenderFragmentListener {
        void messageFromSenderFragment(String msg);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCommunication = null;
    }
}
