package com.example.baseballapp

import android.app.AlertDialog
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var score1 : int = 0
    private var score2 : int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateStrike()
        updateBall()
        ballCount()
        strikeCount()
        exit()
        reset()
    }

    private fun updateStrike() {
        TextView t = (TextView)findViewById(R.id.strikeNum)
        t.setText(Integer.toString(strike_count))
    }

    private fun updateBall() {
        TextView t = (TextView)findViewById(R.id.ballNum)
        t.setText(Integer.toString(ball_count))
    }

    private fun ballCount() {
        if (ball == 4){
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
            builder.setTitle("Walk")
            builder.setMessage("Walk!")
            builder.setCancelable(false)
        }
    }

    private fun strikeCount() {
        if (ball == 3){
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
            builder.setTitle("Out")
            builder.setMessage("Out!")
            builder.setCancelable(false)
        }

    }

    private fun exit() {
        finish()
        System.exit(0)
    }

    private fun reset(){
        score1 = 0
        score2 = 0
        score1.updateStrike()
        score2.updateBall()
    }
}

