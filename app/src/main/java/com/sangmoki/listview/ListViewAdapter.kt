package com.sangmoki.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

// 데이터를 받아주기 위한 Adapter 클래스
// 문자열 데이터를 받기 위해 <String> 타입으로 설정
class ListViewAdapter(val List : MutableList<String>) : BaseAdapter() {

    // 전체 아이템의 개수 반환
    override fun getCount(): Int {
        return List.size
    }

    // 아이템 반환 (리스트에서 몇번째에 자리한 아이템인지)
    override fun getItem(position: Int): Any {
        return List[position]
    }

    // 아이템의 ID 반환
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    // list_view_item에서 설정한 item_list_view 레이아웃을 inflate하여 반환
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView

        // 만약 convertView가 null이라면
        if (convertView == null) {
            // item_list_view 레이아웃을 inflate하여 convertView에 저장
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.list_view_item, parent, false)
        }

        // listViewItem 레이아웃에서 TextView를 찾아 data 변수에 저장
        val data = convertView!!.findViewById<TextView>(R.id.listViewItem)
        // data 변수의 text(android:text)에 List[아이템인덱스]를 넣어준다.
        data.text = List[position]

        // 컨버트뷰를 가져오면 반환해준다.
        return convertView!!
    }

}