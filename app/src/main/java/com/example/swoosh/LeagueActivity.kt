package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeage = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        selectedLeage = "mens"
    }

    fun onWomensClicked(view: View){
        mens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        selectedLeage = "womens"
    }

    fun onCoedClicked(view: View){
        mens_league_btn.isChecked = false
        womens_league_btn.isChecked = false
        selectedLeage = "coed"

    }

    fun leagueNextClicked(view: View){
        if(selectedLeage !="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeage)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }




}