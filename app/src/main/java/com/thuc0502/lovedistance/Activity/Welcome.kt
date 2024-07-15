package com.thuc0502.lovedistance.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.thuc0502.lovedistance.BottomSheetLayout.MyBottomSheetDialogFragment
import com.thuc0502.lovedistance.R
import com.thuc0502.lovedistance.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v ,insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left ,systemBars.top ,systemBars.right ,systemBars.bottom)
            insets
        }
        binding.btnLogin.setOnClickListener {
            val bottomSheet = MyBottomSheetDialogFragment()
            bottomSheet.show(supportFragmentManager, bottomSheet.tag)
        }
    }
}