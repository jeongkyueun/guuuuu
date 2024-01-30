package com.example.codemate3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class PartPageActivity4 : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView
    private lateinit var tabUrlStringTextView: TextView // @@@@@@@추가

    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page4)
/*
        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            showAddUrlDialog("Part4")
        }
*/
        tabUrlTextView = findViewById(R.id.tabUrl)

        tabUrlStringTextView = findViewById(R.id.tabStringUrl) // 추가@@@@@@@@

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "동적 프로그래밍")//Part4
            addUrlDialog.show()
        }

        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "그리디 알고리즘")//Part4
            addUrlDialog.show()
        }
        // 이전 버튼 설정
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
    override fun onUrlEntered(enteredUrl: String) {
        // 현재 선택된 탭에 따라서 각 탭의 TextView에 URL을 설정
        when (getCurrentTab()) {
            "동적 프로그래밍" -> tabUrlTextView.text = "URL $enteredUrl"
            "그리디 알고리즘" -> tabUrlStringTextView.text = "URL $enteredUrl"
            // 다른 탭에 대한 처리 추가
        }
    }
//0130 0720에 발견 뭐지 이거?

    private fun getCurrentTab(): String {
        // 현재 선택된 탭을 반환하는 로직 추가
        return "동적 프로그래밍" // 예시로 "동적 프로그래밍"으로 초기화
    }
/*
    override fun onUrlEntered(enteredUrl: String) {
        tabUrlTextView.text = "URL $enteredUrl"
    }

    */

/*
    private fun showAddUrlDialog(topic: String) {
        val addUrlDialog = AddUrlDialog(this, this, topic)
        addUrlDialog.show()
    }*/

    override fun onBackPressed() {
        // 뒤로가기 버튼 눌렀을 때의 동작 정의
        super.onBackPressed()
        finish() // 현재 액티비티 종료
    }
}


/*
package com.example.codemate3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class PartPageActivity4 : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page4)

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
        }

        tabUrlTextView = findViewById(R.id.tabUrl)

        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
        }
        // 이전 버튼 설정
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }


    }

    override fun onUrlEntered(enteredUrl: String) {
        //tabUrlTextView.text = enteredUrl
        // 'URL' 글자와 함께 입력한 URL을 표시
        tabUrlTextView.text = "URL $enteredUrl"
    }
    override fun onBackPressed() {
        // 뒤로가기 버튼 눌렀을 때의 동작 정의
        super.onBackPressed()
        finish() // 현재 액티비티 종료
    }



}*/
