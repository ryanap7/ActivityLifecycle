package id.ryan.activitylifecyle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity(), View.OnClickListener {
	private lateinit var btnMove: Button
	
	@SuppressLint("MissingInflatedId")
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_second)
		println("WAVE onCreate Second Activity")
		
		btnMove = findViewById(R.id.btnMove)
		
		btnMove.setOnClickListener(this)
	}
	
	override fun onClick(v: View?) {
		when(v?.id){
			R.id.btnMove -> {
				val intent = Intent(this, ThirdActivity::class.java)
				startActivity(intent)
			}
		}
	}
	
	override fun onStart() {
		super.onStart()
		println("WAVE onStart Second Activity")
	}
	
	override fun onResume() {
		super.onResume()
		println("WAVE onResume Second Activity")
	}
	
	override fun onPause() {
		super.onPause()
		println("WAVE onPause Second Activity")
	}
	
	override fun onStop() {
		super.onStop()
		println("WAVE onStop Second Activity")
	}
	
	override fun onRestart() {
		super.onRestart()
		println("WAVE onRestart Second Activity")
	}
	
	override fun onDestroy() {
		super.onDestroy()
		println("WAVE onDestroy Second Activity")
	}
}