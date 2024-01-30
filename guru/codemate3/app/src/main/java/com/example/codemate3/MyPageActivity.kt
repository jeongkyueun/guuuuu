package com.example.codemate3

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MyPageActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val part1MenuButton: ImageButton = findViewById(R.id.part1MenuButton)
        val part2MenuButton: ImageButton = findViewById(R.id.part2MenuButton)
        val part3MenuButton: ImageButton = findViewById(R.id.part3MenuButton)
        val part4MenuButton: ImageButton = findViewById(R.id.part4MenuButton)

        part1MenuButton.setOnClickListener {
            startActivity(Intent(this, PartPageActivity::class.java))
        }

        part2MenuButton.setOnClickListener {
            startActivity(Intent(this, PartPageActivity2::class.java))
        }

        part3MenuButton.setOnClickListener {
            startActivity(Intent(this, PartPageActivity3::class.java))
        }

        part4MenuButton.setOnClickListener {
            startActivity(Intent(this, PartPageActivity4::class.java))
        }

        //위에추가


        // Part1 CheckBox 및 체크 이벤트 처리
        val part1Checkbox: CheckBox = findViewById(R.id.part1Checkbox)
        part1Checkbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Part1 체크 시 처리
                part1Checkbox.setBackgroundColor(Color.LTGRAY)
                showToast("Part1이 체크되었습니다.")
            } else {
                // Part1 체크 해제 시 처리
                part1Checkbox.setBackgroundColor(Color.TRANSPARENT)
                showToast("Part1이 해제되었습니다.")
            }
        }

        // Part2 CheckBox 및 체크 이벤트 처리
        val part2Checkbox: CheckBox = findViewById(R.id.part2Checkbox)
        part2Checkbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Part2 체크 시 처리
                part2Checkbox.setBackgroundColor(Color.LTGRAY)
                showToast("Part2가 체크되었습니다.")
            } else {
                // Part2 체크 해제 시 처리
                part2Checkbox.setBackgroundColor(Color.TRANSPARENT)
                showToast("Part2가 해제되었습니다.")
            }
        }

        // Part3 CheckBox 및 체크 이벤트 처리
        val part3Checkbox: CheckBox = findViewById(R.id.part3Checkbox)
        part3Checkbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Part3 체크 시 처리
                part3Checkbox.setBackgroundColor(Color.LTGRAY)
                showToast("Part3이 체크되었습니다.")
            } else {
                // Part3 체크 해제 시 처리
                part3Checkbox.setBackgroundColor(Color.TRANSPARENT)
                showToast("Part3이 해제되었습니다.")
            }
        }

        // Part4 CheckBox 및 체크 이벤트 처리
        val part4Checkbox: CheckBox = findViewById(R.id.part4Checkbox)
        part4Checkbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Part4 체크 시 처리
                part4Checkbox.setBackgroundColor(Color.LTGRAY)
                showToast("Part4가 체크되었습니다.")
            } else {
                // Part4 체크 해제 시 처리
                part4Checkbox.setBackgroundColor(Color.TRANSPARENT)
                showToast("Part4가 해제되었습니다.")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
