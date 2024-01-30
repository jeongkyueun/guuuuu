package com.example.codemate3

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class PartPageActivity2 : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page2)
/*
        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            showAddUrlDialog("Part2")
        }*/

        tabUrlTextView = findViewById(R.id.tabUrl)

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "분할정복")//Part2
            addUrlDialog.show()
        }

        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "이분탐색")//Part2
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabLoop).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "스택")//Part2
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabComplexity).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "큐")//Part2
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabSorting).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "우선순위 큐")//Part2
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

/*
package com.example.codemate3

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class PartPageActivity2 : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page2)

        tabUrlTextView = findViewById(R.id.tabUrl)

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
        }


        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabLoop).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabComplexity).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabSorting).setOnClickListener {
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


}
*/