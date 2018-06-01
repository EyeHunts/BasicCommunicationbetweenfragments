package in.eyehunt.basiccommunicationbetweenfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReceiverFragment extends Fragment {

    TextView tv_msg;

    public ReceiverFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_receiver, container, false);
        tv_msg = (TextView) view.findViewById(R.id.tv_receiver);
        return view;
    }

    //Receive message
    public void youGotMsg(String msg) {
        tv_msg.setText(msg);
    }
}
