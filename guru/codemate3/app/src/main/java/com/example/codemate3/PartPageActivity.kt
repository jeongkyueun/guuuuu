package com.example.codemate3

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class PartPageActivity : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page)
/*
        //무조건있어야함 바로아래줄은, 있어야 배열탭이 열림
        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            showAddUrlDialog("Part1")
        }*/
/*
        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            showAddUrlDialog("배열") // 주제를 해당 탭의 이름으로 전달
        }

        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            showAddUrlDialog("문자열") // 주제를 해당 탭의 이름으로 전달
        }*/

        tabUrlTextView = findViewById(R.id.tabUrl)

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "배열")//"Part1"
            addUrlDialog.show()
        }

        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "문자열")//"Part1"
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabLoop).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "반복문과 재귀함수")//"Part1"
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabComplexity).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "계산복잡도")//"Part1"
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabSorting).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "정렬")//"Part1"
            addUrlDialog.show()
        }

        findViewById<RelativeLayout>(R.id.tabBruteforce).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "완전탐색")//"Part1"
            addUrlDialog.show()
        }

        findViewById<RelativeLayout>(R.id.tabNumberTheory).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "정수론")//"Part1"
            addUrlDialog.show()
        }

        // 이전 버튼 설정
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onUrlEntered(enteredUrl: String) {
        tabUrlTextView.text = "URL $enteredUrl"
    }
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


/*package com.example.codemate3

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class PartPageActivity : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView

    //추가1400
    //private lateinit var currentTabTextView: TextView

    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page)

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()

            //openAddUrlDialog("배열")
        }

        tabUrlTextView = findViewById(R.id.tabUrl)

        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
            //openAddUrlDialog("문자열")
        }

        findViewById<RelativeLayout>(R.id.tabLoop).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
            //openAddUrlDialog("반복문과 재귀함수")
        }
        findViewById<RelativeLayout>(R.id.tabComplexity).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()

            //openAddUrlDialog("계산복잡도")
        }
        findViewById<RelativeLayout>(R.id.tabSorting).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()

            //openAddUrlDialog("정렬")
        }
        findViewById<RelativeLayout>(R.id.tabBruteforce).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()

            //openAddUrlDialog("완전탐색")
        }
        findViewById<RelativeLayout>(R.id.tabNumberTheory).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
            //openAddUrlDialog("정수론")
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
    /*
    // 탭 버튼을 클릭했을 때 새로운 다이얼로그 열기
    private fun openAddUrlDialog(tabName: String) {

        //1412

        val addUrlDialog = AddUrlDialog(this, this)
        addUrlDialog.setTitle(tabName)
        addUrlDialog.show()
    }*/



}
*/