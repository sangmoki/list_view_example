package com.sangmoki.listview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // String 타입의 가변 배열 변수 생성
        val list_item = mutableListOf<String>()

        // 가변 배열에 아이템 추가
        list_item.add("1번째 아이템")
        list_item.add("2번째 아이템")
        list_item.add("3번째 아이템")

        // ListView 변수 생성
        val listview = findViewById<ListView>(R.id.mainListView)

        // ListViewAdapter 클래스의 객체 생성
        val listAdapter = ListViewAdapter(list_item)

        // ListView activity의 객체의 adapter에 아이템 정보를 담은 listAdapter를 넣어준다.
        listview.adapter = listAdapter

    }
}