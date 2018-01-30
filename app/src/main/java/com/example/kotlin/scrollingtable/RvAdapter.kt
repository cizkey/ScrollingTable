package com.example.kotlin.scrollingtable

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 * Created by kotlin on 18-1-29.
 */
class RvAdapter : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_layout_main) {
    override fun convert(helper: BaseViewHolder, item: String) {
        helper.setText(R.id.tv_data, item)
    }
}
