package com.example.android.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA;
    private int scoreTeamB;

    private CourtCounterFragment m_fragment_team_a;
    private CourtCounterFragment m_fragment_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     protected void onStart() {
         super.onStart();
         setFragmentTeamName();
     }

    private void setFragmentTeamName() {
        m_fragment_team_a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        m_fragment_team_b =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
        m_fragment_team_a.setTeamName("黃蜂");
        m_fragment_team_b.setTeamName("火箭");
    }

    public void resetScoreView(View view) {
        //scoreTeamA = 0;
       // scoreTeamB = 0;

       // CourtCounterFragment fragment_team_a =
       //         (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
       // CourtCounterFragment fragment_team_b =
       //         (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);

        m_fragment_team_a.resetScore();
        m_fragment_team_b.resetScore();
    }


}
