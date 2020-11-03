package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player

import com.example.swoosh.R
import com.example.swoosh.Utillities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        mens_league_btn.isChecked = false
        womens_league_btn.isChecked = false
        player.league = "coed"

    }

    fun leagueNextClicked(view: View){
        if(player.league !="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }




}