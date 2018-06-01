package in.eyehunt.basiccommunicationbetweenfragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        SenderFragment.SenderFragmentListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void messageFromSenderFragment(String msg) {
        FragmentManager manager = getSupportFragmentManager();
        ReceiverFragment mReceiverFragment = (ReceiverFragment)manager.findFragmentById(R.id.frg_Receiver);
        mReceiverFragment.youGotMsg(msg);
    }
}
