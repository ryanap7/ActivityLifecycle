package id.ryan.activitylifecyle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
	private lateinit var btnMove: Button
	
	@SuppressLint("MissingInflatedId")
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		println("WAVE onCreate")
		
		btnMove = findViewById(R.id.btnMove)
		
		btnMove.setOnClickListener(this)
	}
	
	override fun onClick(v: View?) {
		when(v?.id){
			R.id.btnMove -> {
				val intent = Intent(this, SecondActivity::class.java)
				startActivity(intent)
			}
		}
	}
	
	override fun onStart() {
		super.onStart()
		println("WAVE onStart")
	}
	
	override fun onResume() {
		super.onResume()
		println("WAVE onResume")
	}
	
	override fun onPause() {
		super.onPause()
		println("WAVE onPause")
	}
	
	override fun onStop() {
		super.onStop()
		println("WAVE onStop")
	}
	
	override fun onRestart() {
		super.onRestart()
		println("WAVE onRestart")
	}
	
	override fun onDestroy() {
		super.onDestroy()
		println("WAVE onDestroy")
	}
}