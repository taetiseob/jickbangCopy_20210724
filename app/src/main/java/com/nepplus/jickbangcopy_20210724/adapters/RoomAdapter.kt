package com.nepplus.jickbangcopy_20210724.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.jickbangcopy_20210724.datas.RoomData

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext,resId,mList) {

}