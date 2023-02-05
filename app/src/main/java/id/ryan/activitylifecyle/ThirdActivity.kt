package id.ryan.activitylifecyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThirdActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_third)
	}
	
	override fun onStart() {
		super.onStart()
		println("WAVE onStart Third Activity")
	}
	
	override fun onResume() {
		super.onResume()
		println("WAVE onResume Third Activity")
	}
	
	override fun onPause() {
		super.onPause()
		println("WAVE onPause Third Activity")
	}
	
	override fun onStop() {
		super.onStop()
		println("WAVE onStop Third Activity")
	}
	
	override fun onRestart() {
		super.onRestart()
		println("WAVE onRestart Third Activity")
	}
	
	override fun onDestroy() {
		super.onDestroy()
		println("WAVE onDestroy Third Activity")
	}
}