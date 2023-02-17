package project.stn991638096.basketballdemobyyasu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import project.stn991638096.basketballdemobyyasu.databinding.ActivityMainBinding


class BasketBallDemoByYaSu : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //create ViewModel instance scoreModel
    private val scoreModel by lazy {
        ViewModelProvider(this).get(ScoreViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // display both teams scores
        displayForTeamA(scoreModel.scoreTeamA)
        // displayForTeamB(scoreModel.scoreTeamB)
        displayForTeamB(scoreModel.scoreTeamB)

    }


    fun addOneForTeamA(v: View?) {
        scoreModel.scoreTeamA = scoreModel.scoreTeamA + 1
        displayForTeamA(scoreModel.scoreTeamA)
    }

    fun addTwoForTeamA(v: View?) {
        addOneForTeamA(v)
        addOneForTeamA(v)
    }

    fun addThreeForTeamA(v: View?) {
        addOneForTeamA(v)
        addOneForTeamA(v)
        addOneForTeamA(v)
    }

    fun resetScore(v: View?) {
        scoreModel.scoreTeamA = 0
        displayForTeamA(scoreModel.scoreTeamA)
        scoreModel.scoreTeamB = 0
        displayForTeamB(scoreModel.scoreTeamB)
    }

    fun addOneForTeamB(v: View?){
        scoreModel.scoreTeamB = scoreModel.scoreTeamB + 1
        displayForTeamB(scoreModel.scoreTeamB)
    }

    fun addTwoForTeamB(v: View?) {
        addOneForTeamB(v)
        addOneForTeamB(v)
    }

    fun addThreeForTeamB(v: View?) {
        addOneForTeamB(v)
        addOneForTeamB(v)
        addOneForTeamB(v)
    }

    // display score for TeamA
    private fun displayForTeamA(score: Int) {
        binding.teamAScore.text = score.toString()
    }

    //display score for TeamB
    private fun displayForTeamB(score: Int){
        binding.teamBScore.text = score.toString()
    }
    //just test for github

}