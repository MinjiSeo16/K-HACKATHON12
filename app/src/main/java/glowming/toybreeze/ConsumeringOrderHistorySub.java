package glowming.toybreeze;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ConsumeringOrderHistorySub extends Fragment {
    private static final String TAG = ConsumeringOrderHistorySub.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_consumer_orderlist_sub, container, false);
        //activity = (ConsumerMyPageActivity) getActivity();

        Button list = view.findViewById(R.id.button71);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ConsumerReviewing consumerReviewing = new ConsumerReviewing();
                transaction.replace(R.id.main_container, consumerReviewing);
                transaction.commit();
            }
        });

        ImageView arrow = view.findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentConsumerMyPage consumerMyPage = new FragmentConsumerMyPage();
                transaction.replace(R.id.main_container, consumerMyPage);
                transaction.commit();
            }
        });

        return view;
    }
}
