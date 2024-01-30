package com.example.codemate3

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class PartPageActivity3 : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page3)
/*
        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            showAddUrlDialog("Part3")
        }
*/
        tabUrlTextView = findViewById(R.id.tabUrl)

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "그래프(vertex, edge, node, arc)") //Part3
            addUrlDialog.show()
        }

        findViewById<RelativeLayout>(R.id.tabString).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "BFS")//Part3
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabLoop).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "DFS")//Part3
            addUrlDialog.show()
        }
        findViewById<RelativeLayout>(R.id.tabComplexity).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this, "위상정렬")//Part3
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

class PartPageActivity3 : AppCompatActivity(), OnUrlEnteredListener {

    private lateinit var tabUrlTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_page3)

        findViewById<RelativeLayout>(R.id.addButton).setOnClickListener {
            val addUrlDialog = AddUrlDialog(this, this)
            addUrlDialog.show()
        }

        tabUrlTextView = findViewById(R.id.tabUrl)

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