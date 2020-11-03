package com.example.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utillities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

   lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!

    }

    fun onBallerClick(view: View){
        beginner_skill_btn.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClick(view: View){
        baller_skill_btn.isChecked = false
        player.skill = "beginner"
    }
    fun onSkillFinishClick(view: View){
        if(player.skill != "") {
        val finishActivity = Intent(this, FinishActivity::class.java)
       finishActivity.putExtra(EXTRA_PLAYER,player)
        startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}